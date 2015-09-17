You have joined a team commissioned by Whiteley's Zoo to create their new website.  
Building and improving on the source code provided, we'd like you to showcase an initial release 
developed to meet the following requirements:


Test Instructions:

Access the test click on the dropbox link provided. Download the zip file which contains a java project folder that 
includes a readme file. In the readme file there is a description of some features for a developer to implement. 
Your task is to 

1. implement a set of runnable test in cucumber gherkin script with associated step definitions and code 
to verify the results. 

2. These should be design to fail until run against the developers implementation.
 
The project is written in java and is backed by gradle. The webapp runs by executing the  
JettyRun command (how to do this is described in the readme file) and is accessible using a browser 
http://localhost:8080/whiteley-zoo
Dropbox link: https://www.dropbox.com/s/vkjs80vyobo8le8/whiteleys-zoo-java.tar?dl=0
Add the runnable tests to the project and return it in your reply, providing some instructions on how the tests are run.


Site Features
=============
1) Basic user registration and login.   

  GOAL: The core logic is in place, but you need to add validation and map the "Sex" User property to the database.

  Mandatory user details required on registration:
  - Username (unique across all users)
  - Password
  - Sex
  - Date of Birth
  - UK Post Code

2) Ability to select, save and subsequently modify a logged-in user's collection of favourite animals.   

   GOAL: Introduce the association between a user and their favourite animals and ensure this feature works as expected.

   The pages have been designed and the skeleton User and Animal concepts have been implemented, but the ability to associate favourite animals to users has not been considered yet.

What we've given you...
=================
* We've provided the skeleton code and a Gradle build file that will download all the required libraries, build, package and deploy your application to Jetty for testing.


Some of the things we're looking for...
=======================================
* An efficient and elegant solution that meets the GOALs outlined above.
* Consideration of software quality
* Outside of the GOALs above, thoughts on how we could improve the current implementation (we'll discuss this at the Tech I/V)

What we're not looking for...
===================================
* A complete rewrite of the system.  We will discuss alternative approaches considered in the Technical Interview.
* Requirements/specification documentation
* Too much time spent on the presentational aspects of the site

What you must deliver
=====================
* A zip file or compressed-tarball with your updated source code and config


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

public class RegistrationSteps {

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