Feature: Accepted Screen verification

  @OnboardingVerification
  Scenario Outline: Accepted job Screen UI elements verification
    Given Accepted job screens comes as job accepted by the driver
    When move scroll up so that pick and drop address and screen UI are visible
    And Verify customer image
    And verify customer name
    And getting late icon
    And message chat icon
    And re route icon
    And current location icon
    And verify start navigation icon
    And check pickup whole box
    And check dropoff whole box
    And Check accepted screen pickup zone text
    And Check accepted screen pickup address text
    And check accepted screen dropoff zone text
    And check accepted screen dropoff Address text
    And check accepted screen jobtype text
    And check accepted screen payment text
    And check accepted screen Booking text
    And check accepted screen tariff text
    And check driver notes text
    And check waiting button "<waiting>" text
    And move scroll down so that pick and drop address and screen UI are not visible
    Then Accepted Job screen UI elements are verified

    Examples: 
      | waiting |
      | Waiting |

  @Onboarding
  Scenario Outline: To Move job to the waiting status as driver tab on waiting button
    When Driver Click on Waiting button
    Then Job Status become Waiting
