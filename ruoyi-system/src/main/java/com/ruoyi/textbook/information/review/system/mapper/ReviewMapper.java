package com.ruoyi.textbook.information.review.system.mapper;

import com.ruoyi.textbook.information.review.system.domain.vo.ReviewVo;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/22/2023 15:17:24
 */
public interface ReviewMapper {
ReviewVo selectReviewVoByTextbookId(Integer textbookId);
int countByTextbookId(Integer textbookId);

int insertReviewByTextbookId(Integer textbookId);
}
