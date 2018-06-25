package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CornyText {
    WebDriver driver;
    @Given("^I login as \"([^\"]*)\"$")
    public void i_login_as(String arg1) throws Throwable {


        throw new PendingException();}

    @When("^I navigate to the \"([^\"]*)\" page$")
    public void i_navigate_to_the_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on \"([^\"]*)\" on the \"([^\"]*)\" page$")
    public void i_click_on_on_the_page(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the homepage will be displayed$")
    public void the_homepage_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}

