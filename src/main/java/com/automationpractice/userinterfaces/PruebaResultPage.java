package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PruebaResultPage {

	//public static final Target SELECT_PRODUCT = Target.the("Seleccionar producto").located(By.xpath(
 // "/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div"));
	public static final Target SELECT_CONTRAINER = Target.the("Seleccionar contenerdor").located(By.xpath(
			  "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]"));
	public static final Target SELECT_BOTTON = Target.the("Seleccionar boton").located(By.xpath(
			  "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));

	
}
