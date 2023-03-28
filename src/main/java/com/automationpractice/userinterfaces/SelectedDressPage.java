package com.automationpractice.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SelectedDressPage {
	
	public static final Target PRODUCT_NAME = Target.the("nombre del producto").located(By.xpath("//*[@id=\"layer_cart_product_title\"]"));
	public static final Target QUANTITY_NAME = Target.the("cantidad del producto").located(By.id("layer_cart_product_quantity"));
	public static final Target PRODUCT_SIZE = Target.the("talla del producto").located(By.id("layer_cart_product_attributes"));
	public static final Target ADD_CART = Target.the("agregar al carrito").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	
}
