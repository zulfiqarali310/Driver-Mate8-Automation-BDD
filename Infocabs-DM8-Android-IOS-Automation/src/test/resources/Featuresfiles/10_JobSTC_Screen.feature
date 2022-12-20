Feature: STC Screen verification

  Scenario: STC job Screen verification
    Given Job are in STC status
    When Driver Click on Clear button
    Then Job Status become clear and complete
