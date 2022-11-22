Feature: Hotel Booking

Scenario: Home Page

Given user Launch The Application 

When user Enter The User Name In User Name Field

And user Enter The Password In Password Field

Then user Click On The Login Button & It Navigate To Adactin.com - Search-Hotel Page

Scenario: Search Hotel

When user Select The Location

And user Select The Hotel Type

And user Select The Room Type

And user Select The No Of Rooms

And user Select The Check In Date

And user Select The Check Out Date

And user Select The Adults Per Room

And user Select The Children Per Room

Then user Click On The Search Button & It Navigate To Adactin.com - Select-Hotel Page

Scenario: Select Hotel

When user Select The Radio Button For Hotel Selection

Then user Click On The Continue Button & It Navigate To Adactin.com - Book A Hotel

Scenario: Book A Hotel

When user Enter The First Name In First Name Field

And user Enter The Last Name In Last Name Field

And user Enter The Billing Address In Billing Address Field

And user Enter The Credit Card Number In Credit Card Number Field

And user Select The Credit Card Type

And user Select The Expired Date

And user Enter The CCV Number In CCV Number Field

Then user Click On The Book Button & It Navigate To Adactin.com - Hotel Booking Confirmation

Scenario: Hotel Booking Confirmation

Then user Click On The My Itinerary Button & It Navigate To Adactin.com - Select Hotel Order List Confirm Page 

Scenario: Select Hotel Order List Confirm Page    

And user Click On The Cancel Selected Button

 


