Feature: DemoWebShop Multi Login 
DemoWebShop login page opens
This will take Login Id and password from user
It opens the homepage of the website
Scenario Outline: Testing Login 
Given DemoWebShop page is open and SignIn page is displayed 
When I provide "<Login>" and "<Password>" 
Then The relevant login name is displayed 

Examples: 
|Login|Password|
|user1b@yahoo.com|user1pass|
|user2sb@mail.com|user2pass|
|user3b@mail.com|user3pass| 