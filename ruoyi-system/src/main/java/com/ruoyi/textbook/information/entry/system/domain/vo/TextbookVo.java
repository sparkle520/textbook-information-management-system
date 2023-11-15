package com.ruoyi.textbook.information.entry.system.domain.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/14/2023 15:07:49
 */
public class TextbookVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer textbookId;
    private String textbookTitle;
    private String textbookAuthor;
    private String publisherName;

    private BigDecimal textbookPrice;

    private String textbookCreateBy;
    private Date textbookCreateTime;
    private String textbookUpdateBy;
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

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public BigDecimal getTextbookPrice() {
        return textbookPrice;
    }

    public void setTextbookPrice(BigDecimal textbookPrice) {
        this.textbookPrice = textbookPrice;
    }

    public String getTextbookCreateBy() {
        return textbookCreateBy;
    }

    public void setTextbookCreateBy(String textbookCreateBy) {
        this.textbookCreateBy = textbookCreateBy;
    }

    public Date getTextbookCreateTime() {
        return textbookCreateTime;
    }

    public void setTextbookCreateTime(Date textbookCreateTime) {
        this.textbookCreateTime = textbookCreateTime;
    }

    public String getTextbookUpdateBy() {
        return textbookUpdateBy;
    }

    public void setTextbookUpdateBy(String textbookUpdateBy) {
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
        return "TextbookVo{" +
                "textbookId=" + textbookId +
                ", textbookTitle='" + textbookTitle + '\'' +
                ", textbookAuthor='" + textbookAuthor + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", textbookPrice=" + textbookPrice +
                ", textbookCreateBy='" + textbookCreateBy + '\'' +
                ", textbookCreateTime=" + textbookCreateTime +
                ", textbookUpdateBy='" + textbookUpdateBy + '\'' +
                ", textbookUpdateTime=" + textbookUpdateTime +
                ", textbookISBN='" + textbookISBN + '\'' +
                '}';
    }
}
