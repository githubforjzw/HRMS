package com.yc.bean;

import java.io.Serializable;

public class Config_question_second_kind implements Serializable{

	private static final long serialVersionUID = 6472394216941414440L;

	private Integer qsk_id ;
	private Config_question_first_kind config_question_first_kind;
	private String second_kind_id ;
	private String second_kind_name ;
	
	@Override
	public String toString() {
		return "Config_question_second_kind [qsk_id=" + qsk_id + ", first_kind_id=" + config_question_first_kind.getFirst_kind_id()
				+ ", first_kind_name=" + config_question_first_kind.getFirst_kind_name() + ", second_kind_id=" + second_kind_id + ", second_kind_name="
				+ second_kind_name + "]";
	}

	public Integer getQsk_id() {
		return qsk_id;
	}

	public void setQsk_id(Integer qsk_id) {
		this.qsk_id = qsk_id;
	}


	public Config_question_first_kind getConfig_question_first_kind() {
		return config_question_first_kind;
	}

	public void setConfig_question_first_kind(Config_question_first_kind config_question_first_kind) {
		this.config_question_first_kind = config_question_first_kind;
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


	public Config_question_second_kind() {
		super();
	}
	
	
}
