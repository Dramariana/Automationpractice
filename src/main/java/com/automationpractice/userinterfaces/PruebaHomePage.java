package com.automationpractice.userinterfaces;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class PruebaHomePage extends PageObject{
	public static final Target SEARCH_BAR = Target.the("la barra de busqueda").located(By.id("search_query_top"));
	public static final Target LOGIN_BUTTON = Target.the("boton de login").located(By.className("login"));

}
