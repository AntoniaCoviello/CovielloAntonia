package my.universityuiip.professor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.ProfessorModel;
import my.universityuiip.professor.dao.ProfessorDao;
import my.universityuiip.professor.service.ProfessorService;


public class DefaultProfessorService implements ProfessorService
{

	public ProfessorDao professordao;


	public ProfessorDao getProfessordao()
	{
		return professordao;
	}

	@Required
	public void setProfessordao(final ProfessorDao professordao)
	{
		this.professordao = professordao;
	}

	@Override
	public ProfessorModel getProfessorforSerialNumber(final String serialnumber)
	{
		final List<ProfessorModel> professors = professordao.findProfessorBySerialNumber(serialnumber);
		if (professors.isEmpty())
		{
			System.out.println("La lista è vuota");
			return null;
		}
		else if (professors.size() > 1)
		{
			System.out.println("Errore ci sono più elementi");
			return null;
		}
		else
		{
			return professors.get(0);
		}


	}

}