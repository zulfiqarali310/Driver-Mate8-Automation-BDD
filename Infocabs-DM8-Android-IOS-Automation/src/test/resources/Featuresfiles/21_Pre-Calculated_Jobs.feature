Feature: Pre-Calculated Price Jobs Verifications and Testing

  @Pre-CalculatedJobs
  Scenario Outline: Create a Pre Calculated Price job from evop Using API Data
    Given Job request are given for Pre Calculated Price Verification on DM8
    When Job request are send to the server for Pre Calculated Price Verification
    Then new job has been created with Pre Calculated Price Tariff value

  @Pre-CalculatedJobs
  Scenario Outline: Accept Job To Verify Pre Calculated Price Job
    Given Job has been received on DM8 For Pre Calculated Price Verification and Accept and move to STC status to verify Card payment
    When Accept job to verify Pre Calculated Price Value on DM8
    Then Job status should be accepte to verify on Pre Calculated Prices

  @Pre-CalculatedJobs
  Scenario Outline: Verify Pre Calculated Price on Accepted job screen
    Given Job are in Accepted status to verify Pre Calculated price
    When move scroll up so that Pre Calculated Price Cost Value is visible on Accepted Screen
    And Check to Verify The Pre Calculated Price Cost Value should be same as like Job booked from Evop on Accepted Screen
    And move scroll down on Accepted screen so that Pre Calculated Price Cost can be check on Next screen
    And Click on Waiting button to move job to Waiting Status to check Pre Calculated Price value on it
    Then Pre Calculated Price Value are verified on Accepted screen and job Status are in Waiting

  @Pre-CalculatedJobs
  Scenario Outline: Verify Pre Calculated Price on Waiting job screen
    Given Job are in Waiting status to verify Pre Calculated price
    When Check and Verify Meter Pre Calculated Price Fare value should be same as like job booked from Evop on Waiting Status
    And move scroll up so that Pre Calculated Price Cost Value is visible on Waiting Screen
    And Check to Verify The Pre Calculated Price Cost Value should be same as like Job booked from Evop on Waiting Screen
    And move scroll down on Waiting screen so that Pre Calculated Price Cost can be check on Next screen
    And Click on POB button to move job to POB Status to check Pre Calculated Price value on it
    Then Pre Calculated Price Value are verified on Waiting screen and job Status are in POB

  @Pre-CalculatedJobs
  Scenario Outline: Verify Pre Calculated Price on POB job screen
    Given Job are in POB status to verify Pre Calculated price
    When Check and Verify Meter Pre Calculated Price Fare value should be same as like job booked from Evop on POB Status
    And move scroll up so that Pre Calculated Price Cost Value is visible on POB Screen
    And Check to Verify The Pre Calculated Price Cost Value should be same as like Job booked from Evop on POB Screen
    And move scroll down on POB screen so that Pre Calculated Price Cost can be check on Next screen
    And Click on STC button to move job to STC Status to check Pre Calculated Price value on it
    Then Pre Calculated Price Value are verified on POB screen and job Status are in STC

  @Pre-CalculatedJobs
  Scenario Outline: Verify Pre Calculated Price on STC job screen
    Given Job are in STC status to verify Pre Calculated price
    When Check and Verify Meter Pre Calculated Price Fare value should be same as like job booked from Evop on STC Status
    And move scroll up so that Pre Calculated Price Cost Value is visible on STC Screen
    And Check to Verify The Pre Calculated Price Cost Value should be same as like Job booked from Evop on STC Screen
    And move scroll down on STC screen so that Pre Calculated Price Cost can be check on Next screen
    And Click on Clear button and then click Submit button and Pre Calculated Fare are verified
    Then Pre Calculated Price Value are verified on STC screen and job are now become Completed
