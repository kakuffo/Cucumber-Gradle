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

  Scenario: User is shown all the fields on the registration view/page
    Given User is on the register view/page
    Then User is shown the mandatory Username field
    Then User is shown the mandatory Password field
    Then User is shown the mandatory Retype password field
    Then User is shown the mandatory Sex select button
    Then User is shown the mandatory Date of birth dropdown list
    Then User is shown the mandatory Postcode field


  Scenario: User Should be shown erro messages when required fields are empty
    Given User has not entered any data into any field
    When User clicks Register
    Then User is not taken to New User view/page
    Then User is shown error messages for requred fields