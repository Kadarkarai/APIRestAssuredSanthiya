package com.epam.apiautomation.steps;


import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.epam.apiautomation.app.Config;
import com.epam.apiautomation.app.ContextScenario;
import com.epam.apiautomation.app.ContextStep;

public class CommonStep {

	protected static ContextScenario scenario;
	protected ContextStep step;
	Config conf;

	public CommonStep(ContextStep testContext) {
		step = testContext;
		conf=new Config();
		scenario=step.getScenario();
	}
}
