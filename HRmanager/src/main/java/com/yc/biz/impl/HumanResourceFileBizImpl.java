package com.yc.biz.impl;

import java.util.List;

import com.yc.bean.Human_file;
import com.yc.bean.Human_file_dig;
import com.yc.biz.HumanResourceFileBiz;
import com.yc.dao.HumanResourceFileDao;

public class HumanResourceFileBizImpl implements HumanResourceFileBiz {

	private HumanResourceFileDao humanResourceFileDao;
	
	/**
	 * 查询所有的档案
	 */
	@Override
	public List<Human_file> getAllHuman_file() {
		List<Human_file> list= this.humanResourceFileDao.findAll(new Human_file(),  "getAllHuman_file");
		return list;
	}

	/**
	 * 根据档案编号查询
	 */
	@Override
	public Human_file getHuman_fileById(String human_id) {
		Human_file_dig hf = new Human_file_dig();
		hf.setHuman_id(human_id);
		List<Human_file> list= this.humanResourceFileDao.findAll(  hf  ,  "getHuman_fileById");
		return list != null && list.size() >0 ? list.get(0) : null ;
	}

	/**
	 * 根据姓名查询档案
	 */
	@Override
	public Human_file getHuman_fileByName(String human_name) {
		Human_file_dig hf = new Human_file_dig();
		hf.setHuman_id(human_name);
		List<Human_file> list= this.humanResourceFileDao.findAll(  hf  ,  "getHuman_fileByName");
		return list != null && list.size() >0 ? list.get(0) : null ;
	}

	/**
	 * 添加档案
	 */
	@Override
	public Human_file saveHuman_file(Human_file human_file) {
		this.humanResourceFileDao.add(  human_file , "saveHuman_file"  );
		return human_file;
	}

	/**
	 * 修改档案
	 */
	@Override
	public Human_file updateHuman_file(Human_file human_file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Human_file deleteHuman_file(Human_file human_file) {
		// TODO Auto-generated method stub
		return null;
	}

}
