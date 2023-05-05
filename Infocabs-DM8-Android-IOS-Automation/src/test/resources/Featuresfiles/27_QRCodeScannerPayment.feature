Feature: QR Code Scanner Payment on STC Screen so that payment can be made

  @QRCodeScannerPayment
  Scenario Outline: Create a Job from Evop API so that payment can be made on QR Code
    Given Job request are given for QR Code payment
    When Job request are send to the server for QR Code Payment with "<mobileNum>" mobile number
    Then new job has been created to Verify QR Code payment
    
    
      Examples: 
      | mobileNum     |
      | 447899776901 |

  @QRCodeScannerPayment
  Scenario Outline: Accept Job and move to STC Status for QR Code Payment
    Given Job has been received on DM8 and move to STC status for QR Code Payment
    When Accept job and move to STC so that payment can be made on QR Code
    Then Job status should be in STC so that QR Code button should be visible
    
    
    @QRCodeScannerPayment
  Scenario Outline: Click to open QR Code screen and perform required actions
      Given QR Code button are avaible on STC screen
    When Click on QR Code button on for payment
    And click on clear and submit button so that QR Code payment successed
    Then payment can be made
    