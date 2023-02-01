package com.epam.apiautomation.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (plugin = {"html:target/Report/cucumber-report.html"},features= {"src/test/resources/Features"},
glue = {"com.epam.apiautomation.steps"}, monochrome = true, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE)
public class POCRunner {

}
