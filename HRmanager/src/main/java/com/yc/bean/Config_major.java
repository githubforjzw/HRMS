package com.yc.bean;

import java.io.Serializable;

public class Config_major implements Serializable{

	private static final long serialVersionUID = 6060666461814452078L;

	private Integer mak_id ;
	private Config_major_kind config_major_kind;
	private String major_id ;
	private String major_name ;
	private Integer test_amount ;
	
	@Override
	public String toString() {
		return "Config_major [mak_id=" + mak_id + ", major_kind_id=" + config_major_kind.getMajor_kind_id() + ", major_kind_name="
				+ config_major_kind.getMajor_kind_name() + ", major_id=" + major_id + ", major_name=" + major_name + ", test_amount="
				+ test_amount + "]";
	}

	public Integer getMak_id() {
		return mak_id;
	}

	public void setMak_id(Integer mak_id) {
		this.mak_id = mak_id;
	}


	public Config_major_kind getConfig_major_kind() {
		return config_major_kind;
	}

	public void setConfig_major_kind(Config_major_kind config_major_kind) {
		this.config_major_kind = config_major_kind;
	}

	public String getMajor_id() {
		return major_id;
	}

	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public Integer getTest_amount() {
		return test_amount;
	}

	public void setTest_amount(Integer test_amount) {
		this.test_amount = test_amount;
	}

	public Config_major() {
		super();
	}
	
	
	
}
