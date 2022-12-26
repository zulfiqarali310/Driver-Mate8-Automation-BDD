Feature: Accepted Screen verification

  @Onboarding
  Scenario Outline: Accepted job Screen UI elements verification
    Given Accepted job screens comes as job accepted by the driver
    When Verify customer image
    And verify customer name
    And getting late icon
    And message chat icon
    And re route icon
    And current location icon
    And verify start navigation icon
    And check pickup whole box
    And check dropoff whole box
    And Check waiting screen pickup zone text
    And Check waiting screen pickup address text
    And check waiting screen dropoff zone text
    And check waiting screen dropoff Address text
    And check waiting screen jobtype text
    And check waiting screen payment text
    And check waiting screen Booking text
    And check waiting screen tariff text
    And check driver notes text
    And check waiting button "<waiting>" text
    Then Accepted Job screen UI elements are verified

    Examples: 
      | waiting |
      | Waiting |

  @Onboarding
  Scenario Outline: To Move job to the waiting status as driver tab on waiting button
    When Driver Click on Waiting button
    Then Job Status become Waiting
