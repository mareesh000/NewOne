@Feature2
Feature: To validate the login functionality of facebook application

@Regression
Scenario: To validate login with valid username and invalid password
Given To launch the edgebrowser and maximize  window
When To lauch the of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser
@Smoke
Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximise the window
When User has to hit the facebook url
And User has to pass the data "<emaildata>"in email field
And User has to pass the data"<passworddata>"in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildata             |passworddata|
|marishmairsh@gmail.com|w45345345|
|dkfjskdjiwuei         |9453w9e040|
|nmrhweijewkle         |5986042|
 