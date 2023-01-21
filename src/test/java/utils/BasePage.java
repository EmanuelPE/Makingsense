package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage move(By Element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(Element));
		actions.perform();
		return this;
		
	}
	
	public boolean waitForUntilVisible(Integer time, By by ) {
	    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(time));

	    try {
	        wait.until( ExpectedConditions.presenceOfElementLocated(by) ); 
	    }catch(NoSuchElementException e) {
	        return false;
	    }catch (TimeoutException e) {
	        return false;
	    }
	    return true;
	}
}
