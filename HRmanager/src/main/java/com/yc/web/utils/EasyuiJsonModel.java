package com.yc.web.utils;

import java.io.Serializable;
import java.util.List;

import com.yc.bean.Engage_exam;

public class EasyuiJsonModel implements Serializable{
	private static final long serialVersionUID = 8399902295832892854L;
	private String total;
	private List<Engage_exam> rows;
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public List<Engage_exam> getRows() {
		return rows;
	}
	public void setRows(List<Engage_exam> rows) {
		this.rows = rows;
	}
	public EasyuiJsonModel() {
		super();
	}
	@Override
	public String toString() {
		return "EasyuiJsonModel [total=" + total + ", rows=" + rows + "]";
	}
	
	
	
	
}
