Feature: Book a hotel in Adactin Application

Scenario: User login the Application
Given user launch the application by given Url
When user enter the username in username field
And user enter the password in password field
Then user click the Login button

Scenario: Search hotel page
Given user select the location in select location dropdown
When user select the hotels in select hotel dropdown
And user select the room type in roomtype dropdown
And user select the number of rooms in no of rooms dropdown
And user select the adults no in No of Adults per room dropdown
And user select the no of children in children per room dropdown
Then user click the search button 

Scenario: select Hotel Page
Given user select the select button
Then user click the continue button

Scenario: Book a hotel page
Given user enter the first name in first name field
When user enter the last name in last name field
And user enter Billing address in Billing address field
And user enter the card number in credit card field
And user select the credit card type in credit card type dropdown
And user select the expiry month in expiry date dropdown
And user select the expiry year in expiry year dropdown
And user enter the cvv number in cvv number field
Then user click the book now button

Scenario: booking Confirmation page
Given user click the My itenary in My itenary field

Scenario: Logout Page
Given user select the logout page and click the button
