package com.yc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumanResourceFileController {

	//跳转到人力资源档案管理登记页面
	@RequestMapping("/toHumanResourceFileLoad")
	public String toHumanResourceFileLoad() {
		return "back/humanResourceFile/humanResourceFileLoad";	
	}
	
	//跳转到人力资源档案登记复核
	@RequestMapping("/toHumanResourceFileCheck")
	public String toHumanResourceFileCheck() {
		return "back/humanResourceFile/humanResourceFileCheck";	
	}

	
}
