Feature: Verify Drivers Messages Alert functionality on All Job Status

  @OnboardingDriversMessages
  Scenario Outline: Job creation from Evop for Drivers messages verification on All Job Status
    Given Job request are given for Drivers Messages alert verification
    When Job request are send to the server for Drivers messages verification
    Then new job has been created in order to check and verify Drivers Messages in throughout job status

  @OnboardingDriversMessages
  Scenario Outline: Drivers Messages verification on Accepted screen
    Given Job has been received on DM8 and Accept it for Drivers Messages verifications
    When click on message icon chat button on Accepted screen
    And check Message whole alerts on Accepted screen
    And check alerttitle "<msg>" text on Accepted screen
    And click message chat icon button for second time on Accepted screen
    And chech to verify message area on Accepted screen
    And check to verify cancle "<cnle>" button text Accepted screen
    And check to verify send "<send>" button text on Accepted screen
    And click message chat icon to send message on Accepted screen
    And click on message button on Accepted screen
    And click on send button button on Accepted screen
    And click on move job to waiting status for Chat message verification
    Then All UI and text are verified on Accepted screen

    Examples: 
      | msg      | cnle   | send |
      | Messages | CANCEL | SEND |

  @OnboardingDriversMessages
  Scenario Outline: Drivers Messages verification on Waiting screen
    Given Job are in waiting status
    When click on message icon chat button on Waiting screen
    And check Message whole alerts on Waiting screen
    And check alerttitle "<msg>" text on Waiting screen
    And click message chat icon button for second time on Waiting screen
    And chech to verify message area on Waiting screen
    And check to verify cancle "<cnle>" button text Waiting screen
    And check to verify send "<send>" button text on Waiting screen
    And click message chat icon to send message on Waiting screen
    And click on message button on Waiting screen
    And click on send button button on Waiting screen
    And click on move job to pob status for Chat message verification
    Then All UI and text are verified on Waiting screen

    Examples: 
      | msg      | cnle   | send |
      | Messages | CANCEL | SEND |

  @OnboardingDriversMessages
  Scenario Outline: Drivers Messages verification on POB screen
    Given Job are in pob status
    When click on message icon chat button on POB screen
    And check Message whole alerts on POB screen
    And check alerttitle "<msg>" text on POB screen
    And click message chat icon button for second time on POB screen
    And chech to verify message area on POB screen
    And check to verify cancle "<cnle>" button text POB screen
    And check to verify send "<send>" button text on POB screen
    And click message chat icon to send message on POB screen
    And click on message button on POB screen
    And click on send button button on POB screen
    And click on move job to stc status for Chat message verification
    Then All UI and text are verified on POB screen

    Examples: 
      | msg      | cnle   | send |
      | Messages | CANCEL | SEND |

  @OnboardingDriversMessages
  Scenario Outline: Drivers Messages verification on STC screen
    Given Job are in stc status
    When click on message icon chat button on STC screen
    And check Message whole alerts on STC screen
    And check alerttitle "<msg>" text on STC screen
    And click message chat icon button for second time on STC screen
    And chech to verify message area on STC screen
    And check to verify cancle "<cnle>" button text STC screen
    And check to verify send "<send>" button text on STC screen
    And click message chat icon to send message on STC screen
    And click on message button on STC screen
    And click on send button button on STC screen
    And click on move job to clear status for Chat message verification
    Then All UI and text are verified on STC screen

    Examples: 
      | msg      | cnle   | send |
      | Messages | CANCEL | SEND |

  #@OnboardingDriversMessages
  #Scenario Outline: Drivers Messages verification on Clear screen
    #Given Job are in clear status
    #When click on message icon chat button on Clear screen
    #And check Message whole alerts on Clear screen
    #And check alerttitle "<msg>" text on Clear screen
    #And click message chat icon button for second time on Clear screen
    #And chech to verify message area on Clear screen
    #And check to verify cancle "<cnle>" button text Clear screen
    #And check to verify send "<send>" button text on Clear screen
    #And click message chat icon to send message on Clear screen
    #And click on message button on Clear screen
    #And click on send button button on Clear screen
    #And click on move job to Feedback status for Chat message verification
    #Then All UI and text are verified on Clear screen

    #Examples: 
     # | msg      | cnle   | send |
      #| Messages | CANCEL | SEND |
