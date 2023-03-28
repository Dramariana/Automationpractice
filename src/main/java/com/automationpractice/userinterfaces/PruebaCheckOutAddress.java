package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PruebaCheckOutAddress {
	
	public static final Target ADDRESSES = Target.the("ADDRESSES").located(By.xpath("//*[@id=\"center_column\"]/h1"));
	public static final Target PROCEED_CHECKOUT = Target.the("seguir con el cheakout").located(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	public static final Target TERMS_OF_SERVICE = Target.the("aceptar terminos").located(By.xpath("//*[@id=\"cgv\"]"));

}
