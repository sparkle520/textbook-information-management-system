package com.ruoyi.textbook.information.review.system.service;

import com.ruoyi.textbook.information.review.system.domain.vo.ReviewVo;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/22/2023 14:58:38
 */
public interface IReviewService {

    ReviewVo selectReviewVoByTextbookId(Integer textbookId);
}
