Feature: Login

Scenario: Successful Login with valid credentials

Given User launch chromebrowser 
 When User enters Url "https://www.facebook.com"
 And User enters email as "Aishasulthana@ymail.com" and password as "Sulthana@24"
 Then User click on login
 

 


