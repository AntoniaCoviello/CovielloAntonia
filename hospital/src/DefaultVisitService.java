import java.util.List;

import my.hospital.dao.VisitDao;
import my.hospital.model.VisitModel;
import my.hospital.services.VisitService;


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

/**
 *
 */
public class DefaultVisitService implements VisitService

{
	VisitDao visitDao;

	@Override
	public List<VisitModel> getAllVisit()
	{

		if (!visitDao.findAllVisit().isEmpty())
		{
			final List<VisitModel> visites = visitDao.findAllVisit();
			return visites;
		}
		else
		{
			return null;
		}

	}

}
