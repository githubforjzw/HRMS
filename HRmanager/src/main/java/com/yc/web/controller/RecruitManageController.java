package com.yc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecruitManageController {
	//进入 后台
	@RequestMapping("/toPosition")
	public String toPosition() {
		return "back/recruitManage/position";
	}
	
	

}
