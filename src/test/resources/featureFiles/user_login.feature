Feature: To validate the login functionality
Background:
Given user should launch the browser
Then user should load the url

Scenario: To validate the login functionality with incorrect crediantials
And user enter the username and password
Then user should click login button

Scenario: To validate the login functionality with empty username and incorrect password
And user enter empty username and password
Then user should click the login button

Scenario: To validate the login functionality with empty username and empty password
And user enter empty username and empty password
Then user should click the login button

Scenario: To validate the login functionality with  username and empty password
And user enter empty username and password
Then user should click the login button

Scenario: To validate the login functionality with correct crediantials
And user enter empty username and password
Then user should click the login button