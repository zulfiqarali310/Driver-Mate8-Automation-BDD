Feature: Write Driver Code & Login to Driver Mate8

  Scenario: Write Driver code to move to Login Screen
    Given User is on Get Started Screen
    When Click to Enter Driver Code as "<DriverCode>"
    And Click On Register button
    Then User Move to login screen
    
    Examples:
    | DriverCode |
    |  6a4a753d  |
    
    
   
  
   Scenario: Login with Valid Username and Password to DM8
    Given User is on Login Screen
    When Click to Enter Username as "<Username>"
    And Click to Enter Password as "<Password>"
    And Click On Login button
    Then User Login into the Driver Mate8 Application
    
    
     Examples:
    | Username | Password  |
    |  zulfiqartest79 | 1234 |

  