package com.atmosol.www;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.atmosol.objectRepo.FlightDetailsPage;
import com.atmosol.objectRepo.HomePage;
import com.atmosol.objectRepo.PurchacePage;
import AutoConstants.AutoConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;

public class BookTicketTest {
	@Test
	public void bookTicketTest() {
		String fromCity = "Mexico City";
		String toCity = "London";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PurchacePage purchacePage = new PurchacePage(driver);
		PropertyUtility p = new PropertyUtility(AutoConstant.propertyFilePath);
		HomePage homepage = new HomePage(driver);
		FlightDetailsPage flightDetail = new FlightDetailsPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		homepage.clickOnDestination();
		String actualtitle = driver.getTitle();
		if (actualtitle.contains("vacation")) {
			System.out.println("title contains vacation");
		}
		Assert.assertTrue(actualtitle.contains("vacation"));
		driver.navigate().back();
		homepage.selectFromSAndTo(fromCity, toCity);
		// table[@class='table']//td[contains(text(),'$')]
		String price = flightDetail.getPrice();
		System.out.println(price);
		flightDetail.clickOnFilght();
	}
}
