package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Print the user is on the login page");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Print the user enters valid credentials");
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        System.out.println("Print the user enters invalid credentials");
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("Print the user should be redirected to the dashboard");
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {
        System.out.println("Print an error message should be displayed");
    }


}
