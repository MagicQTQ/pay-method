package com.java1234.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(description = "首页请求")
public class IndexController {

    /**
     * 网页根目录请求
     */
    @GetMapping("/")
    @ApiOperation("网页根目录请求")
    public ModelAndView root() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "在线支付_Index");
        mav.setViewName("index");
        return mav;
    }
}
