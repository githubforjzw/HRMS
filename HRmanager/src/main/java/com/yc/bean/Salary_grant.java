package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Salary_grant implements Serializable{

	private static final long serialVersionUID = -2960312705667200996L;

	private Integer sgr_id ;
	private Salary_standard salary_standard;
	private Config_file_third_kind config_file_third_kind;
	private Integer human_amount ;
	private BigDecimal salary_standard_sum ;
	private BigDecimal salary_paid_sum;
	private String register ;
	private Timestamp regist_time ;
	private String checker ;
	private Timestamp check_time ;
	private Integer check_status  ;
	
	@Override
	public String toString() {
		return "Salary_grant [sgr_id=" + sgr_id + ", salary_grant_id=" + salary_standard.getSsd_id() + ", salary_standard_id="
				+ salary_standard.getStandard_id() + ", first_kind_id=" + config_file_third_kind.getConfig_file_second_kind().getConfig_file_first_kind().getFirst_kind_id() 
				+ ", first_kind_name=" + config_file_third_kind.getConfig_file_second_kind().getConfig_file_first_kind().getFirst_kind_name()
				+ ", second_kind_id=" + config_file_third_kind.getConfig_file_second_kind().getSecond_kind_id() 
				+ ", second_kind_name=" + config_file_third_kind.getConfig_file_second_kind().getSecond_kind_name() + ", third_kind_id="
				+ config_file_third_kind.getThird_kind_id() + ", third_kind_name=" + config_file_third_kind.getThird_kind_name() + ", human_amount=" + human_amount
				+ ", salary_standard_sum=" + salary_standard_sum + ", salary_paid_sum=" + salary_paid_sum
				+ ", register=" + register + ", regist_time=" + regist_time + ", checker=" + checker + ", check_time="
				+ check_time + ", check_status=" + check_status + "]";
	}

	public Integer getSgr_id() {
		return sgr_id;
	}

	public void setSgr_id(Integer sgr_id) {
		this.sgr_id = sgr_id;
	}



	public Salary_standard getSalary_standard() {
		return salary_standard;
	}

	public void setSalary_standard(Salary_standard salary_standard) {
		this.salary_standard = salary_standard;
	}

	public Integer getHuman_amount() {
		return human_amount;
	}

	public void setHuman_amount(Integer human_amount) {
		this.human_amount = human_amount;
	}


	public BigDecimal getSalary_standard_sum() {
		return salary_standard_sum;
	}

	public void setSalary_standard_sum(BigDecimal salary_standard_sum) {
		this.salary_standard_sum = salary_standard_sum;
	}

	public BigDecimal getSalary_paid_sum() {
		return salary_paid_sum;
	}

	public void setSalary_paid_sum(BigDecimal salary_paid_sum) {
		this.salary_paid_sum = salary_paid_sum;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Timestamp getRegist_time() {
		return regist_time;
	}

	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}

	public Integer getCheck_status() {
		return check_status;
	}

	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}

	public Config_file_third_kind getConfig_file_third_kind() {
		return config_file_third_kind;
	}

	public void setConfig_file_third_kind(Config_file_third_kind config_file_third_kind) {
		this.config_file_third_kind = config_file_third_kind;
	}


	public Salary_grant() {
		super();
	}
	
	
}
