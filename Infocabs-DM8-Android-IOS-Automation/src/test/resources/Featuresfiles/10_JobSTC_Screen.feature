Feature: STC Screen UI verification and Complete Testing

  @Onboarding
  Scenario Outline: Meter UI and button clicks verifications on STC Screen
    Given Meter Alerts comes as Driver move to the STC screen
    When Verify Cost value and text on STC screen
    And check distance "<distance>" text on STC screen
    And check to verify miles covered values and text on STC screen
    And Check Progress loader icon on STC screen
    And check stc lable "<waiting>" text
    And Check stc time value
    And click on Meter expand button on stc to see meter details
    And check tariff "<tariff>" text on STC screen
    And check stc screen tariff value "<tariffvalue>" text
    And Check meter stc "<waitlabel>" text
    And check meter stc value
    And Check meter extra "<extra>" text on stc screen
    And check meter extra value on stc
    And Check meter discount percentage "<discountper>" text on stc screen
    And check meter discount percentage value on stc screen
    And Check stop waiting "<stopwaiting>" text on stc screen
    And click on Stop waiting button on stc screen
    And Check Start waiting "<startwaiting>" text on stc screen
    And click on Start waiting button again on stc screen
    And Check to verify stop meter "<stopmeter>" text on stc screen
    And click on Stop meter button on stc screen
    And check to verify Start meter "<startmeter>" text on stc screen
    And click on Start meter button on stc screen
    And check to verify Add extra charges "<addextracharges>" on stc screen
    And Verify customer image on stc screen
    And verify customer name on stc screen
    And message chat icon on stc screen
    And click again on Meter expand button to close meter details on stc screen
    Then Meter UI texts and buttons clicks are verified on stc screen

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
