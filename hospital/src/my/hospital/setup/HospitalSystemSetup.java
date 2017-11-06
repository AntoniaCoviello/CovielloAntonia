/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.hospital.setup;

import static my.hospital.constants.HospitalConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospital.constants.HospitalConstants;
import my.hospital.service.HospitalService;


@SystemSetup(extension = HospitalConstants.EXTENSIONNAME)
public class HospitalSystemSetup
{
	private final HospitalService hospitalService;

	public HospitalSystemSetup(final HospitalService hospitalService)
	{
		this.hospitalService = hospitalService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitalService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitalSystemSetup.class.getResourceAsStream("/hospital/sap-hybris-platform.png");
	}
}
