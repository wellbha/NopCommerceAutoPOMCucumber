Feature: Registration
  @registration
  Scenario: New user should be able to register successfully
    Given user is on the home page
    When user click on register button
    And user enter the registration details
    Then user click on register button successfully register message should be display