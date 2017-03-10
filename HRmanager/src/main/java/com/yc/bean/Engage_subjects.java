package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_subjects implements Serializable{

	private static final long serialVersionUID = -5814234088555871841L;

	private int sub_id ;
	private Config_question_second_kind config_question_second_kind;
	private String register ;
	private Timestamp regist_time  ;
	private String derivation ;
	private String content ;
	private String key_a  ;
	private String key_b  ;
	private String key_c ;
	private String key_d ;
	private String key_e  ;
	private String correct_key ;
	private String changer  ;
	private Timestamp change_time ;
	public Engage_subjects() {
		super();
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public Config_question_second_kind getConfig_question_second_kind() {
		return config_question_second_kind;
	}
	public void setConfig_question_second_kind(Config_question_second_kind config_question_second_kind) {
		this.config_question_second_kind = config_question_second_kind;
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
	public String getDerivation() {
		return derivation;
	}
	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKey_a() {
		return key_a;
	}
	public void setKey_a(String key_a) {
		this.key_a = key_a;
	}
	public String getKey_b() {
		return key_b;
	}
	public void setKey_b(String key_b) {
		this.key_b = key_b;
	}
	public String getKey_c() {
		return key_c;
	}
	public void setKey_c(String key_c) {
		this.key_c = key_c;
	}
	public String getKey_d() {
		return key_d;
	}
	public void setKey_d(String key_d) {
		this.key_d = key_d;
	}
	public String getKey_e() {
		return key_e;
	}
	public void setKey_e(String key_e) {
		this.key_e = key_e;
	}
	public String getCorrect_key() {
		return correct_key;
	}
	public void setCorrect_key(String correct_key) {
		this.correct_key = correct_key;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public Timestamp getChange_time() {
		return change_time;
	}
	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Engage_subjects [sub_id=" + sub_id + ", config_question_second_kind=" + config_question_second_kind + ", register=" + register
				+ ", regist_time=" + regist_time + ", derivation=" + derivation + ", content=" + content + ", key_a="
				+ key_a + ", key_b=" + key_b + ", key_c=" + key_c + ", key_d=" + key_d + ", key_e=" + key_e
				+ ", correct_key=" + correct_key + ", changer=" + changer + ", change_time=" + change_time + "]";
	}
	
	
}
