Feature: Negative API Automation

  Scenario: Get non existing user
    Given API is available
    When request non existing user id "60d0fe4f5311236168a10a0d0"
    Then response body should show "PARAMS_NOT_VALID"

  Scenario: Post user with an existing data
    Given API is available
    When create a new user with existing data firstname "Leon" lastname "farrel" email "leon@test.com"
    Then response body should show "Email already used"

  Scenario: Put data on invalid user
    Given API is available
    When put data for invalid user with id "60d0fe4f5311236168a109d40" firstname "Leon" lastname "farrel" email "leon@test.com"
    Then response body should show "PARAMS_NOT_VALID"

  Scenario: Patch data on invalid user
    Given API is available
    When patch data for invalid user with id "60d0fe4f5311236168a109d40" firstname "Leon" lastname "farrel" email "leon@test.com"
    Then response body should show "PARAMS_NOT_VALID"

  Scenario: Delete invalid user
    Given API is available
    When delete invalid user with id "60d0fe4f5311236168a109e10"
    Then response body should show "PARAMS_NOT_VALID"