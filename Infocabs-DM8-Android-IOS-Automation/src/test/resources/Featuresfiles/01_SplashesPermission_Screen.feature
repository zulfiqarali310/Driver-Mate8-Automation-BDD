Feature: Splashes Screen Movements & Device Permissions Allocation

  @Splashes
  Scenario Outline: Location permission & Splashes Screens movement
    Given Device permission Alerts and Splashes screens comes as Driver Mate8 lunched
    When Click to Allow device Location permission
    And Click to Allow device Phone Calls permission
    And Click to Allow device Storage permission
    And Verify DM8 logo
    And Verify DM8 onboarding image
    And Verify welcome "<welcome>" text
    And Verify details "<details>" text
    And Verify sign "<sgn>" text
    And Tab on Get Started button
    And Verify skip "<skip>" text
    And Verify acceptdetails "<acceptdetails>" text
    And Verify Alreadyhaveaccount "<alrdaccount>" text
    And Tab on Next button
    And Verify skip2 "<skip>" text
    And Verify realtimetracking "<realtracking>" text
    And Verify Alreadyhaveaccount2 "<alrdaccount2>" text
    And Tab on Next button second time
    And Verify skip3 "<skip>" text
    And Verify growearningtxt "<growtxt>" text
    And Verify Alongsidetxt "<alrdaccount3>" text
    And Tab on Next button Thrid time
    And Verify Getstarted "<started>" text
    And Verify Instructiontxt "<istruction>" text
    Then User should grant Device permission & User should move to the Register screen after Splashes screen movement Driver Mate8

    Examples: 
      | welcome    | details                                                                   | sgn     | skip | acceptdetails                   | alrdaccount                                                              | realtracking       | alrdaccount2                                                           | growtxt                               | alrdaccount3                                                                | started     | istruction                                                            |
      | Welcome to | This app will quickly onboard you & allow you to work as a driver for us. | Sign in | Skip | Working as a driver for Company | As a driver for Company you will be able to accept and manage your work. | Real time tracking | With DriversM8 you will be able to track your work and your earnings. | Grow your earnings and work as a team | Alongside colleagues earn more money while making a contribution to society | Get Started | Please enter the code you received on your mobile number to register. |
