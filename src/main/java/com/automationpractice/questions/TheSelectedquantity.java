package com.automationpractice.questions;

import com.automationpractice.userinterfaces.PruebaCheckOutPayment;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheSelectedquantity implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return PruebaCheckOutPayment.QUANTITY.resolveFor(actor).getText();
	}

	public static Question<String> InTheShoppingCart() {
		// TODO Auto-generated method stub
		return new TheSelectedquantity();
	}
}
