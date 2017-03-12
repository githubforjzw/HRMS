package com.yc.bean;

import java.io.Serializable;

public class Engage_exam_details implements Serializable{

	private static final long serialVersionUID = -1758803492768118038L;


	private Integer exd_id ;
	private String exam_number;
	private Config_question_second_kind config_question_second_kind;
	private Integer question_amount ;
	public Engage_exam_details() {
		super();
	}
	@Override
	public String toString() {
		return "Engage_exam_details [exd_id=" + exd_id + ", exam_number=" + exam_number
				+ ", config_question_second_kind=" + config_question_second_kind + ", question_amount="
				+ question_amount + "]";
	}
	public Integer getExd_id() {
		return exd_id;
	}
	public void setExd_id(Integer exd_id) {
		this.exd_id = exd_id;
	}
	public String getExam_number() {
		return exam_number;
	}
	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
	}
	public Config_question_second_kind getConfig_question_second_kind() {
		return config_question_second_kind;
	}
	public void setConfig_question_second_kind(Config_question_second_kind config_question_second_kind) {
		this.config_question_second_kind = config_question_second_kind;
	}
	public Integer getQuestion_amount() {
		return question_amount;
	}
	public void setQuestion_amount(Integer question_amount) {
		this.question_amount = question_amount;
	}

	


	
}
