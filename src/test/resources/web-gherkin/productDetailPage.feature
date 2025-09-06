Feature: Product Detail Page

  Scenario: Add item to Cart
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    When user click on the add to cart button
    Then user will be able to see a pop up message