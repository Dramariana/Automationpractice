package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.PruebaCheckOutAddress.ADDRESSES;
import static com.automationpractice.userinterfaces.PruebaCheckOutAddress.PROCEED_CHECKOUT;
import static com.automationpractice.userinterfaces.PruebaCheckOutAddress.TERMS_OF_SERVICE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.PruebaCheckOut;
import com.automationpractice.userinterfaces.PruebaCheckOutAddress;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CheckOutAddress implements Task{

	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		PruebaCheckOutAddress.ADDRESSES.resolveFor(actor).waitUntilVisible();
		
		actor.attemptsTo(	
				Click.on(PROCEED_CHECKOUT),Click.on(TERMS_OF_SERVICE));
	}
	
public static CheckOutAddress TheProduct() {
		
		return instrumented(CheckOutAddress.class);
			
	}
}
