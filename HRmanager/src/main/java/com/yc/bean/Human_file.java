package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Human_file implements Serializable{

	private static final long serialVersionUID = 3810638608816712509L;

	private Integer huf_id ;
	private Human_file_dig human_file_dig;
	
	@Override
	public String toString() {
		return "Human_file [huf_id=" + huf_id + ", human_file_dig=" + human_file_dig + "]";
	}
	
	public Integer getHuf_id() {
		return huf_id;
	}
	public void setHuf_id(Integer huf_id) {
		this.huf_id = huf_id;
	}
	public Human_file_dig getHuman_file_dig() {
		return human_file_dig;
	}
	public void setHuman_file_dig(Human_file_dig human_file_dig) {
		this.human_file_dig = human_file_dig;
	}


	public Human_file() {
		super();
	}
	
	
	
	
	
}
