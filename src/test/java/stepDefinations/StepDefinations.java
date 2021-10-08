package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObj.framework.HomePage;
import pageObj.framework.LoginPage;
import utilits.framework.Base;

public class StepDefinations extends Base {
	@Given("Open a Login Page of {string}")
	public void open_a_login_page_of(String url) throws IOException {
		driver = initializeBrowser();
		driver.get(url);
		
		HomePage hp = new HomePage(driver);
		hp.getSignInBtn().click();
	}

	@When("Type possible {string} and {string}")
	public void type_possible_and(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSignInBtn().click();
	}

    @Then("^If not a registered user, show an error$")
    public void if_not_a_registered_user_show_an_error() throws Throwable {
     	LoginPage lp = new LoginPage(driver);
    	Assert.assertEquals("Wrong username and password combination.", lp.getLoginErrorText());
    	System.out.println("Successfully run the test.");
    	driver.close();
    }
}
