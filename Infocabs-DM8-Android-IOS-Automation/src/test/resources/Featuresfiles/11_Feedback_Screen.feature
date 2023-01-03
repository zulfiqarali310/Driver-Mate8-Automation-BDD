Feature: Feedback Screen UI verification and Complete Testing

  @OnboardingVerification
  Scenario Outline: Feedback Screens UI and buttons clicks verifications
    Given Feedback screen comes as job cleared
    When Driver is on Feedback Screen and lets verify Feedback screens UI and texts fields
    And check job details "<jobdetails>" text on feedback screen
    And check job number with text on feedback screen
    And check pick address icon on feedback screen
    And check drop off address icon on feedback screen
    And Check feedback screen pickup zone text
    And Check feedback screen pickup address text
    And check feedback screen dropoff zone text
    And check feedback screen dropoff Address text
    And check feedback screen customer name
    And check feedback screen Customer rating
    And check submit button "<submit>" text on feedback screen
    Then Feedback screen UI and text fields are verified

    Examples: 
      | jobdetails  | submit |
      | Job Details | Submit |

  @Onboarding
  Scenario Outline: Write and submit a feedback for customer
    Given Feedback screen comes so that feedback must be provided
    When Driver click on Customer rating stars
    And click to enter feedback for customer "<customerfeedback>"
    And click on Submit button
    Then Feedback added and job become completed

    Examples: 
      | customerfeedback                                                    |
      | Customer is amazing he pay extra tip for the rid so he need 5 stars |
