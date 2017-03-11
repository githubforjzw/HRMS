package com.yc.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Engage_interview implements Serializable{

	private static final long serialVersionUID = 8169079022695109411L;

	private Integer ein_id ;
	private Engage_resume engage_resume;
	private Integer Integererview_amount ;
	private Config_major config_major;
	private String image_degree ;
	private String native_language_degree  ;
	private String foreign_language_degree ;
	private String response_speed_degree  ;
	private String EQ_degree ;
	private String IQ_degree ;
	private String multi_quality_degree ;
	private String register  ;
	private String checker ;
	private Timestamp registe_time ;
	private Timestamp check_time  ;
	private Integer resume_id ;
	private String result;
	private String Integererview_comment  ;
	private String check_comment ;
	private Integer Integererview_status ;
	private Integer check_status ;
	
	@Override
	public String toString() {
		return "Engage_Integererview [ein_id=" + ein_id + ", human_name=" + engage_resume.getHuman_name() + ", Integererview_amount="
				+ Integererview_amount + ", human_major_kind_id=" + config_major.getConfig_major_kind().getMajor_kind_id() + ", human_major_kind_name="
				+ config_major.getConfig_major_kind().getMajor_kind_name() + ", human_major_id=" + config_major.getMajor_id() + ", human_major_name="
				+ config_major.getMajor_name() + ", image_degree=" + image_degree + ", native_language_degree="
				+ native_language_degree + ", foreign_language_degree=" + foreign_language_degree
				+ ", response_speed_degree=" + response_speed_degree + ", EQ_degree=" + EQ_degree + ", IQ_degree="
				+ IQ_degree + ", multi_quality_degree=" + multi_quality_degree + ", register=" + register + ", checker="
				+ checker + ", registe_time=" + registe_time + ", check_time=" + check_time + ", resume_id=" + resume_id
				+ ", result=" + result + ", Integererview_comment=" + Integererview_comment + ", check_comment=" + check_comment
				+ ", Integererview_status=" + Integererview_status + ", check_status=" + check_status + "]";
	}

	public Integer getEin_id() {
		return ein_id;
	}

	public void setEin_id(Integer ein_id) {
		this.ein_id = ein_id;
	}


	public Engage_resume getEngage_resume() {
		return engage_resume;
	}

	public void setEngage_resume(Engage_resume engage_resume) {
		this.engage_resume = engage_resume;
	}

	public Integer getIntegererview_amount() {
		return Integererview_amount;
	}

	public void setIntegererview_amount(Integer Integererview_amount) {
		this.Integererview_amount = Integererview_amount;
	}


	public String getImage_degree() {
		return image_degree;
	}

	public void setImage_degree(String image_degree) {
		this.image_degree = image_degree;
	}

	public String getNative_language_degree() {
		return native_language_degree;
	}

	public void setNative_language_degree(String native_language_degree) {
		this.native_language_degree = native_language_degree;
	}

	public String getForeign_language_degree() {
		return foreign_language_degree;
	}

	public void setForeign_language_degree(String foreign_language_degree) {
		this.foreign_language_degree = foreign_language_degree;
	}

	public String getResponse_speed_degree() {
		return response_speed_degree;
	}

	public void setResponse_speed_degree(String response_speed_degree) {
		this.response_speed_degree = response_speed_degree;
	}

	public String getEQ_degree() {
		return EQ_degree;
	}

	public void setEQ_degree(String eQ_degree) {
		EQ_degree = eQ_degree;
	}

	public String getIQ_degree() {
		return IQ_degree;
	}

	public void setIQ_degree(String iQ_degree) {
		IQ_degree = iQ_degree;
	}

	public String getMulti_quality_degree() {
		return multi_quality_degree;
	}

	public void setMulti_quality_degree(String multi_quality_degree) {
		this.multi_quality_degree = multi_quality_degree;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getRegiste_time() {
		return registe_time;
	}

	public void setRegiste_time(Timestamp registe_time) {
		this.registe_time = registe_time;
	}

	public Timestamp getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}

	public Integer getResume_id() {
		return resume_id;
	}

	public void setResume_id(Integer resume_id) {
		this.resume_id = resume_id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getIntegererview_comment() {
		return Integererview_comment;
	}

	public void setIntegererview_comment(String Integererview_comment) {
		this.Integererview_comment = Integererview_comment;
	}

	public String getCheck_comment() {
		return check_comment;
	}

	public void setCheck_comment(String check_comment) {
		this.check_comment = check_comment;
	}

	public Integer getIntegererview_status() {
		return Integererview_status;
	}

	public void setIntegererview_status(Integer Integererview_status) {
		this.Integererview_status = Integererview_status;
	}

	public Integer getCheck_status() {
		return check_status;
	}

	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}

	public Config_major getConfig_major() {
		return config_major;
	}

	public void setConfig_major(Config_major config_major) {
		this.config_major = config_major;
	}

	public Engage_interview() {
		super();
	}

	

	
	
	
}
