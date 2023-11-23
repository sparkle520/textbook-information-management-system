package com.ruoyi.textbook.information.review.system.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/22/2023 14:41:27
 */
public class Review implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer reviewId;

    private Integer textbookId;

    private String courseName;

    private String courseProperty;

    private String useObject;

    private String selectReason;

    private String signaturePrincipal;

    private Date principalDate;

    private String signatureLeader;

    private String approvalOpinion;

    private Date leaderDate;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(Integer textbookId) {
        this.textbookId = textbookId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseProperty() {
        return courseProperty;
    }

    public void setCourseProperty(String courseProperty) {
        this.courseProperty = courseProperty;
    }

    public String getUseObject() {
        return useObject;
    }

    public void setUseObject(String useObject) {
        this.useObject = useObject;
    }

    public String getSelectReason() {
        return selectReason;
    }

    public void setSelectReason(String selectReason) {
        this.selectReason = selectReason;
    }

    public String getSignaturePrincipal() {
        return signaturePrincipal;
    }

    public void setSignaturePrincipal(String signaturePrincipal) {
        this.signaturePrincipal = signaturePrincipal;
    }

    public Date getPrincipalDate() {
        return principalDate;
    }

    public void setPrincipalDate(Date principalDate) {
        this.principalDate = principalDate;
    }

    public String getSignatureLeader() {
        return signatureLeader;
    }

    public void setSignatureLeader(String signatureLeader) {
        this.signatureLeader = signatureLeader;
    }

    public String getApprovalOpinion() {
        return approvalOpinion;
    }

    public void setApprovalOpinion(String approvalOpinion) {
        this.approvalOpinion = approvalOpinion;
    }

    public Date getLeaderDate() {
        return leaderDate;
    }

    public void setLeaderDate(Date leaderDate) {
        this.leaderDate = leaderDate;
    }
}
