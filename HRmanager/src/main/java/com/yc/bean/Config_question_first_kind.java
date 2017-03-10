package com.yc.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Config_question_first_kind implements Serializable{

	private static final long serialVersionUID = 5055961846121123440L;

	private int qfk_id ;
	private String first_kind_id ;
	private String first_kind_name ;
	private List<Config_question_second_kind> config_question_second_kind_list=new ArrayList<Config_question_second_kind>();
	public Config_question_first_kind() {
		super();
	}
	public int getQfk_id() {
		return qfk_id;
	}
	public void setQfk_id(int qfk_id) {
		this.qfk_id = qfk_id;
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
	public List<Config_question_second_kind> getConfig_question_second_kind_list() {
		return config_question_second_kind_list;
	}
	public void setConfig_question_second_kind_list(
			List<Config_question_second_kind> config_question_second_kind_list) {
		this.config_question_second_kind_list = config_question_second_kind_list;
	}
	@Override
	public String toString() {
		return "Config_question_first_kind [qfk_id=" + qfk_id + ", first_kind_id=" + first_kind_id
				+ ", first_kind_name=" + first_kind_name + ", config_question_second_kind_list="
				+ config_question_second_kind_list + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((config_question_second_kind_list == null) ? 0 : config_question_second_kind_list.hashCode());
		result = prime * result + ((first_kind_id == null) ? 0 : first_kind_id.hashCode());
		result = prime * result + ((first_kind_name == null) ? 0 : first_kind_name.hashCode());
		result = prime * result + qfk_id;
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
		Config_question_first_kind other = (Config_question_first_kind) obj;
		if (config_question_second_kind_list == null) {
			if (other.config_question_second_kind_list != null)
				return false;
		} else if (!config_question_second_kind_list.equals(other.config_question_second_kind_list))
			return false;
		if (first_kind_id == null) {
			if (other.first_kind_id != null)
				return false;
		} else if (!first_kind_id.equals(other.first_kind_id))
			return false;
		if (first_kind_name == null) {
			if (other.first_kind_name != null)
				return false;
		} else if (!first_kind_name.equals(other.first_kind_name))
			return false;
		if (qfk_id != other.qfk_id)
			return false;
		return true;
	}
	
	
	
}
