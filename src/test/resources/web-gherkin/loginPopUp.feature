Feature: Login

  Scenario: Login with a Registered Account
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    And user input registered username textbox with "leontest1"
    And user input registered password textbox with "password123"
    When user click on the Log in button
    Then user will be able to see name of user

  Scenario: Logout of the current Account
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    And user input registered username textbox with "leontest1"
    And user input registered password textbox with "password123"
    And user click on the Log in button
    And user will be able to see name of user
    When user click on the Log out Button
    Then user will be redirected to the homepage

  Scenario: Close the Login Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    When user click on the close button at the Login Pop Up
    Then user will be redirected to the homepage

  Scenario: Login with a empty field
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    When user click on the Log in button
    Then user will be able to see error message at the Login Pop Up

  Scenario: Login with a Unregistered Username
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    And user input unregistered username textbox with "testingtheunregisteredusername"
    And user input registered password textbox with "password123"
    When user click on the Log in button
    Then user will be able to see not registered username message

  Scenario: Login with a Incorrect Password
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Login button
    And user will see the Login Pop Up
    And user input registered username textbox with "leontest1"
    And user input incorrect password textbox with "wrongpassword123"
    When user click on the Log in button
    Then user will be able to see wrong password message