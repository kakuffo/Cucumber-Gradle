$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "User registration and login validation.",
  "description": "Validate the registration and login view/page for mandatory user details required on registration.",
  "id": "user-registration-and-login-validation.",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "whiteley-zoo is running and user is on register.html view/page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "User can register without errors with valid data in all fields.",
  "description": "",
  "id": "user-registration-and-login-validation.;user-can-register-without-errors-with-valid-data-in-all-fields.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has entered valid data for all fields",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User press the Register button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is forwarded to home.html view/page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_has_entered_valid_data_for_all_fields()"
});
formatter.result({
  "duration": 5869097795,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.whiteleys.zoo.steps.RegistrationSteps.user_has_entered_valid_data_for_all_fields(RegistrationSteps.java:40)\n\tat ✽.Given User has entered valid data for all fields(Registration.feature:5)\n",
  "status": "pending"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationSteps.user_is_forwarded_to_home_html_view_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "whiteley-zoo is running and user is on register.html view/page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 9,
  "name": "User cannot register without valid data in all fields.",
  "description": "",
  "id": "user-registration-and-login-validation.;user-cannot-register-without-valid-data-in-all-fields.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User has left all the fields empty",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User press the Registration button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User is should validation error for all fields.",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_has_left_all_the_fields_empty()"
});
formatter.result({
  "duration": 289346,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.whiteleys.zoo.steps.RegistrationSteps.user_has_left_all_the_fields_empty(RegistrationSteps.java:61)\n\tat ✽.Given User has left all the fields empty(Registration.feature:10)\n",
  "status": "pending"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Registration_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationSteps.user_is_should_validation_error_for_all_fields()"
});
formatter.result({
  "status": "skipped"
});
});