package com.ruoyi.textbook.information.entry.system.service;

import com.ruoyi.textbook.information.entry.system.domain.Publisher;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project RuoYi-Vue
 * @description
 * @date 11/11/2023 20:01:25
 */
public interface IPublisherService {
    public List<Publisher> selectPublisherList(Publisher publisher);
    public int addPublisher(Publisher publisher);
    int updatePublisher(Publisher publisher);

    Publisher selectPublisherByPublisherId(Integer publisherId);

    boolean checkPublisherNameUnique(Publisher publisher);
    public int deletePublisherByIds(Integer[] publisherIds);

}
