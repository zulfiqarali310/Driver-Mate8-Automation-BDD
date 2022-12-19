Feature: Disclaimer Screen verification

  @Onboarding
  Scenario Outline: Disclaimer Screen verification
    Given Disclaimer Screen comes as Driver login to Driver Mate8
    When check to verify disclaimer "<diclaimer>" text
    And check to instruction "<instruction>" text
    And check to driverpolicy "<driverpolicy>" text
    And check to verify driver details policy
    And then Click on Accept button
    Then Driver Move to Driver Mate8 HomeScreen

    Examples: 
      | diclaimer  | instruction                                                                                                                                                                | driverpolicy                  |
      | Disclaimer | By logging in accepting jobs you are abiding by the Company’s Policy and Procedures and are confirming that you and your vehicle have all the required compliance to work. | Driver Disciplinary Procedure |
