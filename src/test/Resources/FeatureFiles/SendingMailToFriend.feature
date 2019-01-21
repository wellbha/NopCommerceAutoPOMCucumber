Feature: Sending mail to friend with product
  @registeredUserMail
  Scenario: Registered user should be able to send email with product to friend
    Given registered user is on the home page and logged in
    Then user click on the product and click on email friend button
    When user enter the details and click on sendmail
    Then user should be prompted with successful message

    @unregisteredUserMail
  Scenario: Unregistered user should not be able to send email with product to friend
    Given unregistered user is on the home page
    When user click on the product and click on email friend button
    Then user should be prompted with unsuccessful message
