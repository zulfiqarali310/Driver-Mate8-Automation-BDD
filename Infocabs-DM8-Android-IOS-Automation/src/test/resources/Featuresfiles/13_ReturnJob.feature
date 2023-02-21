Feature: Verify Return Job functionality on Accepted and Waiting screen

  @ReturnJob
  Scenario Outline: Job has been created from so that driver can recive and Return it on Accepted screen
    Given Job request are given to return job on Accepted screen
    When Job request are send to the server to return job on Accepted screen
    Then new job has been created in order to return job on Accepted screen

  @ReturnJob
  Scenario Outline: Return job verification on Accepted screen
    Given Job has been received on DM8 and Accept it
    When move scroll up so that return button visible on Accepted screen
    And click on Return job button on Accepted screen
    And check to verify return job "<returnjob>" text on Accepted screen
    And check to verify return job detials "<returnjobdetails>" text on Accepted screen
    And click on yes button on Accepted screen
    Then job has been returned on Accepted screen

    Examples: 
      | returnjob  | returnjobdetails                      |
      | Return Job | Do you really want to return the job? |

  @ReturnJob
  Scenario Outline: Job has been created from so that driver can recive and Return it on waiting screen
    Given Job request are given to return job on waiting screen
    When Job request are send to the server to return job on waiting screen
    Then new job has been created in order to return job on waiting screen

  @ReturnJob
  Scenario Outline: Return job verification on waiting screen
    Given Job has been received on DM8 and Accept it and move to waiting screen
    When move scroll up so that return button visible on Waiting screen
    And click on Return job button
    And click on yes button
    Then job has been returned on waiting screen
