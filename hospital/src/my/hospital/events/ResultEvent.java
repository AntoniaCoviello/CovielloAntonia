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

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 *
 */
public class ResultEvent extends AbstractEvent
{
	private final String result;

	public ResultEvent(final String result)
	{
		super();
		this.result = result;
	}


	public String getResult()
	{
		return result;
	}

	@Override
	public String toString()
	{

		return this.result + "(" + this.result + ")";
	}
}

