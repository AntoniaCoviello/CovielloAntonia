package my.universityuiip.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import my.universityuiip.enums.ExamResultEnum;
import my.universityuiip.model.ExamModel;


public class MyPrepareInterceptor implements PrepareInterceptor
{
	@Override
	public void onPrepare(final Object exam, final InterceptorContext ctx) throws InterceptorException
	{
		final ExamModel exam1 = (ExamModel) exam;
		final Integer grade = exam1.getGrade();
		if (grade.intValue() >= 18)
		{
			exam1.setResult(ExamResultEnum.PASSED);
		}

		if (grade.intValue() < 18)
		{
			exam1.setResult(ExamResultEnum.PASSED);
		}


	}





}
