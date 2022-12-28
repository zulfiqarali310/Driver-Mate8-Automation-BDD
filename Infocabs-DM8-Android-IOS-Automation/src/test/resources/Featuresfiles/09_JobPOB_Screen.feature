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
    And check meter extra value
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
    Then Meter UI texts and buttons clicks are verified on pob screen

    Examples: 
      | distance | waiting | tariff | tariffvalue | waitlabel | extra | discountper         | stopwaiting  | startwaiting  | stopmeter | startmeter | addextracharges |
      | Distance | Waiting | Tariff | T1          | Waiting   | Extra | Discount Percentage | Stop Waiting | Start Waiting | Stop Meter | Strat Meter | Add extra charges |
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  Scenario Outline: POB job Screen verification
    Given Job are in POB status
    When Driver Click on STC button
    Then Job Status become STC
