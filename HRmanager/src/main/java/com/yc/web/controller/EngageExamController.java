package com.yc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yc.bean.Config_major;
import com.yc.bean.Config_major_kind;
import com.yc.bean.Engage_exam;
import com.yc.biz.EngageExamBiz;
import com.yc.web.utils.EasyuiJsonModel;

@Controller
public class EngageExamController {
		private static final Log logger = LogFactory.getLog(EngageExamController.class);
		private Gson gson=new Gson();
		private EasyuiJsonModel easyuiJsonModel=new EasyuiJsonModel();;
		private EngageExamBiz engageExamBiz;
		@Resource(name="engageExamBizImpl")
		public void setEngageExamBiz(EngageExamBiz engageExamBiz) {
			this.engageExamBiz = engageExamBiz;
		}
	
		//跳转到试卷管理页面
		@RequestMapping("/toEngageExamManager")
		public String toHumanResourceFileLoad() {
			return "back/Exam/EngageExamManager";	
		}
		
		//跳转到试题管理页面
		@RequestMapping("/toSubjectsManager")
		public String toHumanResourceFileCheck() {
			return "back/Exam/SubjectsManager";	
		}
		@RequestMapping(value="/selectExam",produces="text/html;charset=UTF-8")
		public @ResponseBody String getAllExam() {
			Engage_exam engage_exam=new Engage_exam();
			Config_major config_major=new Config_major();
			config_major.setConfig_major_kind(new Config_major_kind());
			engage_exam.setConfig_major(config_major);
			List<Engage_exam> list=this.engageExamBiz.selectEngageExam(engage_exam);
			System.out.println(list);
			easyuiJsonModel.setTotal(String.valueOf(list.size()));
			easyuiJsonModel.setRows(list);
			System.out.println(gson.toJson(easyuiJsonModel));
			return gson.toJson(easyuiJsonModel);
		}
		

}
