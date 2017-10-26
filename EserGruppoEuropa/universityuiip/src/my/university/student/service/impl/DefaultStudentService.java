package my.university.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.StudentModel;
import my.universityuiip.student.dao.StudentDao;
import my.universityuiip.student.service.StudentService;


public class DefaultStudentService implements StudentService
{

	public StudentDao studentdao;


	public StudentDao getStudentdao()
	{
		return studentdao;
	}

	@Required
	public void setStudentdao(final StudentDao studentdao)
	{
		this.studentdao = studentdao;
	}

	@Override
	public StudentModel getStudentforSerialNumber(final String serialnumber)
	{
		final List<StudentModel> students = studentdao.findStudentBySerialNumber(serialnumber);
		if (students.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (students.size() > 1)
		{
			System.out.println("Errore ci sono più elementi");
			return null;
		}
		else
		{
			return students.get(0);
		}


	}

}
