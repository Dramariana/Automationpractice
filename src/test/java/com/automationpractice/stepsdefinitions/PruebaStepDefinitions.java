package com.automationpractice.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.automationpractice.exceptions.NameNotFound;
import com.automationpractice.exceptions.QuantityNotFound;
import com.automationpractice.questions.TheSelectedProduct;
import com.automationpractice.questions.TheSelectedquantity;
import com.automationpractice.tasks.AddDress;
import com.automationpractice.tasks.CheckOut;
import com.automationpractice.tasks.CheckOutAddress;
import com.automationpractice.tasks.CheckOutPayment;
import com.automationpractice.tasks.CheckOutShipping;
import com.automationpractice.tasks.OpenBrowser;
import com.automationpractice.tasks.SearchDress;
import com.automationpractice.tasks.SelectDress;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PruebaStepDefinitions {
	
	PageObject pruebaHomePage;
	
	//para inicializar el driver
	@Managed(driver = "chrome")
	WebDriver webDriver;
	
	//Es el que va a ejecutar todo por medio de las tareas
	private Actor Mariana = Actor.named("Mariana");
	
	
	@Before
	public void setUp() {
		//browsertheweb interaccion
		Mariana.can(BrowseTheWeb.with(webDriver));
		
	}
	
	@Given("^I am in the automationpractice site$")
	public void iAmInTheAutomationpracticeSite() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Mariana.wasAbleTo(OpenBrowser.inAutomationpractice());
	}

	@When("^I add the dress the shopping cart$")
	public void iAddTheDressTheShoppingCart() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Mariana.attemptsTo(SearchDress.inPrueba());
		Mariana.attemptsTo(SelectDress.inPruebaResultPage());
		Mariana.attemptsTo(AddDress.ToShoppingCart());
		Mariana.attemptsTo(CheckOut.TheProduct());
		Mariana.attemptsTo(CheckOutAddress.TheProduct());
		Mariana.attemptsTo(CheckOutShipping.TheProduct());		
		Mariana.attemptsTo(CheckOutPayment.TheProduct());
		
	}

	@Then("^I verify that dress are in shopping cart$")
	public void iVerifyThatDressAreInShoppingCart(List<String> product) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Mariana.should(seeThat(TheSelectedProduct.InTheShoppingCart(), containsString(product.get(0)))
				.orComplainWith(NameNotFound.class, NameNotFound.NAME_NOT_FOUND));
		Mariana.should(seeThat(TheSelectedquantity.InTheShoppingCart(), containsString(product.get(1)))
				.orComplainWith(QuantityNotFound.class, QuantityNotFound.QUANTITY_NOT_FOUND));
	}



}
