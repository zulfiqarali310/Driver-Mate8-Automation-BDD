Feature: Verify Getting late Alert functionality on Accepted and Waiting screen

  @Gettinglate
  Scenario Outline: Job creation from Evop for getting late verification on Accepted and waiting screen
    Given Job request are given to for Getting late alert verification
    When Job request are send to the server for Getting late verification
    Then new job has been created in order to check and verify Getting late on Accepted and waiting screen

  @Gettinglate
  Scenario Outline: Getting late verification on Accepted screen
    Given Job has been received on DM8 and Accept it for Getting late verification
    When click on getting late button on Accepted screen
    And check to verify getting late icon on alert on Accepted screen
    And check to verify heading text on Accepted screen
    And click on back cross button on Accepted screen
    And click on again late button to open Getting late alert on Accepted screen
    And now verify details1 "<details1>" text on Accepted screen
    And now verify details2 "<details2>" on Accepted screen
    And again click on late button for 5 mins wait on Accepted screen
    And click on 5mins wait box on Accepted screen
    And click late button for 10 mins wait on Accepted screen
    And click on 10mins wait box on Accepted screen
    And click on late button for 15 mins wait on Accepted screen
    And click on 15mins wait box on Accepted screen
    And click on late button for 20 mins wait on Accepted screen
    And click on 20mins wait box on Accepted screen
    And click again late button for continue button verification on Accepted screen
    And check that continue button are available on Accepted screen
    Then Getting late feature are verified on Accepted screen

    Examples: 
      | headingtext                       | details1                        | details2                                         |
      | You’re getting late for this job! | How long will it take to get to | BRADLEY PARK GOLF COURSEBRADLEY ROADHUDDERSFIELD |

  @Gettinglate
  Scenario Outline: Getting late verification on Waiting screen
    Given Job has been received on DM8 and Accept it and then move to waiting screen for Getting late verification
    When click on getting late button on Waiting screen
    And check to verify getting late icon on alert on Waiting screen
    And check to verify heading text on Waiting screen
    And click on back cross button on Waiting screen
    And click on again late button to open Getting late alert on Waiting screen
    And now verify details1 "<details1>" text on Waiting screen
    And now verify details2 "<details2>" on Waiting screen
    And again click on late button for 5 mins wait on Waiting screen
    And click on 5mins wait box on Waiting screen
    And click late button for 10 mins wait on Waiting screen
    And click on 10mins wait box on Waiting screen
    And click on late button for 15 mins wait on Waiting screen
    And click on 15mins wait box on Waiting screen
    And click on late button for 20 mins wait on Waiting screen
    And click on 20mins wait box on Waiting screen
    And click again late button for continue button verification on Waiting screen
    And check that continue button are available on Waiting screen
    And make complete the job once verified with Getting late feature
    Then Getting late feature are verified on Waiting screen

    Examples: 
      | headingtext                       | details1                        | details2                                         |
      | You’re getting late for this job! | How long will it take to get to | BRADLEY PARK GOLF COURSEBRADLEY ROADHUDDERSFIELD |
