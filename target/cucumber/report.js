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
  "duration": 3108384490,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Register_button()"
});
formatter.result({
  "duration": 128837438,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_forwarded_to_home_html_view_page()"
});
formatter.result({
  "duration": 10590940,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.whiteleys.zoo.steps.RegistrationSteps.user_is_forwarded_to_home_html_view_page(RegistrationSteps.java:41)\n\tat ✽.Then User is forwarded to home.html view/page(Registration.feature:7)\n",
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
  "duration": 82027895,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_press_the_Registration_button()"
});
formatter.result({
  "duration": 7940765,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_should_validation_error_for_all_fields()"
});
formatter.result({
  "duration": 26423,
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
  "duration": 59675916,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Username_field()"
});
formatter.result({
  "duration": 19884824,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Password_field()"
});
formatter.result({
  "duration": 17254759,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Retype_password_field()"
});
formatter.result({
  "duration": 21397,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Sex_select_button()"
});
formatter.result({
  "duration": 33961960,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Date_of_birth_dropdown_list()"
});
formatter.result({
  "duration": 47417759,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_the_mandatory_Postcode_field()"
});
formatter.result({
  "duration": 15403693,
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
  "line": 24,
  "name": "User Should be shown erro messages when required fields are empty",
  "description": "",
  "id": "user-registration-and-login-validation.;user-should-be-shown-erro-messages-when-required-fields-are-empty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User has not entered any data into any field",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User clicks Register",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User is not taken to New User view/page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User is shown error messages for requred fields",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_has_not_entered_any_data_into_any_field()"
});
formatter.result({
  "duration": 58826779,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_clicks_Register()"
});
formatter.result({
  "duration": 140592955,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_not_taken_to_New_User_view_page()"
});
formatter.result({
  "duration": 10067349079,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"button\"}\nCommand duration or timeout: 10.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027Kwames-MBP.default\u0027, ip: \u0027192.168.1.213\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_45\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d32.0, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 299296d0-e596-d542-8fb9-c8af36c38b4c\n*** Element info: {Using\u003dclass name, value\u003dbutton}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:429)\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:388)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\n\tat com.whiteleys.zoo.pageobjects.Register.registerButtone(Register.java:60)\n\tat com.whiteleys.zoo.pageobjects.Register.getRegisterVisible(Register.java:72)\n\tat com.whiteleys.zoo.steps.RegistrationSteps.user_is_not_taken_to_New_User_view_page(RegistrationSteps.java:155)\n\tat ✽.Then User is not taken to New User view/page(Registration.feature:27)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"button\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027Kwames-MBP.default\u0027, ip: \u0027192.168.1.213\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_45\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/t_/qnn07zf149dc3gqt2qn75ztm0000gn/T/anonymous1295913201576626859webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10667)\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///var/folders/t_/qnn07zf149dc3gqt2qn75ztm0000gn/T/anonymous1295913201576626859webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:623)\n",
  "status": "failed"
});
formatter.match({
  "location": "RegistrationSteps.user_is_shown_error_messages_for_requred_fields()"
});
formatter.result({
  "status": "skipped"
});
});