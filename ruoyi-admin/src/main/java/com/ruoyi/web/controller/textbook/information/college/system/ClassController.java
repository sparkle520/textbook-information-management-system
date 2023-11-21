package com.ruoyi.web.controller.textbook.information.college.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.textbook.information.college.system.domain.Classes;
import com.ruoyi.textbook.information.college.system.domain.Major;
import com.ruoyi.textbook.information.college.system.domain.vo.ClassVo;
import com.ruoyi.textbook.information.college.system.service.IClassService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 20:28:24
 */
@RestController
@RequestMapping("textbook/class")
public class ClassController extends BaseController {
    @Resource
    IClassService classService;
    @GetMapping("/list")
    public TableDataInfo majorList(ClassVo classVo)
    {
        startPage();
        List<ClassVo> list =  classService.selectClassList(classVo);
        return getDataTable(list);
    }
    @GetMapping(value = "/{classId}")
    public AjaxResult getClassByClassId(@PathVariable Integer classId)
    {
        return AjaxResult.success(classService.selectClassByClassId(classId));
    }
    @PostMapping("/addClass")
    //@Log(title = "出版社管理", businessType = BusinessType.EXPORT)
    public AjaxResult add(@Validated @RequestBody Classes classes)
    {
        return toAjax(classService.addClass(classes));
    }
    @DeleteMapping("/delClass/{classIds}")
    public AjaxResult remove(@PathVariable Integer[] classIds)
    {
        return toAjax(classService.deleteClassByIds(classIds));
    }
    @PutMapping("/updateClass")
    public AjaxResult edit(@Validated @RequestBody Classes classes)
    {
//        if (!majorService.checkMajorNameUnique(major))
//        {
//            return error("修改专业名称'" + major.getMajorName() + "'失败，专业名称已存在");
//        }
//        int res =
//        if(res == -1)
//        {
//            return AjaxResult.error("xx表中存在删除的信息，删除失败！");
//        }
        return toAjax( classService.updateClass(classes));
    }
}
