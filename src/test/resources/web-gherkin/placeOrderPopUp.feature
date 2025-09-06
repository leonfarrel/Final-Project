Feature: Place Order

  Scenario: User Place Order
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    And user click on the add to cart button
    And user will be able to see a pop up message
    And user click on the Cart button
    And user will be redirected to the cart page
    And user click on the Place Order Button
    And user input name textbox with "Leon Farrel"
    And user input country textbox with "Indonesia"
    And user input city textbox with "Denpasar"
    And user input credit card textbox with "12345678"
    And user input month textbox with "April"
    And user input year textbox with "2025"
    When user click on the Purchase Button
    Then user will see a success message

  Scenario: User Place Order with Empty Field
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    And user click on the add to cart button
    And user will be able to see a pop up message
    And user click on the Cart button
    And user will be redirected to the cart page
    And user click on the Place Order Button
    When user click on the Purchase Button
    Then user will see a error message

  Scenario: User close Place Order Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the product
    And user will be redirected to the product detail page
    And user click on the add to cart button
    And user will be able to see a pop up message
    And user click on the Cart button
    And user will be redirected to the cart page
    And user click on the Place Order Button
    When user click on the close button at the Place Order Pop Up
    Then user will be redirected to the cart page