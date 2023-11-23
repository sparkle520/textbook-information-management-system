package com.ruoyi.textbook.information.feedback.system.mapper;

import com.ruoyi.textbook.information.feedback.system.domain.Feedback;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/21/2023 11:00:34
 */
public interface FeedbackMapper {

    List<Feedback> selectFeedbackList(Feedback feedback);
    int deleteByFeedbackIds(int[] feedbackIds);

    int insertFeedback(Feedback feedback);
}
