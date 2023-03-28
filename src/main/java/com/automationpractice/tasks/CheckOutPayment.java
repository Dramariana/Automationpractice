package com.automationpractice.tasks;



import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.PruebaCheckOutPayment;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CheckOutPayment implements Task {
	
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		PruebaCheckOutPayment.PAYMENT.resolveFor(actor).waitUntilVisible();
		
		
	}
	
public static CheckOutPayment TheProduct() {
		
		return instrumented(CheckOutPayment.class);
			
	}

}
