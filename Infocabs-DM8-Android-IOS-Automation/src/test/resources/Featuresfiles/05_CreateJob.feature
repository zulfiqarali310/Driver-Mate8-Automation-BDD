Feature: Job creation From Evop

  @Onboarding
  Scenario Outline: Job Creation from Evop
    Given The Valid API urls and request data are given and request are send to the server
    Then new job has been created
