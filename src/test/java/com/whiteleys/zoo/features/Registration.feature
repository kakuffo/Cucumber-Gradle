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
