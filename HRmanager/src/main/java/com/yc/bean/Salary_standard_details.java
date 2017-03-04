package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DecimalFormat;

public class Salary_standard_details implements Serializable{

	private static final long serialVersionUID = 4842541281931081662L;

	private int sdt_id ;
	private String  standard_id ;
	private String  standard_name ;
	private int  item_id ;
	private String  item_name;
	private DecimalFormat  salary ;
	
	@Override
	public String toString() {
		return "Salary_standard_details [sdt_id=" + sdt_id + ", standard_id=" + standard_id + ", standard_name="
				+ standard_name + ", item_id=" + item_id + ", item_name=" + item_name + ", salary=" + salary + "]";
	}

	public int getSdt_id() {
		return sdt_id;
	}

	public void setSdt_id(int sdt_id) {
		this.sdt_id = sdt_id;
	}

	public String getStandard_id() {
		return standard_id;
	}

	public void setStandard_id(String standard_id) {
		this.standard_id = standard_id;
	}

	public String getStandard_name() {
		return standard_name;
	}

	public void setStandard_name(String standard_name) {
		this.standard_name = standard_name;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public DecimalFormat getSalary() {
		return salary;
	}

	public void setSalary(DecimalFormat salary) {
		this.salary = salary;
	}
	
	
}
