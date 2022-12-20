Feature: POB Screen verification

  Scenario: POB job Screen verification
    Given Job are in POB status
    When Driver Click on STC button
    Then Job Status become STC
