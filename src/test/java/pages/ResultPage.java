package pages;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import utils.BasePage;

public class ResultPage extends BasePage {
	
	/*
	 * Here I can build a method to do the things more easy and scalable
	 * because we don't need create a lot of objects for different
	 * type of filters and with only one method and can select different 
	 * filters and inputs
	 * 
	 * Example1: Select filter type: "Ubicación" and send a parameter like "Córdoba"
	 * Example2: Select filter type: "Precio" and send max price "2.000.000"
	 */
	private final 
	By txtCoroba = By.xpath("//span[@class='ui-search-filter-name shops-custom-secondary-font' and contains(text(),'Córdoba')]");
	
	private final 
	By intMaxPrice = By.xpath("//input[@data-testid='Maximum-price']");
	
	private final 
	By btnFilterPriceSet = By.xpath("//button[@data-testid='submit-price']");
	
	private final 
	By dropOder = By.xpath("//span[contains(text(),'Más relevantes')]");
	
	private final 
	By txtResultCount = By.xpath("//span[@class='ui-search-search-result__quantity-results shops-custom-secondary-font']");
	
	public ResultPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method to go to cordoba location
	 */
	public ResultPage clickLocationCordoba() {
		
		//example to move to the element
		move(txtCoroba);
		
		driver.findElement(txtCoroba).click();
		return this;
	}

	/**
	 * Method set a max price on the filter
	 * @param txt Max price to filter
	 */
	public ResultPage sendKeysMaxPrice(String txt) {
		driver.findElement(intMaxPrice).sendKeys(txt);
		driver.findElement(btnFilterPriceSet).click();
		return this;
	}
	
	/**
	 * Method to order by Desc Price
	 */
	public ResultPage setPriceOrderByDesc() {
		
		move(dropOder);
		driver.findElement(dropOder).click();
		
		By txtMenorPrecio = By.xpath("//span[@class='andes-list__item-primary' and contains(text(),'Menor precio')]");
		
		//Example Explicit Wait and Expected conditions
		waitForUntilVisible(10, txtMenorPrecio);
		

		//Verify if the element is present and click
		if (driver.findElement(txtMenorPrecio).isDisplayed()) {
			driver.findElement(txtMenorPrecio).click();
		}else{
			assertFalse(true);
			Reporter.log("I couldnt find the element");
		}
		return this;
	}
	
	public ResultPage countResults() {
		Reporter.log("Se encontraron: " + driver.findElement(txtResultCount).getText());
		System.out.println("Se encontraron: " + driver.findElement(txtResultCount).getText());
		return this;
	}

}
