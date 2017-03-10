package com.yc.bean;

import java.io.Serializable;

public class Config_question_second_kind implements Serializable{

	private static final long serialVersionUID = 6472394216941414440L;

	private int qsk_id ;
	private Config_question_first_kind config_question_first_kind;
	private String second_kind_id ;
	private String second_kind_name ;
	public Config_question_second_kind() {
		super();
	}
	@Override
	public String toString() {
		return "Config_question_second_kind [qsk_id=" + qsk_id + ", config_question_first_kind="
				+ config_question_first_kind + ", second_kind_id=" + second_kind_id + ", second_kind_name="
				+ second_kind_name + "]";
	}
	public int getQsk_id() {
		return qsk_id;
	}
	public void setQsk_id(int qsk_id) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((config_question_first_kind == null) ? 0 : config_question_first_kind.hashCode());
		result = prime * result + qsk_id;
		result = prime * result + ((second_kind_id == null) ? 0 : second_kind_id.hashCode());
		result = prime * result + ((second_kind_name == null) ? 0 : second_kind_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Config_question_second_kind other = (Config_question_second_kind) obj;
		if (config_question_first_kind == null) {
			if (other.config_question_first_kind != null)
				return false;
		} else if (!config_question_first_kind.equals(other.config_question_first_kind))
			return false;
		if (qsk_id != other.qsk_id)
			return false;
		if (second_kind_id == null) {
			if (other.second_kind_id != null)
				return false;
		} else if (!second_kind_id.equals(other.second_kind_id))
			return false;
		if (second_kind_name == null) {
			if (other.second_kind_name != null)
				return false;
		} else if (!second_kind_name.equals(other.second_kind_name))
			return false;
		return true;
	}
	
	
	
}
