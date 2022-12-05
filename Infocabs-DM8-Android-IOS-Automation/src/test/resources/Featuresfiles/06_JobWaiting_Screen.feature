Feature: Waiting Screen verification

  Scenario: Waiting job Screen verification
    Given Job are in waiting status
    When Driver Click on POB button
    Then Job Status become POB
