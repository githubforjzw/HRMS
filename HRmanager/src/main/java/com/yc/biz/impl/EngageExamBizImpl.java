package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.bean.Config_major;
import com.yc.bean.Config_question_first_kind;
import com.yc.bean.Config_question_second_kind;
import com.yc.bean.Engage_exam;
import com.yc.bean.Engage_exam_details;
import com.yc.bean.Engage_subjects;
import com.yc.bean.PaginationModel;
import com.yc.biz.EngageExamBiz;
import com.yc.dao.BaseDao;
@Service
public class EngageExamBizImpl implements EngageExamBiz {
	private BaseDao baseDao;
	@Resource(name = "baseDaoEngageExamImpl")
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	public BaseDao getBaseDao() {
		return baseDao;
	}
	/**
	 * 添加试题
	 */
	@Override
	public void addSubject(Engage_subjects engage_subjects) {
		this.baseDao.add(engage_subjects, "addSubject");
		
	}
	/**
	 * 删除试题
	 */
	@Override
	public void deleteSubject(Engage_subjects engage_subjects) {
		this.baseDao.del(engage_subjects,"deleteSubject");
	}
	/**
	 * 更新试题
	 */
	@Override
	public void updateSubject(Engage_subjects engage_subjects) {
		this.baseDao.update(engage_subjects, "updateSubject");
	}
	/**
	 * 查找所有试题(传入分页模型进行分页查询)
	 */
	@Override
	public List<Engage_subjects> findAllSubject(PaginationModel paginationModel) {
		List<Engage_subjects> list=this.baseDao.findAll(paginationModel, "findAllSubject");
		return list;
	}
	/**
	 * 根据试题一级和二级分类去查找
	 */
	@Override
	public List<Engage_subjects> findSubjectByKind(Engage_subjects engage_subjects) {
		List<Engage_subjects> list=this.baseDao.findAll(engage_subjects, "findSubjectByKind");
		return list;
	}
	/**
	 * 查找一级试题数量
	 */
	@Override
	public int findFirstSubjectCount(Config_question_first_kind config_question_first_kind) {
		int num=(int)this.baseDao.findFunc(config_question_first_kind, "findFirstSubjectCount");
		return num;
	}
	/**
	 * 查找二级试题数量
	 */
	@Override
	public int findSecondSubjectCount(Config_question_second_kind config_question_second_kind) {
		int num=(int)this.baseDao.findFunc(config_question_second_kind, "findSecondSubjectCount");
		return num;
	}
	/**
	 * 添加试卷详情
	 * 先判断题库中的相应分类的数量是否满足试卷的，不满足则返回失败信息
	 */
	@Override
	public void addEngageExamDetails(Engage_exam_details engage_exam_details) {
		int subjectCount=findSecondSubjectCount(engage_exam_details.getConfig_question_second_kind());
		if(subjectCount>=engage_exam_details.getQuestion_amount()){
			this.baseDao.add(engage_exam_details, "addEngageExamDetails");
		}else{
			throw new RuntimeException("添加失败:题库的相应分类下的试题数量低于您添加的试卷要求的数量");
		}
	}
	/**
	 * 根据试卷删除试卷详细信息
	 */
	@Override
	public void deleteEngageExamDetails(Engage_exam_details engage_exam_details) {
		this.baseDao.del(engage_exam_details, "deleteEngageExamDetails");
	}
	/**
	 * 
	 */
	@Override
	public void updateEngageExamDetails(Engage_exam_details engage_exam_details) {
		this.baseDao.update(engage_exam_details, "updateEngageExamDetails");
	}
	/**
	 * 
	 */
	@Override
	public List<Engage_exam_details> selectEngageExamDetails(Engage_exam_details engage_exam_details) {
		return this.baseDao.findAll(engage_exam_details, "selectEngageExamDetails");
	}
	/**
	 * 
	 */
	@Override
	public void addEngageExam(Config_major config_major,Engage_exam_details engage_exam_details) {
		this.baseDao.add(config_major, "addEngageExam");
		addEngageExamDetails(engage_exam_details);
	}
	/**
	 * 
	 */
	@Override
	public void updateEngageExam(Engage_exam engage_exam) {
		this.baseDao.update(engage_exam, "updateEngageExam");
	}
	/**
	 * 
	 */
	@Override
	public void deleteEngageExam(Engage_exam engage_exam,Engage_exam_details engage_exam_details) {
		this.baseDao.del(engage_exam, "deleteEngageExam");
		deleteEngageExamDetails(engage_exam_details);
	}
	/**
	 * 
	 */
	@Override
	public List<Engage_exam> selectEngageExam(Engage_exam engage_exam) {
		return this.baseDao.findAll(engage_exam, "selectEngageExam");
	}

	

}
