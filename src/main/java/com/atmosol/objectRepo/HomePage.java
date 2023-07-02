package com.atmosol.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SelectUtility.SelectUtility;

public class HomePage {
	WebDriver driver;
	SelectUtility s = new SelectUtility();
	@FindBy(xpath = "//a[contains(text(),'destination of the week! The Beach!')]")
	private WebElement destinationLink;
	@FindBy(xpath = "//select[@class='form-inline' and @name='fromPort']")
	private WebElement fromDropDown;
	@FindBy(xpath = "//select[@class='form-inline' and @name='toPort']")
	private WebElement toCityDropdown;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement findFlightsBtn;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDestination() {
		destinationLink.click();
	}

	public void selectFromSAndTo(String fromCity, String toCity) {
		s.selectByName(fromDropDown, fromCity);
		s.selectByName(toCityDropdown, toCity);
		findFlightsBtn.click();
	}

}
