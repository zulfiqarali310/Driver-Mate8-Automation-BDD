Feature: Splashes Sceen Device Permissions

  Scenario: Location permission
    Given Allow location permission Alert comes as Driver Mate8 lunched
    When I click on Allow button
    Then User should grant Device location permission to Driver Mate8

  Scenario: Phone Calls permission
    Given Allow Phone Call permission Alert comes as Driver Mate8 lunched
    When I click on Allow button
    Then User should grant manage Phone Calls permission

  Scenario: Phone Media and files permission
    Given Allow Phone Media and files permission Alert comes as Driver Mate8 lunched
    When I click on Allow button
    Then User should grant manage Phone Media and files permission
