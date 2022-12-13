Feature: Application Login

Scenario: Home page default login
Given user is on Netbanking Landing page
When user login into application with "Jin" and passwoard "1234"
Then home page is populated
And cards are displayed "true"


Scenario: Home page default login
Given user is on Netbanking Landing page
When user login into application with "Jhon" and passwoard "4321"
Then home page is populated
And cards are displayed "false"
