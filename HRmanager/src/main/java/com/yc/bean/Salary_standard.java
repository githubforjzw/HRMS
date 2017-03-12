package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Salary_standard implements Serializable{

	private static final long serialVersionUID = -6689116965293719993L;

	private Integer ssd_id ;
	private String standard_id ;
	private String standard_name ;
	private String designer ;
	private String register ;
	private String checker ;
	private String changer ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private Timestamp change_time ;
	private BigDecimal salary_sum ;
	private Integer check_status;
	private Integer change_status;
	private String check_comment;
	private String remark ;
	
	@Override
	public String toString() {
		return "Salary_standard [ssd_id=" + ssd_id + ", standard_id=" + standard_id + ", standard_name=" + standard_name
				+ ", designer=" + designer + ", register=" + register + ", checker=" + checker + ", changer=" + changer
				+ ", regist_time=" + regist_time + ", check_time=" + check_time + ", change_time=" + change_time
				+ ", salary_sum=" + salary_sum + ", check_status=" + check_status + ", change_status=" + change_status
				+ ", check_comment=" + check_comment + ", remark=" + remark + "]";
	}

	public Integer getSsd_id() {
		return ssd_id;
	}

	public void setSsd_id(Integer ssd_id) {
		this.ssd_id = ssd_id;
	}

	public String getStandard_id() {
		return standard_id;
	}

	public void setStandard_id(String standard_id) {
		this.standard_id = standard_id;
	}

	public String getStandard_name() {
		return standard_name;
	}

	public void setStandard_name(String standard_name) {
		this.standard_name = standard_name;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
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

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
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

	public Timestamp getChange_time() {
		return change_time;
	}

	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}


	public BigDecimal getSalary_sum() {
		return salary_sum;
	}

	public void setSalary_sum(BigDecimal salary_sum) {
		this.salary_sum = salary_sum;
	}

	public Integer getCheck_status() {
		return check_status;
	}

	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}

	public Integer getChange_status() {
		return change_status;
	}

	public void setChange_status(Integer change_status) {
		this.change_status = change_status;
	}

	public String getCheck_comment() {
		return check_comment;
	}

	public void setCheck_comment(String check_comment) {
		this.check_comment = check_comment;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Salary_standard() {
		super();
	}
	
	
}
