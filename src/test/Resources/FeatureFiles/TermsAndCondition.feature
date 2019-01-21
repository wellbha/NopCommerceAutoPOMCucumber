Feature: Accepting Terms & Conditions
  @termsCondition
  Scenario: user need to accept terms and conditions before checkout
    Given registered user is on the home page and logged in
    Then user click on product and click on add to cart
    When user click on checkout button
    Then user should be prompted with terms and condition error message