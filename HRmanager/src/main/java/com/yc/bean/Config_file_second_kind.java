package com.yc.bean;

import java.io.Serializable;

public class Config_file_second_kind implements Serializable{

	private static final long serialVersionUID = -6764418756467178037L;

	private Integer fsk_id ; 
	private Config_file_first_kind config_file_first_kind;
	private String second_kind_id ;
	private String second_kind_name ;
	private String second_salary_id ;
	private String second_sale_id ;
	
	@Override
	public String toString() {
		return "Config_file_second_kind [fsk_id=" + fsk_id + ", first_kind_id=" + config_file_first_kind.getFirst_kind_id() + ", first_kind_name="
				+ config_file_first_kind.getFirst_kind_name() + ", second_kind_id=" + second_kind_id + ", second_kind_name=" + second_kind_name
				+ ", second_salary_id=" + second_salary_id + ", second_sale_id=" + second_sale_id + "]";
	}

	public Integer getFsk_id() {
		return fsk_id;
	}

	public void setFsk_id(Integer fsk_id) {
		this.fsk_id = fsk_id;
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

	public String getSecond_salary_id() {
		return second_salary_id;
	}

	public void setSecond_salary_id(String second_salary_id) {
		this.second_salary_id = second_salary_id;
	}

	public String getSecond_sale_id() {
		return second_sale_id;
	}

	public void setSecond_sale_id(String second_sale_id) {
		this.second_sale_id = second_sale_id;
	}

	public Config_file_first_kind getConfig_file_first_kind() {
		return config_file_first_kind;
	}

	public void setConfig_file_first_kind(Config_file_first_kind config_file_first_kind) {
		this.config_file_first_kind = config_file_first_kind;
	}


	public Config_file_second_kind() {
		super();
	}
	
	
	
}
