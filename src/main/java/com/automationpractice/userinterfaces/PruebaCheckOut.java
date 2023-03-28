package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PruebaCheckOut {
	
	public static final Target SHOPPING_CART = Target.the("SHOPPING-CART").located(By.xpath("//*[@id=\"cart_title\"]"));
	public static final Target PROCEED_CHECKOUT = Target.the("seguir con el cheakout").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	
}
