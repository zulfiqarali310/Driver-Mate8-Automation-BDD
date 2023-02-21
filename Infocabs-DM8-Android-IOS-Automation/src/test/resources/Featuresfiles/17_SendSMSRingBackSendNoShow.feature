Feature: Verify On Send SMS Ring back and Send No Show on Job Waiting status

  @SendSMSRingBackSendNoShow
  Scenario Outline: Job creation from Evop for verification of Send SMS Ring back and Send No Show on Job Waiting status
    Given Job request are given for Send SMS Ring back and Send No Show on Job Waiting status verification
    When Job request are send to the server for Send SMS Ring back and Send No Show on Job Waiting status verification
    Then new job has been created in order to check and verify Send SMS Ring back and Send No Show on Job Waiting status

  @SendSMSRingBackSendNoShow
  Scenario Outline: Send SMS Ring back verification on Waiting screen
    Given Job has been received on DM8 and Accept and move to waiting status for Map Send SMS Ring Back verifications
    When click on Send SMS Ring Back button on Waiting screen
    And check verify alert "<alert>" text
    And check to verify details sendsms "<sendsmsring>" text
    And check to verify ok "<ok>" text
    And click on OK button on Send SMS ringback alert
    Then Send SmS alert are verified and message are send

    Examples: 
      | alert | sendsmsring       | ok |
      | Alert | SMS/Ringback Sent | Ok |

  @SendSMSRingBackSendNoShow
  Scenario Outline: Customer send no show verification on Waiting screen
    Given Job status are in waiting check to verify Customer no show
    When scroll up the screen so that Send no show button are visible
    And wait so that Send no show time complete
    And click on Send no show button on Waiting screen
    And check verify no show alert "<alert1>" text
    And check to verify send no show details "<details>" text
    And check no "<no>" button on no show alert
    And check yes "<yes>" text on no show alert
    And click on Yes button on No show alert
    And check to verify the Alert title on send no show
    And check to verify details send no show alert text
    And click on ok button on Send no show alert
    Then Job has been reported No show on driver navigate back to to home screen

    Examples: 
      | alert1  | details                                               | no | yes |
      | No Show | Do you really want to send No-Show and clear the job? | NO | YES |
