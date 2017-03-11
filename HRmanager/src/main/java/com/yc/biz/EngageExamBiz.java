package com.yc.biz;

import java.util.List;

import com.yc.bean.Config_major;
import com.yc.bean.Config_question_first_kind;
import com.yc.bean.Config_question_second_kind;
import com.yc.bean.Engage_exam;
import com.yc.bean.Engage_exam_details;
import com.yc.bean.Engage_subjects;
import com.yc.bean.PaginationModel;

public interface EngageExamBiz {
	public void addSubject (Engage_subjects engage_subjects);
	public void deleteSubject(Engage_subjects engage_subjects);
	
	public void updateSubject(Engage_subjects engage_subjects);
	
	public List<Engage_subjects> findAllSubject(PaginationModel paginationModel);
	
	public List<Engage_subjects> findSubjectByKind(Engage_subjects engage_subjects);
	
	public int findFirstSubjectCount(Config_question_first_kind config_question_first_kind);
	
	public int findSecondSubjectCount(Config_question_second_kind config_question_second_kind);
	
	public void addEngageExamDetails(Engage_exam_details engage_exam_details);
	
	public void deleteEngageExamDetails(Engage_exam_details engage_exam_details);
	
	public void updateEngageExamDetails(Engage_exam_details engage_exam_details);
	
	public List<Engage_exam_details> selectEngageExamDetails(Engage_exam_details engage_exam_details);
	
	public void addEngageExam(Config_major config_major,Engage_exam_details engage_exam_details);
	
	public void updateEngageExam(Engage_exam engage_exam);
	
	public void deleteEngageExam(Engage_exam engage_exam,Engage_exam_details engage_exam_details);
	
	public List<Engage_exam> selectEngageExam(Engage_exam engage_exam);
	
}
