package com.yc.biz;

import java.util.List;

import com.yc.bean.Human_file;

public interface HumanResourceFileBiz {

	/**
	 * 查询都要根据档案的状态进行查询
	 * @return
	 */
	List<Human_file> getAllHuman_file();		//取得所有的档案
	
	Human_file getHuman_fileById( String human_id );		//根据档案编号查询档案
	
	Human_file getHuman_fileByName( String human_name );			//根据姓名查询档案
	
	Human_file saveHuman_file( Human_file human_file );				//存储档案
	
	Human_file updateHuman_file( Human_file human_file );			//修改档案
	
	Human_file deleteHuman_file( Human_file human_file ) ;			//档案的删除   将档案的状态改为0
	
	//分页查询数据
	
}
