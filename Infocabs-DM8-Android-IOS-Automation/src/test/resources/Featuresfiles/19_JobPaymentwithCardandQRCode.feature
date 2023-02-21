Feature: Verify that Driver can be able to pay Job payment using Cards and QR code

  @JobPayments
  Scenario Outline: Create a job from evop to verify Driver can pay the Card and QR code payment
    Given Job request are given for Card and QR code payment
    When Job request are send to the server for or Card and QR code payment
    Then new job has been created in order to check and verify or Card and QR code payment

  @JobPayments
  Scenario Outline: Card Payment Verification
    Given Job has been received on DM8 and Accept and move to STC status to verify Card payment
    When check that Driver are in STC status by verifying clear "<clr>" button text for Card payments
    And Click on Card payment button so that Card screen should be opend
    And check for Visa Card payment button
    And check for MasterCard payment button
    And check for American Express payment button
    And check for surcharge text
    And check for pay button text
    And check for payment cancle "<cnl>" text
    And click on Cancle button on payment screen
    Then Payment screen icons and UI are verified

    Examples: 
      | clr   | surcharge                  | paytext    | cnl    |
      | Clear | Inclusive Surcharge = 0.31 | PAY £ 3.43 | CANCEL |

  @JobPayments
  Scenario Outline: QR Code Payment Verification
    Given check that Driver are in STC status by verifying clear "<clr>" button text for QR Code payments
    When Click on QR Code payment button so that QR Code payment alert are opned
    And check for QR Code "<code>" text
    And check for QR Code area
    And check for QR code close "<close>" text
    And click on Close button so that QR code alert closed
    And click to clear and submit the job with all payments
    Then QR Code UI are also verified

    Examples: 
      | clr   | code    | close |
      | Clear | QR Code | Close |
