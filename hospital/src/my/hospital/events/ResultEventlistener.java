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
package my.hospital.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 */
public class ResultEventlistener extends AbstractEventListener<ResultEvent>
{
	static final private Logger LOG = Logger.getLogger(ResultEventlistener.class);

	@Autowired
	ModelService modelService;

	@Override
	public void onEvent(final ResultEvent resultEvent)
	{

		//gestione evento
	}

}
