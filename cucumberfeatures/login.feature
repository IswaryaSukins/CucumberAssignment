Feature: LeafTaps Application Demo

Scenario: Successful Login
  
  Given user navigates to the application
  And user enters the username as Demosalesmanager
  And user enters the password as crmsfa
  When user clicks the login button
  Then login should be successful



