package com.yc.bean;

import java.io.Serializable;

public class Config_file_third_kind implements Serializable{

	private static final long serialVersionUID = -4094591422602839620L;


	private Integer ftk_id ;

	private Config_file_second_kind config_file_second_kind;
	private String third_kind_id ;
	private String third_kind_name ;
	private String third_kind_sale_id ;
	private String third_kind_is_retail ;
	public Config_file_third_kind(Integer ftk_id, Config_file_second_kind config_file_second_kind, String third_kind_id,
			String third_kind_name, String third_kind_sale_id, String third_kind_is_retail) {
		super();
		this.ftk_id = ftk_id;
		this.config_file_second_kind = config_file_second_kind;
		this.third_kind_id = third_kind_id;
		this.third_kind_name = third_kind_name;
		this.third_kind_sale_id = third_kind_sale_id;
		this.third_kind_is_retail = third_kind_is_retail;
	}
	public Integer getFtk_id() {
		return ftk_id;
	}
	public void setFtk_id(Integer ftk_id) {
		this.ftk_id = ftk_id;
	}
	public Config_file_second_kind getConfig_file_second_kind() {
		return config_file_second_kind;
	}
	public void setConfig_file_second_kind(Config_file_second_kind config_file_second_kind) {
		this.config_file_second_kind = config_file_second_kind;
	}
	public String getThird_kind_id() {
		return third_kind_id;
	}
	public void setThird_kind_id(String third_kind_id) {
		this.third_kind_id = third_kind_id;
	}
	public String getThird_kind_name() {
		return third_kind_name;
	}
	public void setThird_kind_name(String third_kind_name) {
		this.third_kind_name = third_kind_name;
	}
	public String getThird_kind_sale_id() {
		return third_kind_sale_id;
	}
	public void setThird_kind_sale_id(String third_kind_sale_id) {
		this.third_kind_sale_id = third_kind_sale_id;
	}
	public String getThird_kind_is_retail() {
		return third_kind_is_retail;
	}
	public void setThird_kind_is_retail(String third_kind_is_retail) {
		this.third_kind_is_retail = third_kind_is_retail;
	}
	@Override
	public String toString() {
		return "Config_file_third_kind [ftk_id=" + ftk_id + ", config_file_second_kind=" + config_file_second_kind
				+ ", third_kind_id=" + third_kind_id + ", third_kind_name=" + third_kind_name + ", third_kind_sale_id="
				+ third_kind_sale_id + ", third_kind_is_retail=" + third_kind_is_retail + "]";
	}
	
	
	
}
