package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.Category;
import com.yc.biz.CategoryBiz;
import com.yc.dao.BaseDao;

@Service
public class CategoryBizImpl implements CategoryBiz {
	private BaseDao<Category> baseDao;
	
	
	public BaseDao<Category> getBaseDao() {
		return baseDao;
	}
	
	@Resource(name="baseDaoMybatisImpl")
	public void setBaseDao(BaseDao<Category> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<Category> findAll(Category category) {
		return this.baseDao.findAll(category, "findAll");
	}

	@Override
	public int add(Category category) {
		return 0;
	}

	@Override
	public int del(Category category) {
		return 0;
	}

	@Override
	public int update(Category category) {
		return 0;
	}


}
