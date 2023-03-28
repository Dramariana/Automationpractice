package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.PruebaHomePage;


public class OpenBrowser implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(new PruebaHomePage()));
		
	}

	public static OpenBrowser inAutomationpractice() {
		// TODO Auto-generated method stub
		return instrumented(OpenBrowser.class);
	}

}
