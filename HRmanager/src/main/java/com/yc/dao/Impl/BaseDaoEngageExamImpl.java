package com.yc.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.yc.dao.BaseDao;

@Repository
public class BaseDaoEngageExamImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
	
	private String mapperLocation="com.yc.mapper.";
	
	@Override
	@Resource(name="sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory( sqlSessionFactory );
	}
	private String getMapperId(T t,String SqlId ){
		return mapperLocation+t.getClass().getSimpleName()+"Mapper."+SqlId;
	}
	@Override
	public List<T> findAll(T t,String SqlId) {
		return super.getSqlSession().selectList(  getMapperId(t, SqlId) ,t);
	}
	
	@Override
	public List<T> find(T t, Map<?, ?> map, String SqlId) {
		return super.getSqlSession().selectList(  getMapperId(t, SqlId) ,map);
	}
	@Override
	public int add(T t, String SqlId) {
		return super.getSqlSession().insert(  getMapperId(t, SqlId),t );
	}
	@Override
	public int add(T t, Map<?, ?> map, String SqlId) {
		return super.getSqlSession().insert(  getMapperId(t, SqlId) ,map );
	}
	@Override
	public int addMany(T t, List<?> list, String SqlId) {
		return super.getSqlSession().insert(  getMapperId(t, SqlId) ,list );
	}
	@Override
	public int del(T t, String SqlId) {
		return super.getSqlSession().delete(  getMapperId(t, SqlId), t );
	}
	@Override
	public int del(T t, Map<?, ?> map, String SqlId) {
		return super.getSqlSession().delete(  getMapperId(t, SqlId), map );
	}
	@Override
	public int delMany(T t, List<?> list, String SqlId) {
		return super.getSqlSession().delete(  getMapperId(t, SqlId), list );
	}
	@Override
	public int update(T t, String SqlId) {
		return super.getSqlSession().update(  getMapperId(t, SqlId), t );
	}
	@Override
	public int update(T t, Map<?, ?> map, String SqlId) {
		return super.getSqlSession().update(  getMapperId(t, SqlId), map );
	}
	@Override
	public int updateMany(T t,List<?> list, String SqlId) {
		return super.getSqlSession().update(  this.getMapperId(t, SqlId), list );
	}
	@Override
	public double findFunc(T t, String SqlId) {
		return super.getSqlSession().selectOne(  this.getMapperId(t, SqlId) );
	}
	@Override
	public double findFunc(T t, Map<?, ?> map, String SqlId) {
		return super.getSqlSession().selectOne(  this.getMapperId(t, SqlId), map );
	}


}






