package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Major_change implements Serializable{

	private static final long serialVersionUID = -3740287144209273254L;

	private Integer mch_id;
	private Human_file human_file;	//一二三级的编号和名称 + 四个职位分类和名称 + 档案编号 + 姓名 + 薪酬标准编号 名称 总额
	
	private Config_file_third_kind newconfig_file_third_kind;	//新的一二三级编号和名称
	private Config_major newconfig_major;	//新的职位编号和名称
	private Salary_standard newsalary_standard;	//新薪酬标准 单 编号 名称  总额
	private String change_reason ;
	private String check_reason;
	private Integer check_status ;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	
	@Override
	public String toString() {
		return "Major_change [mch_id=" + mch_id + ", human_file=" + human_file + ", newconfig_file_third_kind="
				+ newconfig_file_third_kind + ", newconfig_major=" + newconfig_major + ", newsalary_standard="
				+ newsalary_standard + ", change_reason=" + change_reason + ", check_reason=" + check_reason
				+ ", check_status=" + check_status + ", register=" + register + ", checker=" + checker
				+ ", regist_time=" + regist_time + ", check_time=" + check_time + "]";
	}

	public Integer getMch_id() {
		return mch_id;
	}

	public void setMch_id(Integer mch_id) {
		this.mch_id = mch_id;
	}

	public Human_file getHuman_file() {
		return human_file;
	}

	public void setHuman_file(Human_file human_file) {
		this.human_file = human_file;
	}

	public Config_file_third_kind getNewconfig_file_third_kind() {
		return newconfig_file_third_kind;
	}

	public void setNewconfig_file_third_kind(Config_file_third_kind newconfig_file_third_kind) {
		this.newconfig_file_third_kind = newconfig_file_third_kind;
	}

	public Config_major getNewconfig_major() {
		return newconfig_major;
	}

	public void setNewconfig_major(Config_major newconfig_major) {
		this.newconfig_major = newconfig_major;
	}

	public Salary_standard getNewsalary_standard() {
		return newsalary_standard;
	}

	public void setNewsalary_standard(Salary_standard newsalary_standard) {
		this.newsalary_standard = newsalary_standard;
	}

	public String getChange_reason() {
		return change_reason;
	}

	public void setChange_reason(String change_reason) {
		this.change_reason = change_reason;
	}

	public String getCheck_reason() {
		return check_reason;
	}

	public void setCheck_reason(String check_reason) {
		this.check_reason = check_reason;
	}

	public Integer getCheck_status() {
		return check_status;
	}

	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getRegist_time() {
		return regist_time;
	}

	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}

	public Timestamp getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}

	public Major_change() {
		super();
	}
	
	
	
}
