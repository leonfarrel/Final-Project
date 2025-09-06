Feature: Positive API Automation

  Scenario: Get all user
    Given API is available
    When request all user
    Then response code should be 200

  Scenario: Get specific user
    Given API is available
    When request user id "60d0fe4f5311236168a10a0d"
    Then response code should be 200

  Scenario: Post user
    Given API is available
    When create a new user with firstname "Leon" lastname "farrel" email "leon@test111.com"
    Then response code should be 200

  Scenario: Put existing user
    Given API is available
    When put user with id "60d0fe4f5311236168a109d4" firstname "John" lastname "Joestar" email "jojo100@test.com"
    Then response code should be 200

  Scenario: Patch existing user
    Given API is available
    When patch user with id "60d0fe4f5311236168a109d7" firstname "Rick" lastname "Morty" email "ricky@test.com"
    Then response code should be 200

  Scenario: Delete existing user
    Given API is available
    When delete user with id "60d0fe4f5311236168a109f0"
    Then response code should be 200
