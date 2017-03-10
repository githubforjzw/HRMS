package com.yc.bean;

import java.io.Serializable;

public class PaginationModel implements Serializable{
	private static final long serialVersionUID = -4854744287596164081L;
	private Integer pageStart;
	private Integer pageEnd;
	private boolean isOrderById;
	
	
	
	public boolean isOrderById() {
		return isOrderById;
	}
	public void setOrderById(boolean isOrderById) {
		this.isOrderById = isOrderById;
	}
	public PaginationModel() {
		super();
	}
	public Integer getPageStart() {
		return pageStart;
	}
	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}
	public Integer getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(Integer pageEnd) {
		this.pageEnd = pageEnd;
	}
	@Override
	public String toString() {
		return "PaginationModel [pageStart=" + pageStart + ", pageEnd=" + pageEnd + ", isOrderById=" + isOrderById
				+ "]";
	}

	
}
