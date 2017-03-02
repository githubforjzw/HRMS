package com.yc.bean;

import java.io.Serializable;

public class BookRank implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer rid;
	private Integer bid;
	private String ip;
	private double scores;
	
	@Override
	public String toString() {
		return "BookRank [rid=" + rid + ", bid=" + bid + ", ip=" + ip + ", scores=" + scores + "]";
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public double getScores() {
		return scores;
	}

	public void setScores(double scores) {
		this.scores = scores;
	}
	
	
	
}
