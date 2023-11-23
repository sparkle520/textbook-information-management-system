package com.ruoyi.textbook.information.feedback.system.service;

import com.ruoyi.textbook.information.feedback.system.domain.Feedback;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/21/2023 10:23:55
 */
public interface IFeedbackService {
    List<Feedback> selectFeedbackList(Feedback feedback);

    int deleteFeedbackByIds(int[] feedbackIds);

    int addFeedback(Feedback feedback);
}
