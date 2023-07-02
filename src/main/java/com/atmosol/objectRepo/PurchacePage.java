package com.atmosol.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchacePage {
	WebDriver driver;
	@FindBy(xpath = "//p[contains(text(),'Price')]")
	private WebElement totalPrice;

	public PurchacePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
