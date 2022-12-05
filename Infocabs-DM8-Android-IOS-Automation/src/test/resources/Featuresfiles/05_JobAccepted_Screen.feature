Feature: Accepted Screen verification

  Scenario: Accepted job Screen verification
    Given Accepted job screens comes as Driver accept the Job
    When Driver Click on Waiting button
    Then Job Status become Waiting
