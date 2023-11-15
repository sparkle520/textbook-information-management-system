package com.ruoyi.textbook.information.entry.system.service.impl;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.domain.Textbook;
import com.ruoyi.textbook.information.entry.system.domain.vo.TextbookVo;
import com.ruoyi.textbook.information.entry.system.mapper.PublisherMapper;
import com.ruoyi.textbook.information.entry.system.mapper.TextbookMapper;
import com.ruoyi.textbook.information.entry.system.service.ITextbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.apache.commons.lang3.SystemUtils.getUserName;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/12/2023 15:33:51
 */
@Service
public class TextbookServiceImpl implements ITextbookService {
    @Resource
    TextbookMapper textbookMapper;
    @Resource
    PublisherMapper publisherMapper;
//    @Resource
//    SysUserMapper userMapper;
    @Override
    public List<TextbookVo> selectTextbookList(Textbook textbook) {
        List<TextbookVo> textbookVoList = new ArrayList<>();
        List<Textbook> textbookList =  textbookMapper.selectTextbookList(textbook);
        for (Textbook book : textbookList
             ) {
            TextbookVo textbookVo = new TextbookVo();
            Integer publisherId = book.getPublisherId();

            BeanUtils.copyProperties(book,textbookVo);
            textbookVo.setPublisherName(publisherMapper.getPublisherNameByPublisherId(publisherId));
            textbookVoList.add(textbookVo);
        }
        return textbookVoList;
    }

    @Override
    public int addTextbook(TextbookVo textbookVo) {
        Textbook textbook = new Textbook();
        int count = publisherMapper.countByPublisherName(textbookVo.getPublisherName());
        if(textbookVo.getPublisherName() == null || textbookVo.getPublisherName().isEmpty())
        {
            BeanUtils.copyProperties(textbookVo,textbook);
            textbook.setTextbookCreateBy(getUserId());
           return  textbookMapper.insertTextbook(textbook);
        }
        if(count > 0)
        {
           int publisherId =  publisherMapper.getPublisherIdByPublisherName(textbookVo.getPublisherName());
           BeanUtils.copyProperties(textbookVo,textbook);
           textbook.setPublisherId(publisherId);
           textbook.setTextbookCreateBy(getUserId());
           return textbookMapper.insertTextbook(textbook);
        }else{
            Publisher publisher = new Publisher();
            publisher.setPublisherName(textbookVo.getPublisherName());
            int res = publisherMapper.insertPublisher(publisher);
            if(res > 0 )
            {
               Integer pId =  publisherMapper.getPublisherIdByPublisherName(publisher.getPublisherName());
                BeanUtils.copyProperties(textbookVo,textbook);
                textbook.setPublisherId(pId);
                textbook.setTextbookCreateBy(getUserId());
                return textbookMapper.insertTextbook(textbook);
            }else{
                return -1;
            }
        }

    }

    @Override
    public Boolean checkTextbookTitleUnique(String textbookTitle,Integer textbookId) {
        Textbook t = textbookMapper.selectTextbookByTextbookId(textbookId);
        if(t.getTextbookTitle().equals(textbookTitle))
        {
            return true;
        }
        int count = textbookMapper.countByTextbookTitle(textbookTitle);
       return count <= 0;
    }

    @Override
    public int updateTextbook(TextbookVo textbookVo) {
        Textbook textbook = new Textbook();
        BeanUtils.copyProperties(textbookVo,textbook);
        if(textbookVo.getPublisherName() == null || textbookVo.getPublisherName().isEmpty())
        {
            textbook.setTextbookUpdateBy(getUserId());
            return textbookMapper.updateTextbook(textbook);
        }else{
            int count = publisherMapper.countByPublisherName(textbookVo.getPublisherName());
            if(count >= 0)
            {
                int publisherId =  publisherMapper.getPublisherIdByPublisherName(textbookVo.getPublisherName());
                BeanUtils.copyProperties(textbookVo,textbook);
                textbook.setPublisherId(publisherId);
                textbook.setTextbookCreateBy(getUserId());
                return textbookMapper.updateTextbook(textbook);
            }else{
                Publisher publisher = new Publisher();
                publisher.setPublisherName(textbookVo.getPublisherName());
                int res = publisherMapper.insertPublisher(publisher);
                if(res > 0 )
                {
                    Integer pId =  publisherMapper.getPublisherIdByPublisherName(publisher.getPublisherName());
                    BeanUtils.copyProperties(textbookVo,textbook);
                    textbook.setPublisherId(pId);
                    textbook.setTextbookUpdateBy(getUserId());
                    return textbookMapper.updateTextbook(textbook);
                }else{
                    return -1;
                }
            }

        }
    }

    @Override
    public TextbookVo selectTextbookByTextbookId(Integer textbookId) {
        TextbookVo textbookVo = new TextbookVo();
        Textbook textbook = textbookMapper.selectTextbookByTextbookId(textbookId);
        if(textbook.getPublisherId() == null || textbookId == 0)
        {
            BeanUtils.copyProperties(textbook,textbookVo);
        }else{
            String publisherName = publisherMapper.getPublisherNameByPublisherId(textbook.getPublisherId());
            BeanUtils.copyProperties(textbook,textbookVo);
            textbookVo.setPublisherName(publisherName);
        }
        return textbookVo;
    }

    @Override
    public int deleteTextbookByTextbookIds(Integer[] textbookIds) {
        return textbookMapper.deleteTextbookByTextbookIds(textbookIds);
    }

    public LoginUser getLoginUser()
    {
        return SecurityUtils.getLoginUser();
    }

    /**
     * 获取登录用户id
     */
    public Integer getUserId()
    {
        return Math.toIntExact(getLoginUser().getUserId());
    }
    public String getUsername()
    {
        return getLoginUser().getUsername();
    }

}
