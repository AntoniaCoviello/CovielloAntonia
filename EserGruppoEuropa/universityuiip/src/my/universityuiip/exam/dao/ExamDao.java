package my.universityuiip.exam.dao;

import java.util.List;

import my.universityuiip.model.ExamModel;


public interface ExamDao
{

	public List<ExamModel> findExamByStudent(String fullName);


}