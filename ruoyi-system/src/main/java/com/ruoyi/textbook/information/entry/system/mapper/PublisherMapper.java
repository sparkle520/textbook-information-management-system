package com.ruoyi.textbook.information.entry.system.mapper;

import com.ruoyi.system.domain.SysPost;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/11/2023 18:36:21
 */
public interface PublisherMapper {
    public int updatePublisher(Publisher publisher);
    public int deletePublisherById(Integer publisherId);


    int insertPublisher(Publisher publisher);
    public int deletePublisherByIds(Integer[] publisherIds);
    String getPublisherNameByPublisherId(Integer publisherId);

    Publisher selectPublisherByPublisherId(Integer publisherId);
    //动态查询
    List<Publisher> selectPublisherList(Publisher publisher);
    int getPublisherIdByPublisherName(String publisherName);

    int countByPublisherName(String publisherName);
}
