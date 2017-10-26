package my.universityuiip.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.UUID;

import my.universityuiip.model.StudentModel;


public class MyInitInterceptor implements InitDefaultsInterceptor
{
	@Override
	public void onInitDefaults(final Object student, final InterceptorContext ctx) throws InterceptorException
	{
		final UUID randomID = UUID.randomUUID();
		final String string = randomID.toString();
		final StudentModel student1 = (StudentModel) student;
		student1.setSerialnumber(string);


	}







}