Feature: sort by function
  As a user I should be able to click any product and then sort it by price low to high so I can see them in price order

  @sortby
  Scenario: user should be able to sort by price high to low
    Given Given user is on the home page
    When user click on product and select sort by with option low to high
    Then user should be able to see the product displayed low to high in order