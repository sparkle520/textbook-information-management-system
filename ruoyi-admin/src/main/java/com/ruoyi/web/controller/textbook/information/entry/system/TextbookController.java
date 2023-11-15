package com.ruoyi.web.controller.textbook.information.entry.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import com.ruoyi.textbook.information.entry.system.domain.Textbook;
import com.ruoyi.textbook.information.entry.system.domain.vo.TextbookVo;
import com.ruoyi.textbook.information.entry.system.service.ITextbookService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/12/2023 15:34:51
 *
 */
@RestController
@RequestMapping("textbook/textbookInfo")
public class TextbookController extends BaseController {
    @Resource
    private ITextbookService textbookService;


    @GetMapping("/list")
    public TableDataInfo textbookList(Textbook textbook)
    {
        startPage();
        List<TextbookVo> list =  textbookService.selectTextbookList(textbook);
        return getDataTable(list);
    }
    @PostMapping("/addTextbook")
    @Log(title = "教材信息", businessType = BusinessType.EXPORT)
    public AjaxResult add(@Validated @RequestBody TextbookVo textbookVo)
    {
        if (!textbookService.checkTextbookTitleUnique(textbookVo.getTextbookTitle() , textbookVo.getTextbookId()))
        {
            return error("新增教材'" + textbookVo.getTextbookTitle() + "'失败，教材名称已存在");
        }
        return toAjax(textbookService.addTextbook(textbookVo));
    }
    @GetMapping(value = "/{textbookId}")
    public AjaxResult getTextbookByTextbookId(@PathVariable Integer textbookId)
    {
        return AjaxResult.success(textbookService.selectTextbookByTextbookId(textbookId));
    }
    @DeleteMapping("/delTextbook/{textbookIds}")
    public AjaxResult remove(@PathVariable Integer[] textbookIds)
    {
        return toAjax(textbookService.deleteTextbookByTextbookIds(textbookIds));
    }
    @PutMapping("/updateTextbook")
    public AjaxResult edit(@Validated @RequestBody TextbookVo textbookVo)
    {
        if (!textbookService.checkTextbookTitleUnique(textbookVo.getTextbookTitle(), textbookVo.getTextbookId()))
        {
            return error("修改教材名称'" + textbookVo.getTextbookTitle() + "'失败，教材名称已存在");
        }
        int res = textbookService.updateTextbook(textbookVo);
        if(res == -1)
        {
            return AjaxResult.error("教材信息表中存在删除的出版社信息，删除失败！");
        }
        return toAjax(res);
    }
}
