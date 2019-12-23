Feature: Login
This is to login to the wesite with the valid username and password
It will lead the user to the homepage of the website
Scenario: Valid login 
Given The user is on the DemoWebShop homepage
When The user gives valid login and valid password
Then User should be able to login 