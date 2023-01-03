Feature: Incoming Job Screen Verification

  @OnboardingVerification
  Scenario Outline: Incoming job Screen texts verification
    Given Incoming job screens comes as job assigned to the driver
    When Verify Job offer text
    And Check and verify reject "<reject>" text
    And Check timer text
    #And Check pickup zone text
    And Check pickup address text
    #And check dropoff zone text
    And check dropoff Address text
    And check verify on map "<verifyonmap>" text
    #And check jobtype text
    #And check payment text
    #And check Booking text
    #And check tariff text
    And check accept button "<accept>" text
    Then Incoming Job screen text are verified

    Examples: 
      | reject | verifyonmap | accept |
      | Reject | Show on Map | Accept |

  @Onboarding
  Scenario Outline: To Accept Incoming job as job assigned to driver
    When Driver Click on Accept button
    Then Job Status become Accepted
