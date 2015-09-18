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
  "duration": 4309183635,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Register_button()"
});
formatter.result({
  "duration": 427053917,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_forwarded_to_home_html_view_page()"
});
formatter.result({
  "duration": 14386262,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.whiteleys.zoo.steps.RegistrationSteps.user_is_forwarded_to_home_html_view_page(RegistrationSteps.java:42)\n\tat ✽.Then User is forwarded to home.html view/page(Registration.feature:7)\n",
  "status": "failed"
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
  "duration": 156390882,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Registration_button()"
});
formatter.result({
  "duration": 26059088,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_should_validation_error_for_all_fields()"
});
formatter.result({
  "duration": 29152,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "whiteley-zoo is running and user is on register.html view/page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 14,
  "name": "User is shown all the fields on the registration view/page",
  "description": "",
  "id": "user-registration-and-login-validation.;user-is-shown-all-the-fields-on-the-registration-view/page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is on the register view/page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User is shown the mandatory Username field",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User is shown the mandatory Password field",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User is shown the mandatory Retype password field",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User is shown the mandatory Sex select button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User is shown the mandatory Date of birth dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User is shown the mandatory Postcode field",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_is_on_the_register_view_page()"
});
formatter.result({
  "duration": 79220137,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Username_field()"
});
formatter.result({
  "duration": 26278372,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Password_field()"
});
formatter.result({
  "duration": 20275396,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Retype_password_field()"
});
formatter.result({
  "duration": 29065,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Sex_select_button()"
});
formatter.result({
  "duration": 42931029,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Date_of_birth_dropdown_list()"
});
formatter.result({
  "duration": 64545008,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Postcode_field()"
});
formatter.result({
  "duration": 20468715,
  "status": "passed"
});
});