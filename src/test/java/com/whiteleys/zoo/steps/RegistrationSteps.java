package com.whiteleys.zoo.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kakuffo on 17/09/15.
 */
public class RegistrationSteps {
    private static org.openqa.selenium.WebDriver driver = null;


    @Given("^User has entered valid data for all fields$")
    public void user_has_entered_valid_data_for_all_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/login.html");


        // driver.quit();
        throw new PendingException();
    }

    @When("^User press the Register button$")
    public void user_press_the_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User is forwarded to home\\.html view/page$")
    public void user_is_forwarded_to_home_html_view_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        throw new PendingException();

    }

    @Given("^User has left all the fields empty$")
    public void user_has_left_all_the_fields_empty() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User press the Registration button$")
    public void user_press_the_Registration_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User is should validation error for all fields\\.$")
    public void user_is_should_validation_error_for_all_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
