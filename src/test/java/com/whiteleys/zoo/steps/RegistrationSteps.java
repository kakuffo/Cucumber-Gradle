package com.whiteleys.zoo.steps;

import com.whiteleys.zoo.pageobjects.Home;
import com.whiteleys.zoo.pageobjects.Register;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kakuffo on 17/09/15.
 */
public class RegistrationSteps {
    private static org.openqa.selenium.WebDriver driver = new FirefoxDriver();


    @Given("^User has entered valid data for all fields$")
    public void user_has_entered_valid_data_for_all_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/login.html");
        Home.setUserName(driver, "kwame");
        Home.setPassword(driver, "password");
        // throw new Throwable();
        //throw new PendingException();
    }

    @When("^User press the Register button$")
    public void user_press_the_Register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Home.clickRegister(driver);
        //  throw new Throwable();
    }

    @Then("^User is forwarded to home\\.html view/page$")
    public void user_is_forwarded_to_home_html_view_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(Home.getPageUrl(driver).contains("home.html"));
        Home.quit(driver);
        //  throw new Throwable();

    }

    @Given("^User has left all the fields empty$")
    public void user_has_left_all_the_fields_empty() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/register.html");
        // Write code here that turns the phrase above into concrete actions
        //  throw new Throwable();
    }

    @When("^User press the Registration button$")
    public void user_press_the_Registration_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Register.registerButtone(driver);
        //  throw new Throwable();
    }

    @Then("^User is should validation error for all fields\\.$")
    public void user_is_should_validation_error_for_all_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new Throwable();
    }


    //You can implement missing steps with the snippets below:

    @Given("^User is on the register view/page$")
    public void user_is_on_the_register_view_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/whiteley-zoo/register.html");
        //throw new Throwable();
    }

    @Then("^User is shown the mandatory Username field$")
    public void user_is_shown_the_mandatory_Username_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //    throw new PendingException();
        Assert.assertTrue(Register.getuserNameField(driver));
        //throw new Throwable();

    }

    @Then("^User is shown the mandatory Password field$")
    public void user_is_shown_the_mandatory_Password_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();

        Assert.assertTrue(Register.getpswField(driver));
        // throw new Throwable();
    }

    @Then("^User is shown the mandatory Retype password field$")
    public void user_is_shown_the_mandatory_Retype_password_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new Throwable();
    }

    @Then("^User is shown the mandatory Sex select button$")
    public void user_is_shown_the_mandatory_Sex_select_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();

        Assert.assertTrue(Register.getfemaleButton(driver));
        Assert.assertTrue(Register.getmaleButton(driver));
        //throw new Throwable();
    }

    @Then("^User is shown the mandatory Date of birth dropdown list$")
    public void user_is_shown_the_mandatory_Date_of_birth_dropdown_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();

        Assert.assertTrue(Register.getdobDay(driver));
        Assert.assertTrue(Register.getdobMonth(driver));
        Assert.assertTrue(Register.getdobYear(driver));
        //throw new Throwable();
    }

    @Then("^User is shown the mandatory Postcode field$")
    public void user_is_shown_the_mandatory_Postcode_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();

        Assert.assertTrue(Register.getpostCode(driver));
        //throw new Throwable();
    }

    // You can implement missing steps with the snippets below:

    @Given("^User has not entered any data into any field$")
    public void user_has_not_entered_any_data_into_any_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^User clicks Register$")
    public void user_clicks_Register() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User is not taken to New User view/page$")
    public void user_is_not_taken_to_New_User_view_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^User is shown error messages for requred fields$")
    public void user_is_shown_error_messages_for_requred_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //  throw new PendingException();
    }


}
