Feature: Cart Page

  Scenario: User Place Order
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    And user click on the add to cart button
    And user will be able to see a pop up message
    And user click on the Cart button
    And user will be redirected to the cart page
    When user click on the Place Order Button
    Then user will see the Place Order Pop up

  Scenario: User Remove 1 Product from Cart
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    And user click on the add to cart button
    And user will be able to see a pop up message
    And user click on the Cart button
    And user will be redirected to the cart page
    When user click on the delete button on the 1st Product
    Then The corresponding product will be remove
