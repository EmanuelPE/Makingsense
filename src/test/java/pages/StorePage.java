package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class StorePage extends BasePage{
	
	private final 
	By intSearchBar = By.xpath("//input[@class='nav-search-input']");
	
	private final 
	By btnSearchBar = By.xpath("//button[@class='nav-search-btn']");
	
	private final	
	By cookiesAccept = By.xpath("//button[@class='cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept']");

	//Constructor
	public StorePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Accept cookies from banner
	 * @param txt(String Type) = Thing to search 
	 */
	public StorePage accceptCookies() {
		driver.findElement(cookiesAccept).click();
		return this;
	}
	
	/**
	 * Send keys in the input search bar nav
	 * @param txt(String Type) = Thing to search 
	 */
	public StorePage enterTextInSearchFld(String txt) {
		driver.findElement(intSearchBar).sendKeys(txt);
		return this;
	}
	
	/**
	 * Click on search button in the nav
	 */
	public StorePage clickSearchBtn() {
		driver.findElement(btnSearchBar).click();
		return this;
	}
	
	/**
	 * Method to send keys and click on search button
	 * @param txt(String Type) = Thing to search 
	 */
	public ResultPage searchThing(String txt) {
		
		accceptCookies();
		enterTextInSearchFld(txt);
		clickSearchBtn();
		return new ResultPage(driver);
	}
}
