Instructions:




Cucumber & Gradle Automation Frame-Work
=============


What we've given you...
=================


Some of the things we're looking for...
=======================================

What we're not looking for...
===================================

What you must deliver
=====================


Prerequisites
========
* An internet connection so Gradle can download all the 3rd party libraries
* Java 1.7
* Gradle 1.10


How to build and deploy
================
Navigate to the folder with build.gradle and run
> gradle jettyRun

Then hit http://localhost:8080/whiteley-zoo


Auto Generated steps
================
Feature: User registration and login validation.
  Validate the registration and login view/page for mandatory user details required on registration.
  Background: whiteley-zoo is running and user is on register.html view/page
  Scenario: User can register without errors with valid data in all fields.
    Given User has entered valid data for all fields
    When  User press the Register button
    Then  User is forwarded to home.html view/page

  Scenario: User cannot register without valid data in all fields.
    Given User has left all the fields empty
    When User press the Registration button
    Then User is should validation error for all fields.


    // You can implement missing steps with the snippets below:

    @Given("^User has entered valid data for all fields$")
    public void user_has_entered_valid_data_for_all_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
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