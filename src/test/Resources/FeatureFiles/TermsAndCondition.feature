Feature: Accepting Terms & Conditions
  As a registered user I should be to add the product to cart but should not be able to proceed to checkout without accepting terms and conditions
  
  @termsCondition
  Scenario: user need to accept terms and conditions before checkout
    Given registered user is on the home page and logged in
    Then user click on product and click on add to cart
    When user click on checkout button
    Then user should be prompted with terms and condition error message