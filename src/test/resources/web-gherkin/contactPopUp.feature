Feature: Contact

  Scenario: Send a Message
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Contact button
    And user will see the Contact Pop Up
    And user input email textbox with "leon@test.com"
    And user input name textbox at contact pop up with "Leon Farrel"
    And user input message textbox with "Hello World"
    When user click on the send message button
    Then user will see a success feedback message

  Scenario: Close Contact Pop Up
    Given user access the homepage
    And user will be redirected to the homepage
    And user click on the Contact button
    And user will see the Contact Pop Up
    When user click on the close button
    Then user will be redirected to the homepage
