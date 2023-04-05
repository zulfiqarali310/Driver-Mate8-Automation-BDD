Feature: Waiting time charges Verifications and Testing

  @WaitingTimeCharges
  Scenario Outline: Create a Job from evop Using API Data to verify Waiting Time Charges
    Given Job request are given for Waiting Time Charges Verification on DM8
    When Job request are send to the server for Waiting Time Charges Verification
    Then new job has been created with Waiting Time Charges Data

  @WaitingTimeCharges
  Scenario Outline: Accept Job and move it to the Waiting status so that Waiting time Charges can be verified
    Given Job has been received on DM8 For Waiting time Charge and Accept and move to Waiting status
    When Accept and move to waiting status for Waiting time Charge
    And click on Meter Expand button so that waiting charges can be clearled vissible
    Then Job status should be waiting and Meter should be expand waiting charges

  @WaitingTimeCharges
  Scenario Outline: Verify and Test Waiting Time Charges for Single Slab
    Given Job are in waiting and Meter menu are expanded and visible for Single Slab
    When Click on Start waiting button waiting Time and Charges are started for single slab
    And wait for first Subsequent time so that charges are get added for single slab
    And verify cost of first increamented value once waiting charges get increased for single slab
    And wait for next one to Two minutes so that charges and Time values are getting increasing Single Slab
    And Verify Cost value should be increased to the required value for Single slab
    And Stop Waiting Time and Move Job to POB Status so that waiting charges can be verified for POB on single Slab
    And Start Waiting Time on POB for Single Slab
    And wait for upto one minute so that waiting charges can be increased
    And Stop Waiting time and verify the cost added in POB for Single slab
    And Move job to STC aand start waiting for Single slab
    And wait for upto one minute on STC for Single slab
    And Stop waiting time and verify cost added value on STC for Single slab
    And click on Clear and then Submit button so that cleared job with Waiting charges verification
    Then Waiting Charges are verified for all job status on Single slab

    
