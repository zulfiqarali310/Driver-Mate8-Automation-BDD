Feature: Incoming Screen verification

  Scenario: Incoming job Screen verification
    Given Incoming job screens comes as job assigned to the driver
    When Driver Click on Accept button
    Then Job Status become Accepted
