package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSPecificMethods;

public class RerunFeature {
	WebDriver driver;
	
public RerunFeature(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements( driver,this);

}


@FindBy(xpath = "//input[@name='text']11")
WebElement text_OnFormElements;
public void entertext_OnFormElements(String string)   {
 
	SeleniumSPecificMethods.enterText_TextField(text_OnFormElements, string);

}

}
