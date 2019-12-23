#Author: srilakshmi
#Background: List of steps run before each of the scenarios
Feature: login to TestMeApp successful
  I want to use this template for my feature file

 

  Background: 
    Given john launched chrome browser
    And provided TestMeApp site url

 

  Scenario: login to TestMeApp
    When he clicks on login
    Then he shall be able to provide credentials

 

  Scenario: registering to TestMeApp
    When he clicks on register link
    Then he shall be able to provide registration details

 

  Scenario: wishlist in TestMeApp
    When he clicks on wishlist
    Then he shall be able to view his wishlist