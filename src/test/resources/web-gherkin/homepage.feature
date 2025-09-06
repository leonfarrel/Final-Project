Feature: Homepage

  Scenario: Access the Homepage
    Given user access the homepage
    Then user will be redirected to the homepage

  Scenario: Access the Phone Category List
    Given user access the homepage
    And user will be redirected to the homepage
    When  user click on the phone category button
    Then  user will see phone list

  Scenario: Access the Laptops Category List
    Given user access the homepage
    And user will be redirected to the homepage
    When  user click on the laptop category button
    Then user will see laptop list

  Scenario: Access the Monitors Category List
    Given user access the homepage
    And user will be redirected to the homepage
    When  user click on the monitor category button
    Then user will see monitor list

  Scenario: Access the Next Page
    Given user access the homepage
    And user will be redirected to the homepage
    When  user click on next Button
    Then user will be redirected to the next page

  Scenario: Access the Previous Page
    Given user access the homepage
    And user will be redirected to the homepage
    And  user click on next Button
    And user will be redirected to the next page
    When user click on the previous button
    Then user will be redirected to the previous page

  Scenario: Access the Product Detail Page
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the product
    Then user will be redirected to the product detail page

  Scenario: Open the About Us Pop up
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the About Us button
    Then user will see the About us Pop Up

  Scenario: Open the Contact Pop up
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the Contact button
    Then user will see the Contact Pop Up

  Scenario: Access the Cart Page
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the Cart button
    Then user will be redirected to the cart page

  Scenario: Access the Login Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the Login button
    Then user will see the Login Pop Up

  Scenario: Access the Sign In Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    When user click on the Sign In button
    Then user will see the Sign In Pop Up

