package com.automationpractice.tasks;


import static com.automationpractice.userinterfaces.PruebaResultPage.SELECT_BOTTON;
import static com.automationpractice.userinterfaces.PruebaResultPage.SELECT_CONTRAINER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDress implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(SELECT_CONTRAINER),Click.on(SELECT_BOTTON));

	}

	public static SelectDress inPruebaResultPage() {

		return instrumented(SelectDress.class);

	}

}
