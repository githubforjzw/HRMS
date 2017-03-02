package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import com.yc.bean.BookRank;
import com.yc.biz.BookRankBiz;
import com.yc.dao.BaseDao;

public class BookRankBizImpl implements BookRankBiz {
	private BaseDao<BookRank> baseDao;

	public BaseDao<BookRank> getBaseDao() {
		return baseDao;
	}

	@Resource(name="baseDaoMybatisImpl")
	public void setBaseDao(BaseDao<BookRank> baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public List<BookRank> findAll(BookRank bookRank) {
		return this.baseDao.findAll( bookRank , "getScores" );
	}

	@Override
	public int add(BookRank bookRank) {
		return this.baseDao.add( bookRank , "addScores" );
	}

	@Override
	public int del(BookRank bookRank) {
		return 0;
	}

	@Override
	public int update(BookRank bookRank) {
		return 0;
	}

}
