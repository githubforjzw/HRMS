package com.yc.bean;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Salary_grant_details implements Serializable{

	private static final long serialVersionUID = 6386505438592564192L;

	private int grd_id;
	private String salary_grant_id  ;
	private String human_id;
	private String human_name ;
	private DecimalFormat bouns_sum ;
	private DecimalFormat sale_sum ;
	private DecimalFormat deduct_sum ;
	private DecimalFormat salary_standard_sum ;
	private DecimalFormat salary_paid_sum ;
	
	@Override
	public String toString() {
		return "Salary_grant_details [grd_id=" + grd_id + ", salary_grant_id=" + salary_grant_id + ", human_id="
				+ human_id + ", human_name=" + human_name + ", bouns_sum=" + bouns_sum + ", sale_sum=" + sale_sum
				+ ", deduct_sum=" + deduct_sum + ", salary_standard_sum=" + salary_standard_sum + ", salary_paid_sum="
				+ salary_paid_sum + "]";
	}

	public int getGrd_id() {
		return grd_id;
	}

	public void setGrd_id(int grd_id) {
		this.grd_id = grd_id;
	}

	public String getSalary_grant_id() {
		return salary_grant_id;
	}

	public void setSalary_grant_id(String salary_grant_id) {
		this.salary_grant_id = salary_grant_id;
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

	public DecimalFormat getBouns_sum() {
		return bouns_sum;
	}

	public void setBouns_sum(DecimalFormat bouns_sum) {
		this.bouns_sum = bouns_sum;
	}

	public DecimalFormat getSale_sum() {
		return sale_sum;
	}

	public void setSale_sum(DecimalFormat sale_sum) {
		this.sale_sum = sale_sum;
	}

	public DecimalFormat getDeduct_sum() {
		return deduct_sum;
	}

	public void setDeduct_sum(DecimalFormat deduct_sum) {
		this.deduct_sum = deduct_sum;
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
	
	
}
