package com.yc.bean;

import java.io.Serializable;

public class Users implements Serializable{
	private static final long serialVersionUID = -3220524979133728461L;


	private Integer u_id ;
	private String u_name ;
	private String u_true_name ;
	private String u_password ;
	private String u_role;
	
	public Integer getU_id() {
		return u_id;
	}
	
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	
	public String getU_name() {
		return u_name;
	}
	
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	public String getU_true_name() {
		return u_true_name;
	}
	
	public void setU_true_name(String u_true_name) {
		this.u_true_name = u_true_name;
	}
	
	public String getU_password() {
		return u_password;
	}
	
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getU_role() {
		return u_role;
	}

	public void setU_role(String u_role) {
		this.u_role = u_role;
	}

	
	@Override
	public String toString() {
		return "Users [u_id=" + u_id + ", u_name=" + u_name + ", u_true_name=" + u_true_name + ", u_password="
				+ u_password + ", u_role=" + u_role + "]";
	}

	public Users() {
		super();
	}

	
	
}
