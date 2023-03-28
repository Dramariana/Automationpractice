package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.PruebaCheckOut.PROCEED_CHECKOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.PruebaCheckOut;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CheckOut implements Task {
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		PruebaCheckOut.SHOPPING_CART.resolveFor(actor).waitUntilVisible();
		
		actor.attemptsTo(	
				Click.on(PROCEED_CHECKOUT));
	}
	
public static CheckOut TheProduct() {
		
		return instrumented(CheckOut.class);
			
	}
}
