Feature: Verify On Job Map Navigation functionality on All Job Status

  @StartNavigation
  Scenario Outline: Job creation from Evop for Map Navigation verification on All Job Status
    Given Job request are given for Map Navigation verification
    When Job request are send to the server for Job Map Navigation verification
    Then new job has been created in order to check and verify Map Navigation in throughout job status

  @StartNavigation
  Scenario Outline: Map Navigation verification on Accepted screen
    Given Job has been received on DM8 and Accept it for Map Navigation verifications
    When click on Map navigation button on Accepted screen
    #And Verify Cost value and text for Map navigation on Accepted screen
    #And check distance "<distance>" text for Map navigation on Accepted screen
    #And check to verify miles covered values and text for Map navigation on Accepted screen
    #And check waiting lable "<waiting>" text for Map navigation on Accepted screen
    #And Check waiting time value for Map navigation on Accepted screen
    And click on Back button to bring App back on screen for Map navigation on Accepted screen
    And click on waiting button to move to waiting status for Map navigation on Accepted screen
    Then Map Navigations all UI elments are verified on Accepted screen

    Examples: 
      | distance | waiting |
      | Distance | Waiting |

  @StartNavigation
  Scenario Outline: Map Navigation verification on Waiting screen
    Given Job are in waiting status for Map Navigation verifications
    When click on Map navigation button on Waiting screen
    #And Verify Cost value and text for Map navigation on Waiting screen
    #And check distance "<distance>" text for Map navigation on Waiting screen
    #And check to verify miles covered values and text for Map navigation on Waiting screen
    #And check waiting lable "<waiting>" text for Map navigation on Waiting screen
    #And Check waiting time value for Map navigation on Waiting screen
    #And click on Back button to bring App back on screen for Map navigation on Waiting screen
    And click on POB button to move to pob status for Map navigation on Waiting screen
    Then Map Navigations all UI elments are verified on Waiting screen

    Examples: 
      | distance | waiting |
      | Distance | Waiting |

  @StartNavigation
  Scenario Outline: Map Navigation verification on POB screen
    Given Job are in pob status for Map Navigation verifications
    When click on Map navigation button on POB screen
    #And Verify Cost value and text for Map navigation on POB screen
    #And check distance "<distance>" text for Map navigation on POB screen
    #And check to verify miles covered values and text for Map navigation on POB screen
    #And check waiting lable "<waiting>" text for Map navigation on POB screen
    #And Check waiting time value for Map navigation on POB screen
    And click on Back button to bring App back on screen for Map navigation on POB screen
    And click on STC button to move to stc status for Map navigation on POB screen
    Then Map Navigations all UI elments are verified on POB screen

    Examples: 
      | distance | waiting |
      | Distance | Waiting |

  @StartNavigation
  Scenario Outline: Map Navigation verification on STC screen
    Given Job are in STC status for Map Navigation verifications
    When click on Map navigation button on STC screen
    #And Verify Cost value and text for Map navigation on STC screen
    #And check distance "<distance>" text for Map navigation on STC screen
    #And check to verify miles covered values and text for Map navigation on STC screen
    #And check waiting lable "<waiting>" text for Map navigation on STC screen
    #And Check waiting time value for Map navigation on STC screen
    And click on Back button to bring App back on screen for Map navigation on STC screen
    And click on Clear button to move to Feedback screen so that all status are verified
    Then Map Navigations all UI elments are verified on STC screen

    Examples: 
      | distance | waiting |
      | Distance | Waiting |
