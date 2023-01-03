Feature: Verify that driver able to reject the job once received on DM8

  @OnboardingRejection
  Scenario Outline: Job has been created from Evop so that driver can reject it
    Given Job request are given
    When Job request are send to the server
    Then new job has been created in order to reject it from driver App

  @OnboardingRejection
  Scenario Outline: Job rejection from DM8
    Given Job has been received on DM8
    When click on Reject button
    Then job has beeen reject from the Driver
