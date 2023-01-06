Feature: Verify Show on Map and Job Rejection on Incoming job screen

  @OnboardingJobCreation
  Scenario Outline: Job has been created from Evop so that driver can receive it
    Given Job request are given
    When Job request are send to the server
    Then new job has been created in order to reject it from driver App

  @OnboardingShowonMap
  Scenario Outline: Show on map feature verification on Incoming job
    Given Job has been received on DM8 to verify show on map
    When click on show on map button
    And check to verify map is properly displaying on Incoming job screen
    And the click on Cross button to close the show on map
    Then Then Show on map has been verified on incoming job screen

  @OnboardingRejection
  Scenario Outline: Job rejection from DM8
    Given Job has been received on DM8
    When click on Reject button
    Then job has beeen reject from the Driver
