package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Training implements Serializable{

	private static final long serialVersionUID = 5299871373731734987L;

	private int tra_id ;
	private Config_major_kind config_major_kind;
	private String major_id ;
	private String major_name ;
	private String human_id ;
	private String human_name;
	private String training_item ;
	private Timestamp training_time ;
	private int training_hour ;
	private String training_degree ;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private int checkstatus;
	private String remark ;
	
	@Override
	public String toString() {
		return "Training [tra_id=" + tra_id + ", major_kind_id=" + ", major_id=" + major_id + ", major_name=" + major_name + ", human_id=" + human_id
				+ ", human_name=" + human_name + ", training_item=" + training_item + ", training_time=" + training_time
				+ ", training_hour=" + training_hour + ", training_degree=" + training_degree + ", register=" + register
				+ ", checker=" + checker + ", regist_time=" + regist_time + ", check_time=" + check_time
				+ ", checkstatus=" + checkstatus + ", remark=" + remark + "]";
	}

	public int getTra_id() {
		return tra_id;
	}

	public void setTra_id(int tra_id) {
		this.tra_id = tra_id;
	}

	public Config_major_kind getConfig_major_kind() {
		return config_major_kind;
	}
	public void setConfig_major_kind(Config_major_kind config_major_kind) {
		this.config_major_kind = config_major_kind;
	}

	public String getMajor_id() {
		return major_id;
	}

	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public String getHuman_id() {
		return human_id;
	}

	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}

	public String getHuman_name() {
		return human_name;
	}

	public void setHuman_name(String human_name) {
		this.human_name = human_name;
	}

	public String getTraining_item() {
		return training_item;
	}

	public void setTraining_item(String training_item) {
		this.training_item = training_item;
	}

	public Timestamp getTraining_time() {
		return training_time;
	}

	public void setTraining_time(Timestamp training_time) {
		this.training_time = training_time;
	}

	public int getTraining_hour() {
		return training_hour;
	}

	public void setTraining_hour(int training_hour) {
		this.training_hour = training_hour;
	}

	public String getTraining_degree() {
		return training_degree;
	}

	public void setTraining_degree(String training_degree) {
		this.training_degree = training_degree;
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

	public int getCheckstatus() {
		return checkstatus;
	}

	public void setCheckstatus(int checkstatus) {
		this.checkstatus = checkstatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
