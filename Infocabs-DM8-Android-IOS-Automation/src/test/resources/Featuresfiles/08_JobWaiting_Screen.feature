Feature: Waiting Screen verification

  @OnboardingVerification
  Scenario Outline: Meter UI and button clicks verifications on Waiting screen
    Given Meter Alerts comes as Driver move to the Waiting screen
    When Verify Cost value and text
    And check distance "<distance>" text
    And check to verify miles covered values and text
    And Check Progress loader icon
    And check waiting lable "<waiting>" text
    And Check waiting time value
    And click on Meter expand button to see meter details
    And check tariff "<tariff>" text
    And check tariff value "<tariffvalue>" text
    And Check meter waiting "<waitlabel>" text
    And check meter waiting value
    And Check meter extra "<extra>" text
    And check meter extra value
    And Check meter discount percentage "<discountper>" text
    And check meter discount percentage value
    And Check stop waiting "<stopwaiting>" text
    And click on Stop waiting button
    And Check Start waiting "<startwaiting>" text
    And click on Start waiting button again
    And Verify customer image on Waiting screen
    And verify customer name on Waiting screen
    And Verify Send SMS Ring back button icon
    And getting late icon on Waiting screen
    And message chat icon on Waiting screen
    And click again on Meter expand button to close meter details on waiting screen
    Then Meter UI texts and buttons clicks are verified

    Examples: 
      | distance | waiting | tariff | tariffvalue | waitlabel | extra | discountper         | stopwaiting  | startwaiting  |
      | Distance | Waiting | Tariff | T1          | Waiting   | Extra | Discount Percentage | Start Waiting | Stop Waiting |

  @Onboarding
  Scenario Outline: Waiting Screens UI and buttons clicks verifications
    When Driver is on Waiting Screen and lets verify Waiting screens UI and texts fields
    And move scroll up so that pick and drop address and screen UI are visible on waiting screen
    And verify waiting screen re route icon
    And verify waiting screen current location icon
    And verify waiting screen start navigation icon
    And verify waiting screen pickup whole box
    And verify waiting screen dropoff whole box
    And Check waiting screen pickup zone text
    And Check waiting screen pickup address text
    And check waiting screen dropoff zone text
    And check waiting screen dropoff Address text
    And check waiting screen jobtype text
    And check waiting screen payment text
    And check waiting screen Booking text
    And check waiting screen tariff text
    And check waiting screen driver notes text
    And check pob button "<pob>" text
    And move scroll down so that pick and drop address and screen UI are not visible on waiting screen
    Then Waiting Job screen UI elements are verified

    Examples: 
      | pob   |
      | P.O.B |

  @Onboarding
  Scenario Outline: To Move job to the POB status as driver tab on pob button when driver is on board
    When Driver Click on pob button
    Then Job Status become POB
