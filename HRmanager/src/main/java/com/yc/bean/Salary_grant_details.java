package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Salary_grant_details implements Serializable{

	private static final long serialVersionUID = 6386505438592564192L;

	private Integer grd_id;
	private Salary_grant salary_grant;
	private Human_file_dig human_file_dig;
	private BigDecimal bouns_sum ;
	private BigDecimal sale_sum ;
	private BigDecimal deduct_sum ;
	private BigDecimal salary_standard_sum ;
	private BigDecimal salary_paid_sum ;
	
	@Override
	public String toString() {
		return "Salary_grant_details [grd_id=" + grd_id + ", salary_grant_id=" + salary_grant.getSalary_standard().getSsd_id() + ", human_id="
				+ human_file_dig.getHuman_id() + ", human_name=" + human_file_dig.getEngage_resume().getHuman_name() + ", bouns_sum=" + bouns_sum + ", sale_sum=" + sale_sum
				+ ", deduct_sum=" + deduct_sum + ", salary_standard_sum=" + salary_standard_sum + ", salary_paid_sum="
				+ salary_paid_sum + "]";
	}

	public Integer getGrd_id() {
		return grd_id;
	}

	public void setGrd_id(Integer grd_id) {
		this.grd_id = grd_id;
	}

	public Salary_grant getSalary_grant() {
		return salary_grant;
	}

	public void setSalary_grant(Salary_grant salary_grant) {
		this.salary_grant = salary_grant;
	}

	public Human_file_dig getHuman_file_dig() {
		return human_file_dig;
	}

	public void setHuman_file_dig(Human_file_dig human_file_dig) {
		this.human_file_dig = human_file_dig;
	}

	public BigDecimal getBouns_sum() {
		return bouns_sum;
	}

	public void setBouns_sum(BigDecimal bouns_sum) {
		this.bouns_sum = bouns_sum;
	}

	public BigDecimal getSale_sum() {
		return sale_sum;
	}

	public void setSale_sum(BigDecimal sale_sum) {
		this.sale_sum = sale_sum;
	}

	public BigDecimal getDeduct_sum() {
		return deduct_sum;
	}

	public void setDeduct_sum(BigDecimal deduct_sum) {
		this.deduct_sum = deduct_sum;
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


	public Salary_grant_details() {
		super();
	}

	
	
}
