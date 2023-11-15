package com.ruoyi.web.controller.textbook.information.entry.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysPost;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.service.IPublisherService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/11/2023 20:12:09
 */
@RestController
@RequestMapping("textbook/publisher")
public class PublisherController extends BaseController {
    @Resource
    private IPublisherService publisherService;

    @GetMapping("/list")
    public TableDataInfo publisherList(Publisher publisher)
    {
        startPage();

        List<Publisher> list =  publisherService.selectPublisherList(publisher);
        return getDataTable(list);
    }
    @GetMapping(value = "/{publisherId}")
    public AjaxResult getPublisherByPublisherId(@PathVariable Integer publisherId)
    {
        return AjaxResult.success(publisherService.selectPublisherByPublisherId(publisherId));
    }
    @PostMapping("/addPublisher")
    @Log(title = "出版社管理", businessType = BusinessType.EXPORT)
    public AjaxResult add(@Validated @RequestBody Publisher publisher)
    {
        if (!publisherService.checkPublisherNameUnique(publisher) )
        {
            return error("新增出版社'" + publisher.getPublisherName() + "'失败，出版社名称已存在");
        }

        return toAjax(publisherService.addPublisher(publisher));
    }
    //@PreAuthorize("@ss.hasPermi('system:post:edit')")
    //@Log(title = "岗位管理", businessType = BusinessType.UPDATE)
    @PutMapping("/updatePublisher")
    public AjaxResult edit(@Validated @RequestBody Publisher publisher)
    {
        if (!publisherService.checkPublisherNameUnique(publisher))
        {
            return error("修改出版社名称'" + publisher.getPublisherName() + "'失败，出版社名称已存在");
        }
        return toAjax(publisherService.updatePublisher(publisher));
    }

//    @PreAuthorize("@ss.hasPermi('system:post:remove')")
//    @Log(title = "岗位管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/delPublisher/{publisherIds}")
    public AjaxResult remove(@PathVariable Integer[] publisherIds)
    {
        return toAjax(publisherService.deletePublisherByIds(publisherIds));
    }
}
