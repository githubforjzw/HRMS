package com.yc.biz;

import java.util.List;

import com.yc.bean.Category;

public interface CategoryBiz {
	public List<Category> findAll(Category category);
	public int add( Category category );
	public int del( Category category );
	public int update( Category category );
}
