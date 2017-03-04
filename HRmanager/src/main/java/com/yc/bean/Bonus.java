package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Bonus implements Serializable{

	private static final long serialVersionUID = -444755239592113035L;

	private int bon_id ;
	private String major_kind_id ;
	private String major_kind_name ;
	private String major_id ;
	private String major_name ;
	private String human_id ;
	private String human_name ;
	private String bonus_item;
	private DecimalFormat bonus_worth;
	private String bonus_degree ;
	private String remark;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private String check_status ;
	
	@Override
	public String toString() {
		return "Bonus [bon_id=" + bon_id + ", major_kind_id=" + major_kind_id + ", major_kind_name=" + major_kind_name
				+ ", major_id=" + major_id + ", major_name=" + major_name + ", human_id=" + human_id + ", human_name="
				+ human_name + ", bonus_item=" + bonus_item + ", bonus_worth=" + bonus_worth + ", bonus_degree="
				+ bonus_degree + ", remark=" + remark + ", register=" + register + ", checker=" + checker
				+ ", regist_time=" + regist_time + ", check_time=" + check_time + ", check_status=" + check_status
				+ "]";
	}

	public int getBon_id() {
		return bon_id;
	}

	public void setBon_id(int bon_id) {
		this.bon_id = bon_id;
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

	public String getHuman_id() {
		return human_id;
	}

	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}

	public String getHuman_name() {
		return human_name;
	}

	public void setHuman_name(String human_name) {
		this.human_name = human_name;
	}

	public String getBonus_item() {
		return bonus_item;
	}

	public void setBonus_item(String bonus_item) {
		this.bonus_item = bonus_item;
	}

	public DecimalFormat getBonus_worth() {
		return bonus_worth;
	}

	public void setBonus_worth(DecimalFormat bonus_worth) {
		this.bonus_worth = bonus_worth;
	}

	public String getBonus_degree() {
		return bonus_degree;
	}

	public void setBonus_degree(String bonus_degree) {
		this.bonus_degree = bonus_degree;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getRegist_time() {
		return regist_time;
	}

	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}

	public Timestamp getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}

	public String getCheck_status() {
		return check_status;
	}

	public void setCheck_status(String check_status) {
		this.check_status = check_status;
	}
	
	

}
