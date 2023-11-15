package com.ruoyi.textbook.information.entry.system.mapper;

import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.domain.Textbook;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/12/2023 11:22:55
 */
public interface TextbookMapper {

    List<Textbook> selectTextbookList(Textbook textbook);
    int insertTextbook(Textbook textbook);
    int countByTextbookTitle(String textbookTitle);
    int countByPublisherId(Integer publisherId);
    public int updateTextbook(Textbook textbook);

    Textbook selectTextbookByTextbookId(Integer textbookId);
    public int deleteTextbookByTextbookIds(Integer[] textbookIds);

}
