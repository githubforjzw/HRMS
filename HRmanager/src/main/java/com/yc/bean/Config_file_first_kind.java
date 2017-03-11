package com.yc.bean;

import java.io.Serializable;

public class Config_file_first_kind implements Serializable{

	private static final long serialVersionUID = 8079902436537245254L;
	
	private Integer ffk_id ;
	private String first_kind_id ;
	private String first_kind_name ;
	private String first_kind_salary_id ;
	private String first_kind_sale_id ;
	
	@Override
	public String toString() {
		return "Config_file_first_kind [ffk_id=" + ffk_id + ", first_kind_id=" + first_kind_id + ", first_kind_name="
				+ first_kind_name + ", first_kind_salary_id=" + first_kind_salary_id + ", first_kind_sale_id="
				+ first_kind_sale_id + "]";
	}


	public Integer getFfk_id() {
		return ffk_id;
	}


	public void setFfk_id(Integer ffk_id) {
		this.ffk_id = ffk_id;
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

	public String getFirst_kind_salary_id() {
		return first_kind_salary_id;
	}

	public void setFirst_kind_salary_id(String first_kind_salary_id) {
		this.first_kind_salary_id = first_kind_salary_id;
	}

	public String getFirst_kind_sale_id() {
		return first_kind_sale_id;
	}

	public void setFirst_kind_sale_id(String first_kind_sale_id) {
		this.first_kind_sale_id = first_kind_sale_id;
	}


	public Config_file_first_kind() {
		super();
	}
	
	
	
}
