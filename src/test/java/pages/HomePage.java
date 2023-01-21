package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class HomePage extends BasePage {

	/*
	 * Here I can build a method to do the things more easy and scalable
	 * because we don't need create a lot of objects for different
	 * countries and with only one method and can select different country
	 */
 
	private final 
	By aArgentina = By.id("AR");
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method to select the country named Argentina
	 * 
	 */
	public StorePage countrySelect() {
		driver.findElement(aArgentina).click();
		return new StorePage(driver);
	}
	
}
