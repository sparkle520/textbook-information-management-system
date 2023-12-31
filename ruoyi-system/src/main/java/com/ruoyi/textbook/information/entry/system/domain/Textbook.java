package com.ruoyi.textbook.information.entry.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/12/2023 11:12:31
 */
public class Textbook implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer textbookId;
    private String textbookTitle;
    private String textbookAuthor;
    private Integer publisherId;

    private BigDecimal textbookPrice;

    private Integer textbookCreateBy;
    private Date textbookCreateTime;
    private Integer textbookUpdateBy;
    private Date textbookUpdateTime;
    private String textbookISBN;


    public Integer getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Integer textbookId) {
        this.textbookId = textbookId;
    }

    public String getTextbookTitle() {
        return textbookTitle;
    }

    public void setTextbookTitle(String textbookTitle) {
        this.textbookTitle = textbookTitle;
    }

    public String getTextbookAuthor() {
        return textbookAuthor;
    }

    public void setTextbookAuthor(String textbookAuthor) {
        this.textbookAuthor = textbookAuthor;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public BigDecimal getTextbookPrice() {
        return textbookPrice;
    }

    public void setTextbookPrice(BigDecimal textbookPrice) {
        this.textbookPrice = textbookPrice;
    }

    public Integer getTextbookCreateBy() {
        return textbookCreateBy;
    }

    public void setTextbookCreateBy(Integer textbookCreateBy) {
        this.textbookCreateBy = textbookCreateBy;
    }

    public Date getTextbookCreateTime() {
        return textbookCreateTime;
    }

    public void setTextbookCreateTime(Date textbookCreateTime) {
        this.textbookCreateTime = textbookCreateTime;
    }

    public Integer getTextbookUpdateBy() {
        return textbookUpdateBy;
    }

    public void setTextbookUpdateBy(Integer textbookUpdateBy) {
        this.textbookUpdateBy = textbookUpdateBy;
    }

    public Date getTextbookUpdateTime() {
        return textbookUpdateTime;
    }

    public void setTextbookUpdateTime(Date textbookUpdateTime) {
        this.textbookUpdateTime = textbookUpdateTime;
    }

    public String getTextbookISBN() {
        return textbookISBN;
    }

    public void setTextbookISBN(String textbookISBN) {
        this.textbookISBN = textbookISBN;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "textbookId=" + textbookId +
                ", textbookTitle='" + textbookTitle + '\'' +
                ", textbookAuthor='" + textbookAuthor + '\'' +
                ", publisherId=" + publisherId +
                ", textbookPrice=" + textbookPrice +
                ", textbookCreateBy=" + textbookCreateBy +
                ", textbookCreateTime=" + textbookCreateTime +
                ", textbookUpdateBy=" + textbookUpdateBy +
                ", textbookUpdateTime=" + textbookUpdateTime +
                ", textbookISBN='" + textbookISBN + '\'' +
                '}';
    }
}
