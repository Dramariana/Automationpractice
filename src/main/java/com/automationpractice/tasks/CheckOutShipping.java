package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.PruebaCheckOutShipping.PROCEED_CHECKOUT;
import static com.automationpractice.userinterfaces.PruebaCheckOutShipping.TERMS_OF_SERVICE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.PruebaCheckOutShipping;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CheckOutShipping implements Task{
	
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		PruebaCheckOutShipping.SHIPPING.resolveFor(actor).waitUntilVisible();
		
		actor.attemptsTo(	
			Click.on(PROCEED_CHECKOUT));
	}
	
public static CheckOutShipping TheProduct() {
		
		return instrumented(CheckOutShipping.class);
			
	}

}
