package com.automationpractice.questions;

import com.automationpractice.userinterfaces.AccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Account implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return AccountPage.ACCOUNT.resolveFor(actor).getText();
	}
	
	public static Question<String> accountLabel() {
		return new Account();
	}

	

}
