package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_exam implements Serializable{

	private static final long serialVersionUID = 6538862673973451828L;

	private Integer exa_id ;
	private String exam_number;
	private Config_major config_major;
	private String register ;
	private Timestamp regist_time ;
	private Integer limite_time ;
	
	private Timestamp startTime;
	private Timestamp endTime;
	
	public Timestamp getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	public Timestamp getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	
	public Engage_exam() {
		super();
	}
	
	public Integer getExa_id() {
		return exa_id;
	}
	public void setExa_id(Integer exa_id) {
		this.exa_id = exa_id;
	}
	public String getExam_number() {
		return exam_number;
	}
	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
	}
	
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public Timestamp getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}
	public Integer getLimite_time() {
		return limite_time;
	}
	public void setLimite_time(Integer limite_time) {
		this.limite_time = limite_time;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	@Override
	public String toString() {
		return "Engage_exam [exa_id=" + exa_id + ", exam_number=" + exam_number + ", config_major=" + config_major
				+ ", register=" + register + ", regist_time=" + regist_time + ", limite_time=" + limite_time + "]";
	}
	
	
	
	
	
	
}
