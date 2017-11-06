/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.hospital.interceptors;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.springframework.beans.factory.annotation.Autowired;

import my.hospital.events.ResultEvent;
import my.hospital.model.VisitModel;


/**
 *
 */
public class VisitResultInterceptor implements ValidateInterceptor, PrepareInterceptor
{
	@Autowired
	private EventService eventService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (model instanceof VisitModel)
		{
			final VisitModel visit = (VisitModel) model;



			eventService.publishEvent(new ResultEvent(visit.getResult().toString()));

		}

	}

	@Override
	public void onValidate(final Object arg0, final InterceptorContext arg1) throws InterceptorException
	{
		// YTODO Auto-generated method stub

	}

}
