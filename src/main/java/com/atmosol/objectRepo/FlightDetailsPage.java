package com.atmosol.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsPage {
	WebDriver driver;
	@FindBy(xpath = "(//table[@class='table']/descendant::td[contains(text(),'$')])[3]")
	private WebElement totPrice;
	@FindBy(xpath = "(//input[@type='submit' and @class='btn btn-small'])[3]")
	private WebElement chooseFlightBtn;

	public FlightDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnFilght() {
		chooseFlightBtn.click();
	}

	public String getPrice() {
		return totPrice.getText();

	}

}
