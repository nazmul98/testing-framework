package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	@Given("Open a Login Page of {string}")
	public void open_a_login_page_of(String url) {
	    System.out.println(url);
	}

	@When("Type possible {string} and {string}")
	public void type_possible_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username);
	    System.out.println(password);
	}

    @Then("^If not a registered user, show an error$")
    public void if_not_a_registered_user_show_an_error() throws Throwable {
    	System.out.println("hello 3");
    }
}
