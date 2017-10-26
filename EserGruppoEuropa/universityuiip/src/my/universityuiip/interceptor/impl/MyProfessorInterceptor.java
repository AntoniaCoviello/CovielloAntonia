package my.universityuiip.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.UUID;

import my.universityuiip.model.ProfessorModel;


public class MyProfessorInterceptor implements InitDefaultsInterceptor
{
	@Override
	public void onInitDefaults(final Object professor, final InterceptorContext ctx) throws InterceptorException
	{
		final UUID randomID = UUID.randomUUID();
		final String string = randomID.toString();
		final ProfessorModel professor1 = (ProfessorModel) professor;
		professor1.setSerialnumber(string);


	}



}
