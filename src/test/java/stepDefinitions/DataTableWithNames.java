package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonMethods.SeleniumSPecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import utility.DriverManager;

public class DataTableWithNames {


	@Given("user is in {string} page")
	public void user_is_in_page(String string) {
	 SeleniumSPecificMethods.validatePageTitle(string);
		
		
	}

@When("user clicks on the link Selenium Example Page")
public void user_clicks_on_the_link_selenium_example_page() throws InterruptedException {
	
    HomePage obj_HomePage=new HomePage(DriverManager.getDriver());
    Thread.sleep(3000);
    obj_HomePage.click_On_The_Link();
}

	
	
	
}
