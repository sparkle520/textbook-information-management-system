package com.ruoyi.textbook.information.entry.system.domain;

import java.io.Serializable;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/11/2023 18:15:17
 */

public class Publisher implements Serializable  {
    private static final long serialVersionUID = 1L;

    private Integer publisherId;
    private String publisherName;
    private String publisherPhone;
    private String publisherISBN;
    private String publisherContactName;
    private String publisherAddress;

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherPhone() {
        return publisherPhone;
    }

    public void setPublisherPhone(String publisherPhone) {
        this.publisherPhone = publisherPhone;
    }

    public String getPublisherISBN() {
        return publisherISBN;
    }

    public void setPublisherISBN(String publisherISBN) {
        this.publisherISBN = publisherISBN;
    }

    public String getPublisherContactName() {
        return publisherContactName;
    }

    public void setPublisherContactName(String publisherContactName) {
        this.publisherContactName = publisherContactName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", publisherName='" + publisherName + '\'' +
                ", publisherPhone='" + publisherPhone + '\'' +
                ", publisherISBN='" + publisherISBN + '\'' +
                ", publisherContactName='" + publisherContactName + '\'' +
                ", publisherAddress='" + publisherAddress + '\'' +
                '}';
    }
}
