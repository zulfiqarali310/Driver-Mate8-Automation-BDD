Feature: BackGround actions on Incoming jobs and No Answer Job actions on DM8

  
  
   @BackgroundActionsIncomingAndJobs
  Scenario Outline: Kill DM8 App and open it from Notification
  Given DM8 Application should be lucnhed and open
  When kill DM8 application
  And open application from Notification
  And verify that user should be on DM8 Home screen after click on Notification
  Then DM8 application kill and open from Notification functionality are properly working
  
  
  
  
  
  @BackgroundActionsIncomingAndJobs1
  Scenario Outline: Job has been created from so for Background Actions
    Given Job request are given to return job on Accepted screen
    When Job request are send to the server to return job on Accepted screen
    Then new job has been created in order to return job on Accepted screen
    
    
 