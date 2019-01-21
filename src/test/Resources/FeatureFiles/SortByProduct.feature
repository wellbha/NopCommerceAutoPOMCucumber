Feature: sort by function
  @sortby
  Scenario: user should be able to sort by price high to low
    Given Given user is on the home page
    When user click on product and select sort by with option low to high
    Then user should be able to see the product displayed low to high in order