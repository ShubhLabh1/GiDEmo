package StepDefinations;



import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	 @Given("^user is on Netbanking Landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		 System.out.println("loanching landing page");
	        throw new PendingException();
	    }

	    @When("^user login into application with \"([^\"]*)\" and passwoard \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_passwoard_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	        throw new PendingException();
	    }

	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("veryfied home page");
	        throw new PendingException();
	    }

	    @And("^cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);
	        throw new PendingException();
	    }
}
