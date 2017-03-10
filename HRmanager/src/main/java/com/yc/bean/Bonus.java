package com.yc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Bonus implements Serializable{

	private static final long serialVersionUID = -444755239592113035L;

	private int bon_id ;
	private Config_major config_major;
	private String human_id ;
	private String human_name ;
	private String bonus_item;
	private BigDecimal bonus_worth;
	private String bonus_degree ;
	private String remark;
	private String register ;
	private String checker ;
	private Timestamp regist_time ;
	private Timestamp check_time ;
	private String check_status ;
	
	
}
