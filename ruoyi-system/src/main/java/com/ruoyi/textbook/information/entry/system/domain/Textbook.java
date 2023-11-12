package com.ruoyi.textbook.information.entry.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author LT
 * @version 1.0
 * @project RuoYi-Vue
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
    private Timestamp textbookCreateTime;
    private Integer textbookUpdateBy;
    private Timestamp textbookUpdateTime;


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

    public Timestamp getTextbookCreateTime() {
        return textbookCreateTime;
    }

    public void setTextbookCreateTime(Timestamp textbookCreateTime) {
        this.textbookCreateTime = textbookCreateTime;
    }

    public Integer getTextbookUpdateBy() {
        return textbookUpdateBy;
    }

    public void setTextbookUpdateBy(Integer textbookUpdateBy) {
        this.textbookUpdateBy = textbookUpdateBy;
    }

    public Timestamp getTextbookUpdateTime() {
        return textbookUpdateTime;
    }

    public void setTextbookUpdateTime(Timestamp textbookUpdateTime) {
        this.textbookUpdateTime = textbookUpdateTime;
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
                '}';
    }
}
