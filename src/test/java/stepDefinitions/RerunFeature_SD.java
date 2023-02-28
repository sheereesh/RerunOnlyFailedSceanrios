package stepDefinitions;

 

 
import io.cucumber.java.en.*;
import pages.RerunFeature;
import utility.DriverManager;

public class RerunFeature_SD {

	
	@When("user enter {string} on the form elements")
	public void user_enter_on_the_form_elements(String text) throws InterruptedException {
		Thread.sleep(3000);
		RerunFeature obj_Rerun=new RerunFeature(DriverManager.getDriver());
		obj_Rerun.entertext_OnFormElements(text);
				
				
				
				
	}			 
	 
 


}
