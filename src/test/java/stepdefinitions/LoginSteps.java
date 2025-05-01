package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("User enters valid username and password");
    }

    @Then("User should be navigated to the dashboard")
    public void user_should_be_navigated_to_the_dashboard() {
        System.out.println("User should be navigated to the dashboard Grok");
    }

}
