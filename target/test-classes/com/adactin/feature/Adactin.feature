
Feature: Book a Hotel in Adactin Application

Scenario: User login the adactin application
Given user Launch  the Adactin Application
When User Enter the user Name
And User Enter the Password
Then User Click the Login button

Scenario: User Search the Hotel
When user Select the location in Location Dropdown
And user Select the hotel in Hotel Dropdown
And user Select the room type in room type dropdown
And user select the No of rooms in no of rooms field
And user enter the checkin date for Checkin field
And user Enter the checkout date for Checkout field
And user Enter the adults in Adults field
And user enter the children in children field
Then user click the Search button

Scenario: User select the hotel
When user select the hotel
Then user click the continue button

Scenario: user book the hotel
When user enter the first name in First Name Field
And user enter the last name in last Name field
And user enter the billing address in  BillingAddress field
And user enter the card details in credit  no field
And user select the card type in credit card type dropdown
And user click the expiry date of the card in Expiry date dropdown
And user enter the cvv number in cvv field
Then user click the book Now in book now button

Scenario: Booking Confirmation
When user check details and click the My itenary button	
Then user enter the booked itenary option button

Scenario: Logout
When user click the logout in logout button