package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_answer implements Serializable{

	private static final long serialVersionUID = -4510970022234026350L;

	private Integer ans_id ;
	private Engage_answer_details engage_answer_details;
	private String exam_number ;
	private Integer resume_id ;
	private Integer Integererview_id  ;
	private Human_file_dig human_file_dig;
	private Config_major config_major;
	private Timestamp test_time ;
	private String use_time ;
	private Number total_poInteger ;
	
	@Override
	public String toString() {
		return "Engage_answer [ans_id=" + ans_id + ", answer_number=" + engage_answer_details.getAnswer_number() + ", exam_number=" + exam_number
				+ ", resume_id=" + resume_id + ", Integererview_id=" + Integererview_id + ", human_name=" + human_file_dig.getEngage_resume().getHuman_name()
				+ ", human_idcard=" + human_file_dig.getEngage_resume().getHuman_idcard() + ", major_kind_id=" + config_major.getConfig_major_kind().getMajor_kind_id() + ", major_kind_name="
				+ config_major.getConfig_major_kind().getMajor_kind_name() + ", major_id=" + config_major.getMajor_id() + ", major_name=" + config_major.getMajor_name() + ", test_time=" + test_time
				+ ", use_time=" + use_time + ", total_poInteger=" + total_poInteger + "]";
	}

	public Integer getAns_id() {
		return ans_id;
	}

	public void setAns_id(Integer ans_id) {
		this.ans_id = ans_id;
	}


	public String getExam_number() {
		return exam_number;
	}

	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
	}

	public Integer getResume_id() {
		return resume_id;
	}

	public void setResume_id(Integer resume_id) {
		this.resume_id = resume_id;
	}

	public Integer getIntegererview_id() {
		return Integererview_id;
	}

	public void setIntegererview_id(Integer Integererview_id) {
		this.Integererview_id = Integererview_id;
	}


	public Timestamp getTest_time() {
		return test_time;
	}

	public void setTest_time(Timestamp test_time) {
		this.test_time = test_time;
	}

	public String getUse_time() {
		return use_time;
	}

	public void setUse_time(String use_time) {
		this.use_time = use_time;
	}

	public Number getTotal_poInteger() {
		return total_poInteger;
	}

	public void setTotal_poInteger(Number total_poInteger) {
		this.total_poInteger = total_poInteger;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	public Engage_answer_details getEngage_answer_details() {
		return engage_answer_details;
	}

	public void setEngage_answer_details(Engage_answer_details engage_answer_details) {
		this.engage_answer_details = engage_answer_details;
	}


	public Human_file_dig getHuman_file_dig() {
		return human_file_dig;
	}

	public void setHuman_file_dig(Human_file_dig human_file_dig) {
		this.human_file_dig = human_file_dig;
	}


	public Engage_answer() {
		super();
	}
	
	
}
