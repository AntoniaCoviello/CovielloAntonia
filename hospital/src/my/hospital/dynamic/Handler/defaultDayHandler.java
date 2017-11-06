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
package my.hospital.dynamic.Handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import my.hospital.model.PatientModel;


/**
 *
 */
public class defaultDayHandler implements DynamicAttributeHandler<String, PatientModel>
{
	public static int day = 0;

	@Override
	public String get(final PatientModel patientModel)
	{
		final Date date = patientModel.getDateofRecovery();
		final Date date1 = patientModel.getExitofHospital();
		final int day1 = date.getDay();
		final int day2 = date1.getDay();
		final int day = day2 - day1;

		return Integer.toString(day);
	}

	@Override
	public void set(final PatientModel visitModel, final String date)
	{
		final int days = Integer.parseInt("date");
		this.day = days;
	}
}
