package com.automationpractice.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebDriver;

import com.automationpractice.questions.Account;
import com.automationpractice.tasks.Login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LoginStepDefinition {

	@Managed(driver = "chrome")
	WebDriver webDriver;

	private Actor Mariana = Actor.named("Mariana");

	@Before
	public void setUp() {
		Mariana.can(BrowseTheWeb.with(webDriver));

	}

	@When("^I click on login button$")
	public void iAddTheDressTheShoppingCart() throws Exception {
		Mariana.attemptsTo(Login.onSite());
	}

	@Then("^I can see the My Account Label$")
	public void iVerifyThatDressAreInShoppingCart() throws Exception {
		Mariana.should(seeThat(Account.accountLabel(), containsString("MY ACCOUNT")));

	}

}
