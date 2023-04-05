Feature: Account Jobs Verifications and Testing

  @AccountJobs
  Scenario Outline: Create a Account job from evop Using API Data
    Given Job request are given for Account job Verification on DM8
    When Job request are send to the server for Account job Verification
    Then new job has been created with Account job Tariff value

  @AccountJobs
  Scenario Outline: Accept Job To Verify Account Job
    Given Job has been received on DM8 For Account job Verification and Accept and move to STC status to verify Card payment
    When Accept job to verify Account job Price Value on DM8
    Then Job status should be accepte to verify Price on Account job

  @AccountJobs
  Scenario Outline: Verify Account job Price on Accepted job screen
    Given Job are in Accepted status to verify Account job price
    When move scroll up so that Account job Price Cost Value is visible on Accepted Screen
    And Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on Accepted Screen
    And Payment Type on Accepted screen it should Account Job
    And move scroll down on Accepted screen so that Account job Price Cost can be check on Next screen
    And Click on Waiting button to move job to Waiting Status to check Account job Price value on it
    Then Account job Price Value are verified on Accepted screen and job Status are in Waiting

  @AccountJobs
  Scenario Outline: Verify Account job Price on Waiting job screen
    Given Job are in Waiting status to verify Account job price
    When Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on Waiting Status
    And check PrePaid text on Meter on Waiting job screen
    And move scroll up so that Account job Price Cost Value is visible on Waiting Screen
    And Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on Waiting Screen
    And Payment Type on Waiting screen it should Account Job
    And move scroll down on Waiting screen so that Account job Price Cost can be check on Next screen
    And Click on POB button to move job to POB Status to check Account job Price value on it
    Then Account job Price Value are verified on Waiting screen and job Status are in POB

  @AccountJobs
  Scenario Outline: Verify Account job Price on POB job screen
    Given Job are in POB status to verify Account job price
    When Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on POB Status
    And check PrePaid text on Meter on POB job screen
    And move scroll up so that Account job Price Cost Value is visible on POB Screen
    And Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on POB Screen
     And Payment Type on POB screen it should Account Job
    And move scroll down on POB screen so that Account job Price Cost can be check on Next screen
    And Click on STC button to move job to STC Status to check Account job Price value on it
    Then Account job Price Value are verified on POB screen and job Status are in STC

  @AccountJobs
  Scenario Outline: Verify Account job Price on STC job screen
    Given Job are in STC status to verify Account job price
    When Check and Verify Meter Account job Price Fare value should be same as like job booked from Evop on STC Status
    And check PrePaid text on Meter on STC job screen
    And move scroll up so that Account job Price Cost Value is visible on STC Screen
    And Check to Verify The Account job Price Cost Value should be same as like Job booked from Evop on STC Screen
     And Payment Type on STC screen it should Account Job
    And move scroll down on STC screen so that Account job Price Cost can be check on Next screen
    And verify Payment Taken Fare paid Alert on STC screen
    And Click on Clear button and then click Submit button and Account job Fare are verified
    Then Account job Price Value are verified on STC screen and job are now become Completed
