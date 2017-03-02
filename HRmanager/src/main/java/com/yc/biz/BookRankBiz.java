package com.yc.biz;

import java.util.List;

import com.yc.bean.BookRank;

public interface BookRankBiz {
	public List<BookRank> findAll(BookRank bookRank);
	public int add( BookRank bookRank );
	public int del( BookRank bookRank );
	public int update(BookRank bookRank );
}
