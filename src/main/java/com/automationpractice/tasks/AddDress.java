package com.automationpractice.tasks;

import static com.automationpractice.userinterfaces.SelectedDressPage.ADD_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.automationpractice.userinterfaces.SelectedDressPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddDress implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		SelectedDressPage.ADD_CART.resolveFor(actor).waitUntilClickable();
		actor.attemptsTo(	
						Click.on(ADD_CART));
		
	}
	
public static AddDress ToShoppingCart() {
		
		return instrumented(AddDress.class);
			
	}
}
