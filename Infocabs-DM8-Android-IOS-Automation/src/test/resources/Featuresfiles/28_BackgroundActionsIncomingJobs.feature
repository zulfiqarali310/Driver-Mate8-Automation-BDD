Feature: BackGround actions on Incoming jobs and No Answer Job actions on DM8

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: Kill DM8 App and open it from Notification
    Given DM8 Application should be lucnhed and open
    When kill DM8 application
    And open application from Notification
    And verify that user should be on DM8 Home screen after click on Notification
    Then DM8 application kill and open from Notification functionality are properly working

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: Job should be UnAswered & app should be in Background when jobs comes
    Given DM8 application should be open for Unanswered background job
    When Dispatch job from Evop when DM8 Application are in Background
    And Kill DM8 application or move it to Background for No Answer Background Job
    And Wait untile job notification gone out
    And check for incomming job notification has been gone off
    Then jobs are UnAnswered when DM8 are in Background

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: when received Job wait for some time then kill app and wait for some time then again open app should be there and start from remaining time
    Given DM8 application should be open for job timer check with background actions
    When Dispatch job from Evop to DM8 for timer check with background actions
    And wait for 5 sec once job received
    And then kill app or move to background for 10 sec
    And when open app then timer should be start from less than 20 sec past
    Then Timer check with Background action on Incoming job are verified

  #@BackgroundActionsIncomingAndJobs
  Scenario Outline: Killed App and Dispatch check and open using Notification
    Given DM8 Application should be lunched to check Job Dispatch when App are killed
    When Killed DM8 App
    And Dispatch Job from Evop Api to DM8
    And check to open job from Notification
    Then Killed app and open using job Notification are verified

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: Check for Demote functionality on Job Rejection
    Given DM8 application should be Open for Demote functionality
    When Dipatch Job from evop for Demote Verification
    And Reject job from DM8
    And check for demote Alert "<textdemote>" text and click OK button
    Then Demote Functioanlity are verified

    Examples: 
      | textdemote                                         |
      | You are Demoted due to 3 Job Rejects / No Answers. |

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: Do a Login and Logout for Sin Bin functionality
    Given DM8 app should be open and user should be on home screen for Login logout for Sin bin
    When User perform complete action side menu click logout button click then user should be logout
    And Login again for Sin bin functionality verification with "<uname>" and paswword "<pwd>" and click on Login button
    Then Logout and login are properly working for Sin bin

    Examples: 
      | uname          | pwd   |
      | zulfiqartest79 | 13327 |

  @BackgroundActionsIncomingAndJobs
  Scenario Outline: Check for Sin bin Functionality on 3 jobs rejection or Unanswered
    Given DM8 Application should be lunched for Sin Bin verification
    When Dispatch 1st job
    And Reject 1st Dispatched job
    And Dispatch 2nd job
    And Reject 2nd Dispatched job
    And Dispatch 3rd job
    And Reject 3rd Dispatched job
    And you will get and verify sin bin text "<sinbintxt>" with alert and click on Ok button
    And you will get Logout Sin bin text "<sinbinlogout>" with alert and click on Ok button
    And now enter login details username "<uname>" and paswword "<pwd>" and click on Login button
    And again you will get login failed sin bin text "<InvalidtextonLogin>" with alert and click on OK button
    And now wait for One minute so that Sin bin time is over
    And again click on Login button
    And user should be able to login
    Then Sin bin functionality are verified and working properly

    Examples: 
      | sinbintxt                                             | sinbinlogout               | uname          | pwd   | InvalidtextonLogin                         |
      | You are sin binned due to 3 Job Rejects / No Answers. | Logging off due to Sin/Bin | zulfiqartest79 | 13327 | Login failed, Invalid Username or Password |
