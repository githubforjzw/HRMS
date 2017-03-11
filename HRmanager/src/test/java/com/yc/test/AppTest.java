package com.yc.test;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.bean.Config_major;
import com.yc.bean.Config_major_kind;
import com.yc.bean.Config_question_first_kind;
import com.yc.bean.Config_question_second_kind;
import com.yc.bean.Engage_exam;
import com.yc.bean.Engage_subjects;
import com.yc.bean.PaginationModel;
import com.yc.web.utils.UUIDHexGenerator;

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
	
	public void testApp3() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		System.out.println( ac.getBean("sqlSessionFactory")  );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		System.out.println( ds );
		Engage_subjects engage_subjects=new Engage_subjects();
		Config_question_first_kind config_question_first_kind=new Config_question_first_kind();
		config_question_first_kind.setFirst_kind_id("1");
		config_question_first_kind.setFirst_kind_name("基础类");
		Config_question_second_kind config_question_second_kind=new Config_question_second_kind();
		config_question_second_kind.setConfig_question_first_kind(config_question_first_kind);
		config_question_second_kind.setSecond_kind_id("1");
		config_question_second_kind.setSecond_kind_name("语言类");
		engage_subjects.setConfig_question_second_kind(config_question_second_kind);
		engage_subjects.setRegister("京太郎");
		engage_subjects.setRegist_time(new Timestamp(System.currentTimeMillis()) );
		engage_subjects.setDerivation("源辰科技有限公司");
		engage_subjects.setContent("世界上最强的语言");
		engage_subjects.setKey_a("C++");
		engage_subjects.setKey_b("Java");
		engage_subjects.setKey_c("Javascript");
		engage_subjects.setKey_d("Ruby");
		engage_subjects.setKey_e("Python");
		engage_subjects.setCorrect_key("C++");
		engage_subjects.setChanger("京太郎");
		engage_subjects.setChange_time(new Timestamp(System.currentTimeMillis()) );
		SqlSession ss=ds.openSession();
		ss.insert("addSubject", engage_subjects);
		
	}
	
	
	public void testApp4() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		Engage_subjects engage_subjects=new Engage_subjects();
		engage_subjects.setContent("世界上最强的语言");
		SqlSession ss=ds.openSession();
		ss.insert("singleDeleteSubject", engage_subjects);
		
	}
	
	public void testApp5() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		Engage_subjects engage_subjects=new Engage_subjects();
		Config_question_first_kind config_question_first_kind=new Config_question_first_kind();
		config_question_first_kind.setFirst_kind_name("基础类");
		Config_question_second_kind config_question_second_kind=new Config_question_second_kind();
		config_question_second_kind.setConfig_question_first_kind(config_question_first_kind);
		engage_subjects.setConfig_question_second_kind(config_question_second_kind);
		engage_subjects.setSub_id(8);
		SqlSession ss=ds.openSession();
		ss.update("updateSubject", engage_subjects);
	}
	
	
	public void testApp6() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		PaginationModel paginationModel=new PaginationModel();
		paginationModel.setPageStart(0);
		paginationModel.setPageEnd(1);
		paginationModel.setOrderById(true);
		SqlSession ss=ds.openSession();
		List<Engage_subjects> list=ss.selectList("findAllSubject", paginationModel);
		System.out.println(list);
	}
	
	public void testApp7() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		Engage_subjects engage_subjects=new Engage_subjects();
		Config_question_first_kind config_question_first_kind=new Config_question_first_kind();
		config_question_first_kind.setFirst_kind_name("基础类");
		Config_question_second_kind config_question_second_kind=new Config_question_second_kind();
		config_question_second_kind.setConfig_question_first_kind(config_question_first_kind);
		engage_subjects.setConfig_question_second_kind(config_question_second_kind);
		SqlSession ss=ds.openSession();
		List<Engage_subjects> list=ss.selectList("findSubjectByKind", engage_subjects);
		System.out.println(list);
	}
	
	public void testApp8() throws SQLException {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		SqlSession ss=ds.openSession();
		Config_question_first_kind config_question_first_kind=new Config_question_first_kind();
		Config_question_second_kind config_question_second_kind=new Config_question_second_kind();
		config_question_first_kind.setFirst_kind_id("1");
		config_question_second_kind.setSecond_kind_id("1");
		int a=ss.selectOne("findFirstSubjectCount",config_question_first_kind);
		int b=ss.selectOne("findSecondSubjectCount",config_question_second_kind);
		System.out.println(a+"-"+b);
	}
	
	public void testApp9() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		SqlSession ss=ds.openSession();
		Engage_exam engage_exam=new Engage_exam();
		engage_exam.setExam_number(UUIDHexGenerator.getUniqueID2());
		Config_major_kind config_major_kind=new Config_major_kind();
		config_major_kind.setMajor_kind_id("1");
		config_major_kind.setMajor_kind_name("销售");
		Config_major config_major=new Config_major();
		config_major.setConfig_major_kind(config_major_kind);
		config_major.setMajor_id("01");
		config_major.setMajor_name("区域经理");
		engage_exam.setConfig_major(config_major);
		engage_exam.setLimite_time(2);
		engage_exam.setRegist_time(new Timestamp(System.currentTimeMillis()));
		engage_exam.setRegister("Geek");
		int i=ss.insert("addEngageExam", engage_exam);
		System.out.println("成功插入了吗?"+i);
	}
	
	public void testApp10() throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext( "beans.xml" );
		assertNotNull( ac.getBean("sqlSessionFactory") );
		SqlSessionFactory ds=(SqlSessionFactory)ac.getBean("sqlSessionFactory");
		SqlSession ss=ds.openSession();
		Engage_exam engage_exam=new Engage_exam();
		engage_exam.setLimite_time(56);
		engage_exam.setRegister("AKKKK");
		engage_exam.setExam_number("d7a952f3201703102103289");
		int i=ss.update("updateEngageExam", engage_exam);
	}

}









