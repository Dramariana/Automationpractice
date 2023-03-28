package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target LOGIN_BUTTON = Target.the("la barra de busqueda").located(By.name("SubmitLogin"));
	public static final Target EMAIL = Target.the("la barra de busqueda").located(By.name("email"));
	public static final Target PASSWORD = Target.the("la barra de busqueda").located(By.name("passwd"));

}
