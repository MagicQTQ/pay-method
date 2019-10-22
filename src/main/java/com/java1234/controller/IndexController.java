package com.java1234.controller;

import org.apache.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页请求
 * @author Administrator
 *
 */
@Controller
public class IndexController {

	/**
	 * 网页根目录请求
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView root(HttpServletResponse response){
		ModelAndView mav=new ModelAndView();

		mav.addObject("title", "在线支付_Java知识分享网");
		response.setHeader("user-agent","android");

		System.out.println(response.getHeaderNames());
		System.out.println(response.getStatus());
		mav.setViewName("index");
		return mav;
	}
}
