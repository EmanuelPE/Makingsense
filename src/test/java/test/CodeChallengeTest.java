package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultPage;
import pages.StorePage;
import utils.BaseTest;

public class CodeChallengeTest extends BaseTest {

    @Test
    public void CodeChallengeTest() {

       /*
       Complete the test cases according to the specifications described on the PDF sent by Email
       The Chrome Web driver is already configured, you are ready to work.
       */

    	//Open Chrome
    	tearUp();
    	 
    	HomePage homePage = new HomePage(driver);
    	
    	//Select Country
    	StorePage storepage = homePage.countrySelect();
    	
    	//Search for producto
    	ResultPage resultpage = storepage.searchThing("auto");
    	
    	//Filter by Location Cordoba 
    	resultpage.clickLocationCordoba();
    	
    	//Filter by max price 
    	resultpage.sendKeysMaxPrice("2000000");
    	
    	//Order by Desc Price
    	resultpage.setPriceOrderByDesc();

    	//Report how many results is show it (TESTNG REPORTER)
    	resultpage.countResults();
    }


}
