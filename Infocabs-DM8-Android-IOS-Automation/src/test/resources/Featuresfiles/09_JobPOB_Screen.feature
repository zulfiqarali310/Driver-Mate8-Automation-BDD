Feature: POB Screen UI verification and Complete Testing

  @Onboarding
  Scenario Outline: Meter UI and button clicks verifications on POB Screen
    Given Meter Alerts comes as Driver move to the POB screen
    When Verify Cost value and text on POB screen
    And check distance "<distance>" text on POB screen
    And check to verify miles covered values and text on POB screen
    And Check Progress loader icon on POB screen
    And check pob lable "<waiting>" text
    And Check pob time value
    And click on Meter expand button on pob to see meter details
    And check tariff "<tariff>" text on POB screen
    And check pob screen tariff value "<tariffvalue>" text
    And Check meter pob "<waitlabel>" text
    And check meter pob value
    And Check meter extra "<extra>" text on pob screen
    And check meter extra value on pob
    And Check meter discount percentage "<discountper>" text on pob screen
    And check meter discount percentage value on pob screen
    And Check stop waiting "<stopwaiting>" text on pob screen
    And click on Stop waiting button on pob screen
    And Check Start waiting "<startwaiting>" text on pob screen
    And click on Start waiting button again on pob screen
    And Check to verify stop meter "<stopmeter>" text on pob screen
    And click on Stop meter button on pob screen
    And check to verify Start meter "<startmeter>" text on pob screen
    And click on Start meter button on pob screen
    And check to verify Add extra charges "<addextracharges>" on pob screen
    And Verify customer image on pob screen
    And verify customer name on pob screen
    And message chat icon on pob screen
    And click again on Meter expand button to close meter details on pob screen
    Then Meter UI texts and buttons clicks are verified on pob screen

    Examples: 
      | distance | waiting | tariff | tariffvalue | waitlabel | extra | discountper         | stopwaiting  | startwaiting  | stopmeter  | startmeter  | addextracharges   |
      | Distance | Waiting | Tariff | T1          | Waiting   | Extra | Discount Percentage | Stop Waiting | Stop Waiting | Stop Meter | Start Meter | Add extra charges |

  @Onboarding
  Scenario Outline: POB Screens UI and buttons clicks verifications
    When Driver is on POB Screen and lets verify Waiting screens UI and texts fields
    And move scroll up so that pick and drop address and screen UI are visible on pob screen
    And verify pob screen current location icon
    And verify pob screen start navigation icon
    And verify pob screen pickup whole box
    And verify pob screen dropoff whole box
    And Check pob screen pickup zone text
    And Check pob screen pickup address text
    And check pob screen dropoff zone text
    And check pob screen dropoff Address text
    And check change dropoff address "<dropoffaddress>" text on pob screen
    And check pob screen jobtype text
    And check pob screen payment text
    And check pob screen Booking text
    And check pob screen tariff text
    And check pob screen driver notes text
    And check stc button "<stc>" text
    And move scroll down so that pick and drop address and screen UI are not visible on pob screen
    Then POB Job screen UI elements are verified

    Examples: 
      | stc   | dropoffaddress |
      | S.T.C | Change         |

  @Onboarding
  Scenario Outline: To Move job to the STC status as driver tab on stc button when driver is on board
    When Driver Click on stc button
    Then Job Status become STC
