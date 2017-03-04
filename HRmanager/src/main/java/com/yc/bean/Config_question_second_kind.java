package com.yc.bean;

import java.io.Serializable;

public class Config_question_second_kind implements Serializable{

	private static final long serialVersionUID = 6472394216941414440L;

	private int qsk_id ;
	private String first_kind_id ;
	private String first_kind_name ;
	private String second_kind_id ;
	private String second_kind_name ;
	
	@Override
	public String toString() {
		return "Config_question_second_kind [qsk_id=" + qsk_id + ", first_kind_id=" + first_kind_id
				+ ", first_kind_name=" + first_kind_name + ", second_kind_id=" + second_kind_id + ", second_kind_name="
				+ second_kind_name + "]";
	}

	public int getQsk_id() {
		return qsk_id;
	}

	public void setQsk_id(int qsk_id) {
		this.qsk_id = qsk_id;
	}

	public String getFirst_kind_id() {
		return first_kind_id;
	}

	public void setFirst_kind_id(String first_kind_id) {
		this.first_kind_id = first_kind_id;
	}

	public String getFirst_kind_name() {
		return first_kind_name;
	}

	public void setFirst_kind_name(String first_kind_name) {
		this.first_kind_name = first_kind_name;
	}

	public String getSecond_kind_id() {
		return second_kind_id;
	}

	public void setSecond_kind_id(String second_kind_id) {
		this.second_kind_id = second_kind_id;
	}

	public String getSecond_kind_name() {
		return second_kind_name;
	}

	public void setSecond_kind_name(String second_kind_name) {
		this.second_kind_name = second_kind_name;
	}
	
	
}
