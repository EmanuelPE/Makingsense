package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

     public static WebDriver driver;

    @BeforeTest
    public void tearUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com");
    }

    @AfterTest
    public void tearDown(){
        //Close the WebDriver instance
        driver.quit();
    }

    public static WebDriver getDriver() { return driver; }
    
}
