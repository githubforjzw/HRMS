package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Bonus implements Serializable{

	private static final long serialVersionUID = -444755239592113035L;

	private Integer bon_id ;
	private Config_major config_major;
	private Human_file_dig human_file_dig;
	private String bonus_item;
	private BigDecimal bonus_worth;
	private String bonus_degree ;
	private String remark;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private String check_status ;
	
	@Override
	public String toString() {
		return "Bonus [bon_id=" + bon_id + ", major_kind_id=" + config_major.getConfig_major_kind().getMajor_kind_id() + ", major_kind_name=" 
				+ config_major.getConfig_major_kind().getMajor_kind_name()
				+ ", major_id=" + config_major.getMajor_id() + ", major_name=" + config_major.getMajor_name() + ", human_id=" + human_file_dig.getHuman_id() + ", human_name="
				+ human_file_dig.getEngage_resume().getHuman_name() + ", bonus_item=" + bonus_item + ", bonus_worth=" + bonus_worth + ", bonus_degree="
				+ bonus_degree + ", remark=" + remark + ", register=" + register + ", checker=" + checker
				+ ", regist_time=" + regist_time + ", check_time=" + check_time + ", check_status=" + check_status
				+ "]";
	}



	public Integer getBon_id() {
		return bon_id;
	}



	public void setBon_id(Integer bon_id) {
		this.bon_id = bon_id;
	}


	public Human_file_dig getHuman_file_dig() {
		return human_file_dig;
	}

	public void setHuman_file_dig(Human_file_dig human_file_dig) {
		this.human_file_dig = human_file_dig;
	}



	public String getBonus_item() {
		return bonus_item;
	}

	public void setBonus_item(String bonus_item) {
		this.bonus_item = bonus_item;
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

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	public BigDecimal getBonus_worth() {
		return bonus_worth;
	}

	public void setBonus_worth(BigDecimal bonus_worth) {
		this.bonus_worth = bonus_worth;
	}


	public Bonus() {
		super();
	}
	
	

}
