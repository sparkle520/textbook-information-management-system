package com.ruoyi.web.controller.textbook.information.feedback;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.textbook.information.feedback.system.domain.Feedback;
import com.ruoyi.textbook.information.feedback.system.service.IFeedbackService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/21/2023 10:12:34
 */
@RestController
@RequestMapping("textbook/feedback")
public class FeedbackController extends BaseController {

    @Resource
    IFeedbackService feedbackService;

    @GetMapping("/list")
    public TableDataInfo feedbackList(Feedback feedback)
    {
        startPage();
        List<Feedback> list = feedbackService.selectFeedbackList(feedback);
        return getDataTable(list);
    }

//    @GetMapping("/plist")
//    public AjaxResult publisherList()
//    {
//        return AjaxResult.success(publisherService.getPublisherIdAndPublisherName());
//    }
//
//    @GetMapping(value = "/{publisherId}")
//    public AjaxResult getPublisherByPublisherId(@PathVariable Integer publisherId)
//    {
//        return AjaxResult.success(publisherService.selectPublisherByPublisherId(publisherId));
//    }
//
    @PostMapping("/addFeedback")
    //@Log(title = "出版社管理", businessType = BusinessType.EXPORT)
    public AjaxResult add(@Validated @RequestBody Feedback feedback)
    {
//        if (!publisherService.checkPublisherNameUnique(publisher) )
//        {
//            return error("新增出版社'" + publisher.getPublisherName() + "'失败，出版社名称已存在");
//        }

        return toAjax(feedbackService.addFeedback(feedback));
    }
//
//    //@PreAuthorize("@ss.hasPermi('system:post:edit')")
//    //@Log(title = "岗位管理", businessType = BusinessType.UPDATE)
//    @PutMapping("/updatePublisher")
//    public AjaxResult edit(@Validated @RequestBody Publisher publisher)
//    {
////        if (!publisherService.checkPublisherNameUnique(publisher))
////        {
////            return error("修改出版社名称'" + publisher.getPublisherName() + "'失败，出版社名称已存在");
////        }
//        return toAjax(publisherService.updatePublisher(publisher));
//    }
//
    //    @PreAuthorize("@ss.hasPermi('system:post:remove')")
//    @Log(title = "岗位管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/delFeedback/{feedbackIds}")
    public AjaxResult remove(@PathVariable int[] feedbackIds)
    {
        return toAjax(feedbackService.deleteFeedbackByIds(feedbackIds));
    }
}
