package com.yc.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Config_question_first_kind implements Serializable{

	private static final long serialVersionUID = 5055961846121123440L;

	private Integer qfk_id ;
	private String first_kind_id ;
	private String first_kind_name ;
	private List<Config_question_second_kind> config_question_second_kind_list=new ArrayList<Config_question_second_kind>();
	public Config_question_first_kind() {
		super();
	}
	public Integer getQfk_id() {
		return qfk_id;
	}
	public void setQfk_id(Integer qfk_id) {
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
	public void setConfig_question_second_kind_list(List<Config_question_second_kind> config_question_second_kind_list) {
		this.config_question_second_kind_list = config_question_second_kind_list;
	}
	
	
}
