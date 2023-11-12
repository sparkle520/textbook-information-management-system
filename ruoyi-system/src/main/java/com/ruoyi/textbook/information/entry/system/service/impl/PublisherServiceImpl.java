package com.ruoyi.textbook.information.entry.system.service.impl;

import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.mapper.PublisherMapper;
import com.ruoyi.textbook.information.entry.system.service.IPublisherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project RuoYi-Vue
 * @description
 * @date 11/11/2023 20:05:47
 */
@Service
public class PublisherServiceImpl implements IPublisherService {

    @Resource
    PublisherMapper publisherMapper;
    @Override
    public List<Publisher> selectPublisherList(Publisher publisher) {
        return publisherMapper.selectPublisherList(publisher);
    }

    @Override
    public int addPublisher(Publisher publisher) {
        return publisherMapper.insertPublisher(publisher);
    }

    @Override
    public int updatePublisher(Publisher publisher) {
        return publisherMapper.updatePublisher(publisher);
    }

    @Override
    public Publisher selectPublisherByPublisherId(Integer publisherId) {
        return publisherMapper.selectPublisherByPublisherId(publisherId);
    }

    //TODO 需要实现方法
    @Override
    public boolean checkPublisherNameUnique(Publisher publisher) {
        return true;
    }

    @Override
    public int deletePublisherByIds(Integer[] publisherIds) {
        return publisherMapper.deletePublisherByIds(publisherIds);
    }
}
