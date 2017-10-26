package my.universityuiip.subject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.SubjectModel;
import my.universityuiip.subject.dao.SubjectDao;
import my.universityuiip.subject.service.SubjectService;


public class DefaultSubjectService implements SubjectService
{

	public SubjectDao subjectdao;


	public SubjectDao getSubjectdao()
	{
		return subjectdao;
	}

	@Required
	public void setSubjectdao(final SubjectDao subjectdao)
	{
		this.subjectdao = subjectdao;
	}

	@Override
	public SubjectModel getSubjectforUid(final String uid)
	{
		final List<SubjectModel> subjects = subjectdao.findSubjectByUid(uid);
		if (subjects.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (subjects.size() > 1)
		{
			System.out.println("Errore ci sono più elementi");
			return null;
		}
		else
		{
			return subjects.get(0);
		}


	}

}