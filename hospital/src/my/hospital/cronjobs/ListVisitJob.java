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
package my.hospital.cronjobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospital.model.VisitModel;
import my.hospital.services.VisitService;


public class ListVisitJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(ListVisitJob.class);

	private VisitService visitService;

	/**
	 * @return the visitService
	 */
	public VisitService getVisitService()
	{
		return visitService;
	}

	@Required
	public void setVisitService(final VisitService visitService)
	{
		this.visitService = visitService;
	}

	@Override
	public PerformResult perform(final CronJobModel cronjob)
	{
		final List<VisitModel> visites = visitService.getAllVisit();
		if (visites.isEmpty())
		{
			LOG.info("No visites ");
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
		}
		final Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, 1);
		final Date tomorrow = today.getTime();
		for (final VisitModel vis : visites)
		{
			if (vis.getDateofVisit() == tomorrow)
			{
				LOG.info(vis.getPatient().getName() + " " + vis.getPatient().getSurname() + " " + vis.getPatient().getDateofRecovery()
						+ " " + vis.getDoctor());
			}
		}






		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

}
