Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|swarna.tirunalveli@gmail.com|Jobsearch@2024|


Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My Account"


Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|Edit your account information|
|Change your password|
|Modify your address book entries|
|Modify your wish list|
And accounts section count should be 4