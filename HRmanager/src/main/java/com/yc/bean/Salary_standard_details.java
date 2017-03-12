package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Salary_standard_details implements Serializable{

	private static final long serialVersionUID = 4842541281931081662L;

	private Integer sdt_id ;
	private Salary_standard salary_standard;
	private Integer  item_id ;
	private String  item_name;
	private BigDecimal  salary ;
	
	@Override
	public String toString() {
		return "Salary_standard_details [sdt_id=" + sdt_id + ", standard_id=" + salary_standard.getStandard_id() + ", standard_name="
				+ salary_standard.getStandard_name() + ", item_id=" + item_id + ", item_name=" + item_name + ", salary=" + salary + "]";
	}

	public Integer getSdt_id() {
		return sdt_id;
	}

	public void setSdt_id(Integer sdt_id) {
		this.sdt_id = sdt_id;
	}


	public Salary_standard getSalary_standard() {
		return salary_standard;
	}

	public void setSalary_standard(Salary_standard salary_standard) {
		this.salary_standard = salary_standard;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Salary_standard_details() {
		super();
	}

	
	
}
