package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PruebaCheckOutShipping {
	public static final Target SHIPPING = Target.the("SHIPPING").located(By.xpath("//*[@id=\"carrier_area\"]/h1"));
	public static final Target PROCEED_CHECKOUT = Target.the("seguir con el cheakout").located(By.xpath("//*[@id=\"form\"]/p/button"));
	public static final Target TERMS_OF_SERVICE = Target.the("aceptar terminos").located(By.xpath("//*[@id=\"uniform-cgv\"]"));

}
