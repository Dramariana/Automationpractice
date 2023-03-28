package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {
	
	public static final Target ACCOUNT = Target.the("My Account").located(By.className("page-heading"));
	public static final Target HOME_BUTTON = Target.the("").located(By.className("logo"));

}
