Feature: buying product successfully
  @productPurchase
  Scenario: registered user should be able to purchase any product successfully
    Given registered user is on the home page and logged in
    Then user click on the product and click on add to cart
    When user click on checkout button and enter the details
    Then user should be able to display with successful purchase message