package com.ruoyi.textbook.information.feedback.system.service.impl;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.textbook.information.feedback.system.domain.Feedback;
import com.ruoyi.textbook.information.feedback.system.mapper.FeedbackMapper;
import com.ruoyi.textbook.information.feedback.system.service.IFeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/21/2023 10:24:15
 */
@Service
public class FeedbackServiceImpl implements IFeedbackService {
    @Resource
    FeedbackMapper feedbackMapper;
    @Override
    public List<Feedback> selectFeedbackList(Feedback feedback) {
        return feedbackMapper.selectFeedbackList(feedback);
    }

    @Override
    public int deleteFeedbackByIds(int[] feedbackIds) {
        return feedbackMapper.deleteByFeedbackIds(feedbackIds);
    }

    @Override
    public int addFeedback(Feedback feedback) {
        feedback.setFeedbackName(getUsername());
        return feedbackMapper.insertFeedback(feedback);
    }
    public LoginUser getLoginUser()
    {
        return SecurityUtils.getLoginUser();
    }

    /**
     * 获取登录用户id
     */
    public Integer getUserId()
    {
        return Math.toIntExact(getLoginUser().getUserId());
    }
    public String getUsername()
    {
        return getLoginUser().getUsername();
    }
}
