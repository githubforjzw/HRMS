package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Training implements Serializable{

	private static final long serialVersionUID = 5299871373731734987L;

	private Integer tra_id ;
	private Config_major config_major;
	private Human_file_dig human_file_dig;
	private String training_item ;
	private Timestamp training_time ;
	private Integer training_hour ;
	private String training_degree ;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private Integer checkstatus;
	private String remark ;
	
	@Override
	public String toString() {
		return "Training [tra_id=" + tra_id + ", major_kind_id=" + config_major.getConfig_major_kind().getMajor_kind_id() + ", major_kind_name="
				+ config_major.getConfig_major_kind().getMajor_kind_name() + ", major_id=" + config_major.getMajor_id() + ", major_name=" + config_major.getMajor_name() + ", human_id=" 
				+ human_file_dig.getHuman_id()
				+ ", human_name=" + human_file_dig.getEngage_resume().getHuman_name() + ", training_item=" + training_item + ", training_time=" + training_time
				+ ", training_hour=" + training_hour + ", training_degree=" + training_degree + ", register=" + register
				+ ", checker=" + checker + ", regist_time=" + regist_time + ", check_time=" + check_time
				+ ", checkstatus=" + checkstatus + ", remark=" + remark + "]";
	}

	public Integer getTra_id() {
		return tra_id;
	}

	public void setTra_id(Integer tra_id) {
		this.tra_id = tra_id;
	}




	public Human_file_dig getHuman_file_dig() {
		return human_file_dig;
	}

	public void setHuman_file_dig(Human_file_dig human_file_dig) {
		this.human_file_dig = human_file_dig;
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

	public Integer getTraining_hour() {
		return training_hour;
	}

	public void setTraining_hour(Integer training_hour) {
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

	public Integer getCheckstatus() {
		return checkstatus;
	}

	public void setCheckstatus(Integer checkstatus) {
		this.checkstatus = checkstatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}


	public Training() {
		super();
	}
	
	
}
