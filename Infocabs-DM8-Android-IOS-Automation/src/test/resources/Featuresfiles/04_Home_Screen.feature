Feature: DM8 Home Screen verification

  @Onboarding
  Scenario Outline: DM8 Home Screen verification
    Given Driver is on Home screen as logged
    When check and verify Zone name text
    And check Queue text
    And check Refresh button icon
    And check menu button
    And check wifi image icon
    And check gps image icon
    And check all "<all>" text
    And check now "<now>" text
    And check 15mins "<fifteenmins>" text
    And check 30mins "<thirtymins>" text
    And check zonename "<zonename>" text
    And check drivers "<drivers>" text
    And check jobs "<jobs>" text
    And check bidjobs "<bidjobs>" text
    And check Hotzone job area
    And check light onoff icon
    And check youonline "<youonline>" text
    And check avoidjobs "<avoidjobs>" text
    And click on go Offline button to make driver offline
    And check youoffline "<youoffline>" text
    And check goonline "<goonline>" text
    And click on go Online button to make driver online
    Then DM8 Home screen all text are verified

    Examples: 
      | all | now | fifteenmins | thirtymins | zonename  | drivers | jobs | bidjobs  | youonline       | avoidjobs                | youoffline       | goonline               |
      | All | Now | 15 mins     | 30 mins    | ZONE NAME | DRIVERS | JOBS | BID JOBS | You are online! | Go offline to avoid jobs | You are offline! | Go online for new jobs |
