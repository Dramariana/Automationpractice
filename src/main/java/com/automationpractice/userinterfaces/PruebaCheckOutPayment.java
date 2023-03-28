package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PruebaCheckOutPayment {
	
	public static final Target PAYMENT = Target.the("PAYMENT").located(By.xpath("//*[@id=\"center_column\"]/h1"));
	public static final Target QUANTITY = Target.the("cantidad del producto").located(By.xpath("//*[@id=\"product_5_19_0_258911\"]/td[5]"));
	public static final Target PRODUCT_NAME = Target.the("nombre del producto").located(By.xpath("//*[@id=\"product_5_19_0_258911\"]/td[2]/p/a"));
}
