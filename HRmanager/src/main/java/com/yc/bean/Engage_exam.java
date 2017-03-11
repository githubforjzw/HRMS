package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_exam implements Serializable{

	private static final long serialVersionUID = 6538862673973451828L;

	private Integer exa_id ;
	private String exam_number;
	private Config_major Config_major;
	private String register ;
	private Timestamp regist_time ;
	private Integer limite_time ;
	
	@Override
	public String toString() {
		return "Engage_exam [exa_id=" + exa_id + ", exam_number=" + exam_number + ", major_kind_id=" + Config_major.getConfig_major_kind().getMajor_kind_id()
				+ ", major_kind_name=" + Config_major.getConfig_major_kind().getMajor_kind_name() + ", major_id=" + Config_major.getMajor_id() + ", major_name=" + Config_major.getMajor_name()
				+ ", register=" + register + ", regist_time=" + regist_time + ", limite_time=" + limite_time + "]";
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
		return Config_major;
	}

	public void setConfig_major(Config_major config_major) {
		Config_major = config_major;
	}


	public Engage_exam() {
		super();
	}
	
	
}
