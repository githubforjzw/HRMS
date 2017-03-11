package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_major_release implements Serializable{

	private static final long serialVersionUID = 4085024041627267717L;

	private Integer mre_id ;
	private Config_file_third_kind config_file_third_kind;
	private Config_major config_major;
	private Integer human_amount ;
	private String engage_type ;
	private Timestamp deadline ;
	private String register;
	private String changer ;
	private Timestamp regist_time ;
	private Timestamp change_time  ;
	private String major_describe  ;
	private String engage_required  ;
	
	@Override
	public String toString() {
		return "Engage_major_release [mre_id=" + mre_id + ", first_kind_id=" + config_file_third_kind.getConfig_file_second_kind().getConfig_file_first_kind().getFirst_kind_id() 
				+ ", first_kind_name=" + config_file_third_kind.getConfig_file_second_kind().getConfig_file_first_kind().getFirst_kind_name() 
				+ ", second_kind_id=" + config_file_third_kind.getConfig_file_second_kind().getSecond_kind_id() + ", second_kind_name=" + config_file_third_kind.getConfig_file_second_kind().getSecond_kind_name()
				+ ", third_kind_id=" + config_file_third_kind.getThird_kind_id() + ", third_kind_name=" + config_file_third_kind.getThird_kind_name() + ", major_kind_id="
				+ config_major.getConfig_major_kind().getMajor_kind_id() + ", major_kind_name=" + config_major.getConfig_major_kind().getMajor_kind_name() 
				+ ", major_id=" + config_major.getMajor_id() + ", major_name="
				+ config_major.getMajor_name() + ", human_amount=" + human_amount + ", engage_type=" + engage_type + ", deadline="
				+ deadline + ", register=" + register + ", changer=" + changer + ", regist_time=" + regist_time
				+ ", change_time=" + change_time + ", major_describe=" + major_describe + ", engage_required="
				+ engage_required + "]";
	}

	public Integer getMre_id() {
		return mre_id;
	}

	public void setMre_id(Integer mre_id) {
		this.mre_id = mre_id;
	}


	public Config_file_third_kind getConfig_file_third_kind() {
		return config_file_third_kind;
	}

	public void setConfig_file_third_kind(Config_file_third_kind config_file_third_kind) {
		this.config_file_third_kind = config_file_third_kind;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	public Integer getHuman_amount() {
		return human_amount;
	}

	public void setHuman_amount(Integer human_amount) {
		this.human_amount = human_amount;
	}

	public String getEngage_type() {
		return engage_type;
	}

	public void setEngage_type(String engage_type) {
		this.engage_type = engage_type;
	}

	public Timestamp getDeadline() {
		return deadline;
	}

	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
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

	public Timestamp getChange_time() {
		return change_time;
	}

	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}

	public String getMajor_describe() {
		return major_describe;
	}

	public void setMajor_describe(String major_describe) {
		this.major_describe = major_describe;
	}

	public String getEngage_required() {
		return engage_required;
	}

	public void setEngage_required(String engage_required) {
		this.engage_required = engage_required;
	}

	public Engage_major_release(Integer mre_id, Config_file_third_kind config_file_third_kind, Config_major config_major,
			Integer human_amount, String engage_type, Timestamp deadline, String register, String changer,
			Timestamp regist_time, Timestamp change_time, String major_describe, String engage_required) {
		super();
		this.mre_id = mre_id;
		this.config_file_third_kind = config_file_third_kind;
		this.config_major = config_major;
		this.human_amount = human_amount;
		this.engage_type = engage_type;
		this.deadline = deadline;
		this.register = register;
		this.changer = changer;
		this.regist_time = regist_time;
		this.change_time = change_time;
		this.major_describe = major_describe;
		this.engage_required = engage_required;
	}

	public Engage_major_release() {
		super();
	}
	
	
}
