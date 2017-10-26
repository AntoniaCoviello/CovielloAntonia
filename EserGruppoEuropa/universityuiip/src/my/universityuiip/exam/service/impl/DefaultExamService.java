package my.universityuiip.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.exam.dao.ExamDao;
import my.universityuiip.exam.service.ExamService;
import my.universityuiip.model.ExamModel;


public class DefaultExamService implements ExamService
{

	public ExamDao examdao;


	public ExamDao getExamdao()
	{
		return examdao;
	}

	@Required
	public void setExamdao(final ExamDao examdao)
	{
		this.examdao = examdao;
	}

	@Override
	public ExamModel getExamforStudent(final String fullName)
	{
		final List<ExamModel> exams = examdao.findExamByStudent(fullName);
		if (exams.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (exams.size() > 1)
		{
			System.out.println("Errore ci sono più elementi");
			return null;
		}
		else
		{
			return exams.get(0);
		}


	}

}