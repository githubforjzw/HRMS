package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Human_file_dig implements Serializable{

	private static final long serialVersionUID = 4459017836340211935L;
	
	private Integer hfd_id ;
	private String human_id ;
	private Config_file_third_kind config_file_third_kind;
	private Engage_resume engage_resume;
	private String human_pro_designation;
	private Config_major config_major;
	private String human_bank ;
	private String human_account  ;
	private String human_society_security_id ;
	private Salary_standard salary_standard; //薪酬标准编号  名称  总额
	private BigDecimal demand_salaray_sum;
	private BigDecimal paid_salary_sum ;
	private Integer major_change_amount ;
	private Integer bonus_amount ;
	private Integer training_amount ;
	private Integer file_chang_amount ;
	private String human_histroy_records ;
	private String human_family_membership ;
	private String changer ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private Timestamp change_time ;
	private Timestamp lastly_change_time ;
	private Timestamp delete_time ;
	private Timestamp recovery_time ;
	private String human_file_status ;
	

	@Override
	public String toString() {
		return "Human_file_dig [hfd_id=" + hfd_id + ", human_id=" + human_id + ", config_file_third_kind="
				+ config_file_third_kind + ", engage_resume=" + engage_resume + ", human_pro_designation="
				+ human_pro_designation + ", config_major=" + config_major + ", human_bank=" + human_bank
				+ ", human_account=" + human_account + ", human_society_security_id=" + human_society_security_id
				+ ", salary_standard=" + salary_standard + ", demand_salaray_sum=" + demand_salaray_sum
				+ ", paid_salary_sum=" + paid_salary_sum + ", major_change_amount=" + major_change_amount
				+ ", bonus_amount=" + bonus_amount + ", training_amount=" + training_amount + ", file_chang_amount="
				+ file_chang_amount + ", human_histroy_records=" + human_histroy_records + ", human_family_membership="
				+ human_family_membership + ", changer=" + changer + ", regist_time=" + regist_time + ", check_time="
				+ check_time + ", change_time=" + change_time + ", lastly_change_time=" + lastly_change_time
				+ ", delete_time=" + delete_time + ", recovery_time=" + recovery_time + ", human_file_status="
				+ human_file_status + "]";
	}

	public Integer getHfd_id() {
		return hfd_id;
	}

	public void setHfd_id(Integer hfd_id) {
		this.hfd_id = hfd_id;
	}

	public String getHuman_id() {
		return human_id;
	}

	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}

	public Config_file_third_kind getConfig_file_third_kind() {
		return config_file_third_kind;
	}

	public void setConfig_file_third_kind(Config_file_third_kind config_file_third_kind) {
		this.config_file_third_kind = config_file_third_kind;
	}

	public Engage_resume getEngage_resume() {
		return engage_resume;
	}

	public void setEngage_resume(Engage_resume engage_resume) {
		this.engage_resume = engage_resume;
	}

	public String getHuman_pro_designation() {
		return human_pro_designation;
	}

	public void setHuman_pro_designation(String human_pro_designation) {
		this.human_pro_designation = human_pro_designation;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	public String getHuman_bank() {
		return human_bank;
	}

	public void setHuman_bank(String human_bank) {
		this.human_bank = human_bank;
	}

	public String getHuman_account() {
		return human_account;
	}

	public void setHuman_account(String human_account) {
		this.human_account = human_account;
	}

	public String getHuman_society_security_id() {
		return human_society_security_id;
	}

	public void setHuman_society_security_id(String human_society_security_id) {
		this.human_society_security_id = human_society_security_id;
	}


	public Salary_standard getSalary_standard() {
		return salary_standard;
	}

	public void setSalary_standard(Salary_standard salary_standard) {
		this.salary_standard = salary_standard;
	}

	public BigDecimal getDemand_salaray_sum() {
		return demand_salaray_sum;
	}

	public void setDemand_salaray_sum(BigDecimal demand_salaray_sum) {
		this.demand_salaray_sum = demand_salaray_sum;
	}

	public BigDecimal getPaid_salary_sum() {
		return paid_salary_sum;
	}

	public void setPaid_salary_sum(BigDecimal paid_salary_sum) {
		this.paid_salary_sum = paid_salary_sum;
	}

	public Integer getMajor_change_amount() {
		return major_change_amount;
	}

	public void setMajor_change_amount(Integer major_change_amount) {
		this.major_change_amount = major_change_amount;
	}

	public Integer getBonus_amount() {
		return bonus_amount;
	}

	public void setBonus_amount(Integer bonus_amount) {
		this.bonus_amount = bonus_amount;
	}

	public Integer getTraining_amount() {
		return training_amount;
	}

	public void setTraining_amount(Integer training_amount) {
		this.training_amount = training_amount;
	}

	public Integer getFile_chang_amount() {
		return file_chang_amount;
	}

	public void setFile_chang_amount(Integer file_chang_amount) {
		this.file_chang_amount = file_chang_amount;
	}

	public String getHuman_histroy_records() {
		return human_histroy_records;
	}

	public void setHuman_histroy_records(String human_histroy_records) {
		this.human_histroy_records = human_histroy_records;
	}

	public String getHuman_family_membership() {
		return human_family_membership;
	}

	public void setHuman_family_membership(String human_family_membership) {
		this.human_family_membership = human_family_membership;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
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

	public Timestamp getChange_time() {
		return change_time;
	}

	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}

	public Timestamp getLastly_change_time() {
		return lastly_change_time;
	}

	public void setLastly_change_time(Timestamp lastly_change_time) {
		this.lastly_change_time = lastly_change_time;
	}

	public Timestamp getDelete_time() {
		return delete_time;
	}

	public void setDelete_time(Timestamp delete_time) {
		this.delete_time = delete_time;
	}

	public Timestamp getRecovery_time() {
		return recovery_time;
	}

	public void setRecovery_time(Timestamp recovery_time) {
		this.recovery_time = recovery_time;
	}

	public String getHuman_file_status() {
		return human_file_status;
	}

	public void setHuman_file_status(String human_file_status) {
		this.human_file_status = human_file_status;
	}


	public Human_file_dig() {
		super();
	}


	
}
