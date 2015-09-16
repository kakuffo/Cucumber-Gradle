Feature: Add to Cart
  This feature will test functionality of adding different products to the User basket from different flow
  Background: User is Logged In
  Scenario: Search a product and add the first result/product to the User basket
    Given User searched for Lenovo Laptop
    When Add the first laptop that appears in the search result to the basket
    Then User basket should display with 1