Feature: To validate user registration functionality

Background:
Given User should launch chrome and load the url
When User click join now and then user navigated to reistration page


Scenario: To validate user registration functionality with email id and password
And User should enter email id and password
Then User should accept the terms
Then User close the browser

Scenario Outline:To validate user registration functionality with email id and password

And User should enter email id "<ids>" and password "<passwords>"
Then User should accept the terms
Then User quit the browser

Examples:
					|ids|passwords|
					|example123@gmail.com|123$gt|
					|example456@gmail.com|456&gt|
					|example789@gmail.com|789@%^gt|