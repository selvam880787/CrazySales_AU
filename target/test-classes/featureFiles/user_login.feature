Feature: To validate the login functionality
Background:
Given user should launch the browser
Then user should load the url

Scenario: To validate the login functionality with incorrect crediantials
And user enter username and password
Then user should click the login button
And user should get the error message
Then user close the browser

Scenario: To validate the login functionality with empty username and incorrect password
And user enter empty username and password
Then user should click the login button
And user should get the error message
Then user close the browser

Scenario: To validate the login functionality with empty username and empty password
And user enter empty username and empty password
Then user should click the login button
And user should get the error message
Then user close the browser

Scenario: To validate the login functionality with  username and empty password
And user enter empty username and password
Then user should click the login button
And user should get the error message
Then user close the browser

Scenario: To validate the login functionality with correct crediantials
And user enter empty username and password
Then user should click the login button
And user should navigated to the home page
Then user close the browser