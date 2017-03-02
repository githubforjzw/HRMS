package com.yc.biz;

import java.util.List;

import com.yc.bean.Book;

public interface BookBiz {
	public List<Book> findAll(Book book);
	public int add(Book book);
	public int del(Book book);
	public int update(Book book);
}
