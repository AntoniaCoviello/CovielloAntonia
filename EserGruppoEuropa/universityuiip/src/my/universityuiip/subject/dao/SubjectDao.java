package my.universityuiip.subject.dao;

import java.util.List;

import my.universityuiip.model.SubjectModel;


public interface SubjectDao
{

	public List<SubjectModel> findSubjectByUid(String uid);


}