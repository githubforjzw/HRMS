package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.Book;
import com.yc.biz.BookBiz;
import com.yc.dao.BaseDao;

@Service
public class BookBizImpl implements BookBiz {
	private BaseDao<Book> baseDao;
	
	
	public BaseDao<Book> getBaseDao() {
		return baseDao;
	}
	
	@Resource(name="baseDaoMybatisImpl")
	public void setBaseDao(BaseDao<Book> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<Book> findAll(Book book) {
		return this.baseDao.findAll(book, "findBook");
	}

	@Override
	public int add(Book book) {
		return this.baseDao.add(book, "addBook");
	}

	@Override
	public int del(Book book) {
		return this.baseDao.del(book, "delBook");
	}

	@Override
	public int update(Book book) {
		return this.baseDao.update(book, "updateBook");
	}

}
