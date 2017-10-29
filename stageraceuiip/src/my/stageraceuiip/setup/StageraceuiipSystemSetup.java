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
package my.stageraceuiip.setup;

import static my.stageraceuiip.constants.StageraceuiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.service.StageraceuiipService;


@SystemSetup(extension = StageraceuiipConstants.EXTENSIONNAME)
public class StageraceuiipSystemSetup
{
	private final StageraceuiipService stageraceuiipService;

	public StageraceuiipSystemSetup(final StageraceuiipService stageraceuiipService)
	{
		this.stageraceuiipService = stageraceuiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		stageraceuiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return StageraceuiipSystemSetup.class.getResourceAsStream("/stageraceuiip/sap-hybris-platform.png");
	}
}
