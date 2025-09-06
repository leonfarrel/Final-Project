Feature: Sign Up

  Scenario: Register a new Account
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Sign In button
    And user will see the Sign In Pop Up
    And user input username textbox with "leontest11"
    And user input password textbox with "password123"
    When user click on the Sign Up Button
    Then user will be able to see success message

  Scenario: Register a new Account with empty field
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Sign In button
    And user will see the Sign In Pop Up
    When user click on the Sign Up Button
    Then user will be able to see error message at the Sign up Pop Up

  Scenario: Register a new Account with used username
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Sign In button
    And user will see the Sign In Pop Up
    And user input username textbox with used username "leontest1"
    And user input password textbox with "password123"
    When user click on the Sign Up Button
    Then user will be able to see used username message

  Scenario: Close the Sign Up Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Sign In button
    And user will see the Sign In Pop Up
    When user click on the close button at the Sign Up Pop Up
    Then user will be redirected to the homepage

