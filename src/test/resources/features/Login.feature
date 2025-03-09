Feature: Login Feature
  Scenario: Verify login functionality
    Given User is on the login page
    When User enters valid username and password
    Then User should be logged in successfully