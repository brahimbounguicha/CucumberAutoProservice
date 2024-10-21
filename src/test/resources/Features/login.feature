#Author: Porservice
Feature: Practice automation login page


Scenario: login with valid credentials 
Given admin is on login page
When admin enter correct username and correct password 
Then admin is directed to the homepage


