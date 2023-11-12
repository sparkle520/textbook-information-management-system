package com.ruoyi.web.controller.tool;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LT
 * @version 1.0
 * @project RuoYi-Vue
 * @description
 * @date 11/10/2023 11:01:07
 */
@Api("HELLO WORLD")
@RestController
@RequestMapping("/hello")
public class MYTestController {
    @ApiOperation("HELLO WORLD")
    @GetMapping("/world")
    public String hello(Integer id, String name) {
    return "HELLO WORLD";
    }
}
