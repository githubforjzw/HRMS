package com.yc.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Config_major_kind implements Serializable{

	private static final long serialVersionUID = -6518290776717236115L;

	private Integer mfk_id ;
	private String major_kind_id ;
	private String major_kind_name ;
	private List<Config_major> list = new ArrayList<Config_major>();
	public Integer getMfk_id() {
		return mfk_id;
	}
	public void setMfk_id(Integer mfk_id) {
		this.mfk_id = mfk_id;
	}
	public String getMajor_kind_id() {
		return major_kind_id;
	}
	public void setMajor_kind_id(String major_kind_id) {
		this.major_kind_id = major_kind_id;
	}
	public String getMajor_kind_name() {
		return major_kind_name;
	}
	public void setMajor_kind_name(String major_kind_name) {
		this.major_kind_name = major_kind_name;
	}
	public List<Config_major> getList() {
		return list;
	}
	public void setList(List<Config_major> list) {
		this.list = list;
	}
	public Config_major_kind() {
		super();
	}
	@Override
	public String toString() {
		return "Config_major_kind [mfk_id=" + mfk_id + ", major_kind_id=" + major_kind_id + ", major_kind_name="
				+ major_kind_name + ", list=" + list + "]";
	}

	
	
}
