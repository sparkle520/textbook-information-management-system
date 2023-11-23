package com.ruoyi.web.controller.textbook.information.review;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.textbook.information.review.system.domain.vo.ReviewVo;
import com.ruoyi.textbook.information.review.system.service.IReviewService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/22/2023 16:01:53
 */
@RestController
@RequestMapping("textbook/review")
public class ReviewController extends BaseController {
    @Resource
    IReviewService reviewService;

    @Resource
    ISysRoleService roleService;
    @PreAuthorize("@ss.hasPermi('textbook:review:query')")
    @GetMapping(value = "/{textbookId}")
    public AjaxResult getReviewVoByTextbookId(@PathVariable Integer textbookId)
    {
        ReviewVo reviewVo = reviewService.selectReviewVoByTextbookId(textbookId);
        Long userId = getUserId();
        if (userId == null) {
            return AjaxResult.error();

        }

        else {
            LoginUser loginUser = SecurityUtils.getLoginUser();
            if (StringUtils.isNull(loginUser) || CollectionUtils.isEmpty(loginUser.getUser().getRoles())) {
                return AjaxResult.success(reviewVo);

            }
            for (SysRole sysRole : loginUser.getUser().getRoles()) {
                String roleKey = sysRole.getRoleKey();
                if (roleKey.equals(StringUtils.trim("teacher"))) {
                    reviewVo.setPrincipalDate(new Date());
                    reviewVo.setSignaturePrincipal(getUsername());
                    return AjaxResult.success(reviewVo);
                }
                else if (roleKey.equals(StringUtils.trim("leader"))) {
                    reviewVo.setLeaderDate(new Date());
                    reviewVo.setSignatureLeader(getUsername());
                    return AjaxResult.success(reviewVo);
                }
            }
            return AjaxResult.success(reviewVo);

        }
    }
//             List<SysRole> roleList = roleService.selectRolesByUserId(userId);
//             for(SysRole role:roleList)
//             {
                // System.out.println(role.getRoleName());
//                 if(role.getRoleName().equals("leader"))
//                 {

//                 }else if(role.getRoleName().equals("teacher"))
//                 {
//
//                 }
    //         }

    }

