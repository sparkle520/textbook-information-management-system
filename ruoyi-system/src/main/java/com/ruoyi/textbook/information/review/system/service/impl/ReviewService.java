package com.ruoyi.textbook.information.review.system.service.impl;

import com.ruoyi.textbook.information.review.system.domain.vo.ReviewVo;
import com.ruoyi.textbook.information.review.system.mapper.ReviewMapper;
import com.ruoyi.textbook.information.review.system.service.IReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/22/2023 14:59:01
 */
@Service
public class ReviewService implements IReviewService {
    @Resource
    ReviewMapper reviewMapper;
    @Override
    public ReviewVo selectReviewVoByTextbookId(Integer textbookId) {
        int count = reviewMapper.countByTextbookId(textbookId);
        if(count>0)
        {
            ReviewVo reviewVo =  reviewMapper.selectReviewVoByTextbookId(textbookId);
            if(reviewVo.getLeaderDate() == null)
            {
                reviewVo.setLeaderDate(new Date());
            }
            if(reviewVo.getPrincipalDate() == null)
            {
                reviewVo.setPrincipalDate(new Date());
            }
            return reviewVo;
        }else{
             reviewMapper.insertReviewByTextbookId(textbookId);
            return reviewMapper.selectReviewVoByTextbookId(textbookId);
        }
    }
}
