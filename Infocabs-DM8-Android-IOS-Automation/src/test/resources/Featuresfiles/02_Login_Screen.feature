Feature: Write Driver Code & Login to Driver Mate8

  @Login
  Scenario Outline: Write Driver code to move to Login Screen
    Given User is on Get Started Screen
    When Click to Enter Driver Code as "<DriverCode>"
    And Click On Register button
    Then User Move to login screen

    Examples: 
      | DriverCode |
      | 6a4a753d   |

  #@Login
  #Scenario Outline: Verify Login Screen all Text and button fields
    #Given User is on login Screen to verify login elements
    #When check to verify "<login>" text
    #And check to verify login details "<loginDetails>" text
    #And check to verify rememberme "<rememberme>" text
    #And Check to verify App version
    #Then Login screen screen text and datafields are available and verified

    #Examples: 
      #| login  | loginDetails                                                   | rememberme  |
      #| Log in | Please enter your credentials to Log into the Driver Dashboard | Remember me |

  @Login
  Scenario Outline: Login with Valid Username and Password to DM8
    Given User is on Login Screen
    When Click to Enter Username as "<Username>"
    And Click to Enter Password as "<Password>"
    And Click On Login button
    Then User Login into the Driver Mate8 Application

    Examples: 
      | Username       | Password |
      | zulfiqartest79 |     13327 |
