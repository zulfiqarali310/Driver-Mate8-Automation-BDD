Feature: Splashes Screen Movements & Device Permissions Allocation

  Scenario: Location permission & Splashes Screens movement
    Given Device permission Alerts and Splashes screens comes as Driver Mate8 lunched
    When Click to Allow device Location permission
    And Click to Allow device Phone Calls permission
    And Click to Allow device Storage permission
    And Tab on Get Started button
    And Tab on Next button
    And Tab on Next button second time
    And Tab on Next button Thrid time
    Then User should grant Device permission & User should move to the Register screen after Splashes screen movement Driver Mate8


