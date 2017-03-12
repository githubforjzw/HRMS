package com.yc.bean;

import java.io.Serializable;

public class Config_public_char implements Serializable{

	private static final long serialVersionUID = -8721462010137010648L;

	private Integer pbc_id ;
	private String attribute_kind ;
	private String attribute_name ;
	
	@Override
	public String toString() {
		return "Config_public_char [pbc_id=" + pbc_id + ", attribute_kind=" + attribute_kind + ", attribute_name="
				+ attribute_name + "]";
	}

	public Integer getPbc_id() {
		return pbc_id;
	}

	public void setPbc_id(Integer pbc_id) {
		this.pbc_id = pbc_id;
	}

	public String getAttribute_kind() {
		return attribute_kind;
	}

	public void setAttribute_kind(String attribute_kind) {
		this.attribute_kind = attribute_kind;
	}

	public String getAttribute_name() {
		return attribute_name;
	}

	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}


	public Config_public_char() {
		super();
	}
	
	
}
