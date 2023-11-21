package com.ruoyi.web.controller.textbook.information.college.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.textbook.information.college.system.domain.Major;
import com.ruoyi.textbook.information.college.system.service.IMajorService;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.domain.vo.TextbookVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 14:26:07
 */
@RestController
@RequestMapping("textbook/major")
public class MajorController extends BaseController {
    @Resource
    IMajorService majorService;

    @GetMapping("/list")
    public TableDataInfo majorList(Major major)
    {
        startPage();
        List<Major> list =  majorService.selectMajorList(major);
        return getDataTable(list);
    }
    @GetMapping("/plist")
    public AjaxResult majorList()
    {
        return AjaxResult.success(majorService.selectMajorListHashMap());
    }
    @GetMapping(value = "/{majorId}")
    public AjaxResult getMajorByMajorId(@PathVariable Integer majorId)
    {
        return AjaxResult.success(majorService.selectMajorByMajorId(majorId));
    }
    @PostMapping("/addMajor")
    //@Log(title = "出版社管理", businessType = BusinessType.EXPORT)
    public AjaxResult add(@Validated @RequestBody Major major)
    {
        return toAjax(majorService.addMajor(major));
    }
    @DeleteMapping("/delMajor/{majorIds}")
    public AjaxResult remove(@PathVariable Integer[] majorIds)
    {
        return toAjax(majorService.deleteMajorByIds(majorIds));
    }
    @PutMapping("/updateMajor")
    public AjaxResult edit(@Validated @RequestBody Major major)
    {
        if (!majorService.checkMajorNameUnique(major))
        {
            return error("修改专业名称'" + major.getMajorName() + "'失败，专业名称已存在");
        }
        int res = majorService.updateMajor(major);
        if(res == -1)
        {
            return AjaxResult.error("xx表中存在删除的信息，删除失败！");
        }
        return toAjax(res);
    }
}
