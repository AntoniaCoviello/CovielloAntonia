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
package my.hospital.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.hospital.dao.VisitDao;
import my.hospital.model.VisitModel;


/**
 *
 */
public class DefaultVisitDao extends AbstractItemDao implements VisitDao
{

	@Override
	public List<VisitModel> findAllVisit()
	{
		final String query = "SELECT {PK} FROM {Visit}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		final SearchResult<VisitModel> result = getFlexibleSearchService().search(fsq);
		final List<VisitModel> visites = result.getResult();
		return visites;

	}


}
