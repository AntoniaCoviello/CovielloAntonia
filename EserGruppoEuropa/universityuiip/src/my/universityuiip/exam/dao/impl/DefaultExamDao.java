package my.universityuiip.exam.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.exam.dao.ExamDao;
import my.universityuiip.model.ExamModel;


public class DefaultExamDao extends AbstractItemDao implements ExamDao
{

	@Override
	public List<ExamModel> findExamByStudent(final String fullName)
	{
		final String queryStr = "SELECT {e.PK} FROM {Exam as e join Student as s on {e.student}={s.pk}} WHERE {s.fullName} = ?fullName";
		;
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("uid", uid);
		final SearchResult<ExamModel> result = getFlexibleSearchService().search(fsq);
		final List<ExamModel> exams = result.getResult();
		return exams;

	}

}
