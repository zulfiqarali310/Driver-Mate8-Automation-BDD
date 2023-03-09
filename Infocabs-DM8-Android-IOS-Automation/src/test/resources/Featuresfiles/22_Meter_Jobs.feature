Feature: Verify that Driver can be able to pay Job payment using Cards and QR code

  @MeterJobs
  Scenario Outline: Create a job from evop to verify Driver can pay the Card and QR code payment
    Given Job request are given for Card and QR code payment
    When Job request are send to the server for or Card and QR code payment
    Then new job has been created in order to check and verify or Card and QR code payment
    
