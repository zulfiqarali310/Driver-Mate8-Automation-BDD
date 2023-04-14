Feature: Credit card Job Payment Verifications and Testing

  @CreditCardJobs
  Scenario Outline: Create a Credit card Job Payment from evop Using API Data
    Given Job request are given for Credit card Job Payment Verification on DM8
    When Job request are send to the server for Credit card Job Payment Verification
    Then new job has been created with Credit card Job Payment value

  @CreditCardJobs
  Scenario Outline: Accept Job To Verify Fixed Price Job
    Given Job has been received on DM8 For Fixed Price Verification and Accept and move to STC status to verify Card payment
    When Accept job to verify Price Value on DM8
    Then Job status should be accepte to verify on Fixed Prices

  @CreditCardJobs
  Scenario Outline: Verify Fixed Price on Accepted job screen
    Given Job are in Accepted status to verify fixed price
    When move scroll up so that Fixed Price Cost Value is visible on Accepted Screen
    And Check to Verify The Fixed Price Cost Value should be same as like Job booked from Evop on Accepted Screen
    And move scroll down on Accepted screen so that Fixed Price Cost can be check on Next screen
    And Click on Waiting button to move job to Waiting Status to check Fixed Price value on it
    Then Fixed Price Value are verified on Accepted screen and job Status are in Waiting

  @CreditCardJobs
  Scenario Outline: Verify Fixed Price on Waiting job screen
    Given Job are in Waiting status to verify fixed price
    When Check and Verify Meter Fixed Price Fare value should be same as like job booked from Evop on Waiting Status
    And move scroll up so that Fixed Price Cost Value is visible on Waiting Screen
    And Check to Verify The Fixed Price Cost Value should be same as like Job booked from Evop on Waiting Screen
    And move scroll down on Waiting screen so that Fixed Price Cost can be check on Next screen
    And Click on POB button to move job to POB Status to check Fixed Price value on it
    Then Fixed Price Value are verified on Waiting screen and job Status are in POB

  @CreditCardJobs
  Scenario Outline: Verify Fixed Price on POB job screen
    Given Job are in POB status to verify fixed price
    When Check and Verify Meter Fixed Price Fare value should be same as like job booked from Evop on POB Status
    And move scroll up so that Fixed Price Cost Value is visible on POB Screen
    And Check to Verify The Fixed Price Cost Value should be same as like Job booked from Evop on POB Screen
    And move scroll down on POB screen so that Fixed Price Cost can be check on Next screen
    And Click on STC button to move job to STC Status to check Fixed Price value on it
    Then Fixed Price Value are verified on POB screen and job Status are in STC

  @CreditCardJobs
  Scenario Outline: Verify Fixed Price on STC job screen
    Given Job are in STC status to verify fixed price
    When Check and Verify Meter Fixed Price Fare value should be same as like job booked from Evop on STC Status
    And move scroll up so that Fixed Price Cost Value is visible on STC Screen
    And Check to Verify The Fixed Price Cost Value should be same as like Job booked from Evop on STC Screen
    And move scroll down on STC screen so that Fixed Price Cost can be check on Next screen
    And Click on Clear button and then click Submit button and Fixed Fare are verified
    Then Fixed Price Value are verified on STC screen and job are now become Completed
