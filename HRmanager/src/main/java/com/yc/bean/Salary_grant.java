package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Salary_grant implements Serializable{

	private static final long serialVersionUID = -2960312705667200996L;

	private int sgr_id ;
	private String salary_grant_id ;
	private String salary_standard_id ;
	private String first_kind_id ;
	private String first_kind_name ;
	private String second_kind_id ;
	private String second_kind_name ;
	private String third_kind_id ;
	private String third_kind_name ;
	private int human_amount ;
	private DecimalFormat salary_standard_sum ;
	private DecimalFormat salary_paid_sum;
	private String register ;
	private Timestamp regist_time ;
	private String checker ;
	private Timestamp check_time ;
	private int check_status  ;
	
	@Override
	public String toString() {
		return "Salary_grant [sgr_id=" + sgr_id + ", salary_grant_id=" + salary_grant_id + ", salary_standard_id="
				+ salary_standard_id + ", first_kind_id=" + first_kind_id + ", first_kind_name=" + first_kind_name
				+ ", second_kind_id=" + second_kind_id + ", second_kind_name=" + second_kind_name + ", third_kind_id="
				+ third_kind_id + ", third_kind_name=" + third_kind_name + ", human_amount=" + human_amount
				+ ", salary_standard_sum=" + salary_standard_sum + ", salary_paid_sum=" + salary_paid_sum
				+ ", register=" + register + ", regist_time=" + regist_time + ", checker=" + checker + ", check_time="
				+ check_time + ", check_status=" + check_status + "]";
	}

	public int getSgr_id() {
		return sgr_id;
	}

	public void setSgr_id(int sgr_id) {
		this.sgr_id = sgr_id;
	}

	public String getSalary_grant_id() {
		return salary_grant_id;
	}

	public void setSalary_grant_id(String salary_grant_id) {
		this.salary_grant_id = salary_grant_id;
	}

	public String getSalary_standard_id() {
		return salary_standard_id;
	}

	public void setSalary_standard_id(String salary_standard_id) {
		this.salary_standard_id = salary_standard_id;
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

	public String getSecond_kind_id() {
		return second_kind_id;
	}

	public void setSecond_kind_id(String second_kind_id) {
		this.second_kind_id = second_kind_id;
	}

	public String getSecond_kind_name() {
		return second_kind_name;
	}

	public void setSecond_kind_name(String second_kind_name) {
		this.second_kind_name = second_kind_name;
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

	public int getHuman_amount() {
		return human_amount;
	}

	public void setHuman_amount(int human_amount) {
		this.human_amount = human_amount;
	}

	public DecimalFormat getSalary_standard_sum() {
		return salary_standard_sum;
	}

	public void setSalary_standard_sum(DecimalFormat salary_standard_sum) {
		this.salary_standard_sum = salary_standard_sum;
	}

	public DecimalFormat getSalary_paid_sum() {
		return salary_paid_sum;
	}

	public void setSalary_paid_sum(DecimalFormat salary_paid_sum) {
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

	public int getCheck_status() {
		return check_status;
	}

	public void setCheck_status(int check_status) {
		this.check_status = check_status;
	}
	
	
}
