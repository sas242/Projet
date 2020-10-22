$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepslogin.user_launch_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Url \"https://www.facebook.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepslogin.user_enters_Url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"Aishasulthana@ymail.com\" and password as \"Sulthana@24\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepslogin.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepslogin.user_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
});