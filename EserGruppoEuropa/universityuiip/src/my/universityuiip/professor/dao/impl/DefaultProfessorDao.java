package my.universityuiip.professor.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.model.ProfessorModel;
import my.universityuiip.professor.dao.ProfessorDao;


public class DefaultProfessorDao extends AbstractItemDao implements ProfessorDao
{

	@Override
	public List<ProfessorModel> findProfessorBySerialNumber(final String serialnumber)
	{
		final String queryStr = "SELECT {PK} FROM {Professor} WHERE {serialnumber}=?serialnumber";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("serialnumber", serialnumber);
		final SearchResult<ProfessorModel> result = getFlexibleSearchService().search(fsq);
		final List<ProfessorModel> professors = result.getResult();
		return professors;

	}

}
