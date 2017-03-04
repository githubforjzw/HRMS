package com.yc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackController {
	//进入 后台
	@RequestMapping("/toBack")
	public String toBack() {
		return "back/index";
	}
	
	
	@RequestMapping("/toFirst")
	public String toFirst() {
		return "back/first";
	}
	
	//跳转到后台登录页面
	@RequestMapping("/toBackLogin")
	public String toBackLogin() {
		return "back/backLogin";
	}
		
		

}
