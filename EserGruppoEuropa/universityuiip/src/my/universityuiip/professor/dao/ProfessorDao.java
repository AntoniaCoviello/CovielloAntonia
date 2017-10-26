package my.universityuiip.professor.dao;

import java.util.List;

import my.universityuiip.model.ProfessorModel;


public interface ProfessorDao
{

	public List<ProfessorModel> findProfessorBySerialNumber(String serialnumber);


}