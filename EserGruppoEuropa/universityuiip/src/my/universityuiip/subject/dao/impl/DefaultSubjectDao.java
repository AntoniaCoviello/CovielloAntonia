package my.universityuiip.subject.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.model.SubjectModel;
import my.universityuiip.subject.dao.SubjectDao;


public class DefaultSubjectDao extends AbstractItemDao implements SubjectDao
{

	@Override
	public List<SubjectModel> findSubjectByUid(final String uid)
	{
		final String queryStr = "SELECT {PK} FROM {Subject} WHERE {uid}=?uid";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("uid", uid);
		final SearchResult<SubjectModel> result = getFlexibleSearchService().search(fsq);
		final List<SubjectModel> subjects = result.getResult();
		return subjects;

	}

}
