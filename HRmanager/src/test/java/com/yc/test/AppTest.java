package com.yc.test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.bean.Category;
import com.yc.biz.CategoryBiz;
import com.yc.dao.BaseDao;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{

	public AppTest( String testName ){
		super( testName );
	}

	public static Test suite(){
		return new TestSuite( AppTest.class );
	}

	public void testApp() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("dataSource") );
		System.out.println( ac.getBean("dataSource")  );
		DataSource ds=(DataSource)ac.getBean("dataSource");
		System.out.println( ds.getConnection() );
	}

	public void testApp2() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		System.out.println( ac.getBean("sqlSessionFactory")  );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		System.out.println( ds );
	}

	//findAll 简单查询
	public void testApp3() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		@SuppressWarnings("unchecked")
		BaseDao<Category> pd=(BaseDao<Category>) ac.getBean("baseDaoMybatisImpl");
		Category category=new Category();
		List<Category> list=pd.findAll(category,"findAll");
		for (Category p : list) {
			System.out.println( p );
		}
	}
	
	public void testApp4() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		CategoryBiz pb=(CategoryBiz) ac.getBean("categoryBizImpl");
		Category category=new Category();
		List<Category> list=pb.findAll(category);
		for (Category c : list) {
			System.out.println( c );
		}
	}

}









