Feature: Registration
  As a new user I should be able to register successfully to the website
  @registration
  Scenario: New user should be able to register successfully
    Given user is on the home page
    When user click on register button
    And user enter the registration details
    Then user click on register button successfully register message should be display