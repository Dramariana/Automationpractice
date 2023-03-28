package com.automationpractice.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature", glue = {
		"com.automationpractice.stepsdefinitions" }, snippets = SnippetType.CAMELCASE)

public class LoginRunner {

}
