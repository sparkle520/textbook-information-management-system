package com.ruoyi.textbook.information.entry.system.service;

import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.domain.Textbook;
import com.ruoyi.textbook.information.entry.system.domain.vo.TextbookVo;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/12/2023 15:32:10
 */
public interface ITextbookService {
    public List<TextbookVo> selectTextbookList(Textbook textbook);
    public int addTextbook(TextbookVo textbook);
    Boolean checkTextbookTitleUnique(String textbookTitle,Integer textbookId);
    int updateTextbook(TextbookVo textbookVo);

    TextbookVo selectTextbookByTextbookId(Integer textbookId);

    public int deleteTextbookByTextbookIds(Integer[] textbookIds);


}
