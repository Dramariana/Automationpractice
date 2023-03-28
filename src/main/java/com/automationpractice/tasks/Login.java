package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.LoginPage.*;
import static com.automationpractice.userinterfaces.PruebaHomePage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Login implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(LOGIN_BUTTON),
				Enter.theValue("mary-10.07@hotmail.com").into(EMAIL).thenHit(Keys.TAB),
				Enter.theValue("12345").into(PASSWORD).thenHit(Keys.ENTER)
				);
		
	}

	public static Login onSite() {
		return instrumented(Login.class);
	}

	

}
