@Feature1
Feature: To validate the account creation of fb application

@Sanity
Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of fb application
And To click the create new account button
And To pass firstname in firstname text box
|Mareesh|Naveen|Selam|
And To pass secondname in secondname text box
And To pass mobileno or email in email text box
|59345487982|mafnksdkf@gmail.com|hjlgjhgjhgkh|
|makdjfksjdkljfsk|87459837485|nfnsdkkdjkwk|
|marishmarish66@gmail.com|7872987384|msjfjklsdsl|
And To create new password using new password text box
Then To close the chrome browser