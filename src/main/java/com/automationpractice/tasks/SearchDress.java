package com.automationpractice.tasks;


import static com.automationpractice.userinterfaces.AccountPage.HOME_BUTTON;
import static com.automationpractice.userinterfaces.PruebaHomePage.SEARCH_BAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.automationpractice.userinterfaces.AccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchDress implements Task {

	private String product;

	public SearchDress() {
		this.product ="dress";
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		AccountPage.HOME_BUTTON.resolveFor(actor).waitUntilVisible();
		actor.attemptsTo(
				Click.on(HOME_BUTTON),
				Enter.theValue(product).into(SEARCH_BAR).thenHit(Keys.ENTER));

	}
public static SearchDress inPrueba() {
		return instrumented(SearchDress.class);
			
	}

}