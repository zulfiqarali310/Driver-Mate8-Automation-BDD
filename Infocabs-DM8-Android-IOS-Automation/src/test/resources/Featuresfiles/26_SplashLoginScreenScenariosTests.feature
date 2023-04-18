Feature: Splashes Login and Get Started Screen details positive and negative Scenarios

  @SplashesLogintestScenarios
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
      | welcome    | details                                                                   | sgn     | skip | acceptdetails                   | alrdaccount                                                              | realtracking       | alrdaccount2                                                          | growtxt                               | alrdaccount3                                                                | started     | istruction                                                            |
      | Welcome to | This app will quickly onboard you & allow you to work as a driver for us. | Sign in | Skip | Working as a driver for Company | As a driver for Company you will be able to accept and manage your work. | Real time tracking | With DriversM8 you will be able to track your work and your earnings. | Grow your earnings and work as a team | Alongside colleagues earn more money while making a contribution to society | Get Started | Please enter the code you received on your mobile number to register. |

  @SplashesLogintestScenarios
  Scenario Outline: make application with full reset so that app can be killed and open again for on splashes screen veriffication
    Given DM8 applications are already lunched
    When App is killed and open again
    Then application are luched again for more testing

  @SplashesLogintestScenarios
  Scenario Outline: Verify Already have Account Functionality on Started screen
    Given Driver Mate8 lunched for Already Account verification
    And click on Already Account button so that Enter Code screen can be accessed for Already Account verification
    And Verify Getstarted "<started>" text so that splashes screen is skipped for Already Account verification
    Then Already have Account Scenarios are verified

    Examples: 
      | started     |
      | Get Started |

  @SplashesLogintestScenarios
  Scenario Outline: Verify that Skip button click will skip remaining slashes screen and will land user to GetStarted screen
    Given Driver Mate8 already lunched to verify Skip button functionality on Splashes screen
    When try to kill and Open App again for first skip verification
    And click on GetStarted button for first Skip verification
    And click on first screen skip button
    And verify GetStarted "<started>" text  so that reamining two splashes screen is skipped
    And try to kill and Open App again for Second skip verification
    And click on GetStarted button for Second Skip verification
    And Click on Next button to verify Second Skip button
    And click on Second screen skip button
    And verify GetStarted "<started>" text  so that reamining one splashes screen is skipped
    And try to kill and Open App again for third skip verification
    And click on GetStarted button for third Skip verification
    And Click on Next button to verify third Skip button
    And click on second next button for thrid skip screen skip button
    And click on third screen skip button
    And verify GetStarted "<started>" text  so that Skip button are working properly
    Then Skip button in all three screen are properly verified

    Examples: 
      | started     |
      | Get Started |

  @SplashesLogintestScenarios
  Scenario Outline: Check for Empty and Invalid Driver code attempt on Enter code field
    Given Driver should be on get Started screen so that Invalid and empty driver code attempt can be verifyied
    When Click on Register button for Empty code verification
    And alert are coming telling the user that "<entercode>" and get validate the message and click on Ok button so Empty code test can be verified
    And now enter some invalid code like "<invalidcode>" and click on register button
    And Alert comes again with error message that "<wrongcode>" and validate the message and click on button so wrong code are verified
    And Now clear the Driver code area so that DM8 process for valid code
    And Now Enter valid "<validdrivercode>" and click on Register button
    Then DM8 user moves to the Login screen for furter testing

    Examples: 
      | entercode             | invalidcode | wrongcode    | validdrivercode |
      | Please enter the Code |   123456676 | Invalid Code | 98b1ac5e        |

  @SplashesLogintestScenarios
  Scenario Outline: Check to verify the Change Driver code on Login screen
    Given User should be on Login screen "<login>" to verify the Change code functionality
    When User click on More three dot button at right corner of the App
    And click on Change code button
    And check to verify that User should go back to Register code "<started>" screen
    And Enter any new code "<newchangecode>" and click on Register button
    Then Change driver code feature are verified

    Examples: 
      | login  | started     | newchangecode |
      | Log in | Get Started | 98b1ac5e      |

  @SplashesLogintestScenarios
  Scenario Outline: Verify Login Screen all Text and button fields
    Given User is on login Screen to verify login elements
    When check to verify "<login>" text
    And check to verify login details "<loginDetails>" text
    And check to verify rememberme "<rememberme>" text
    And Check to verify App version
    Then Login screen screen text and datafields are available and verified

    Examples: 
      | login  | loginDetails                                                   | rememberme  |
      | Log in | Please enter your credentials to Log into the Driver Dashboard | Remember me |

  @SplashesLogintestScenarios
  Scenario Outline: Check to verify Request Password change feature on Login Screen
    Given User should be on Login screen "<login>" to verify the Request Password change functionality
    When User click on username field to clear the username for Password change
    And and Enter "<usnameforpwdchange>" to change its password
    #And Select entered username from dropdown list
    And User click on More three dot button at right corner of the App for Request Password change
    And click on Request Password change button
    And Change Password Request Alert will comes and verify "<details>" text on request password change
    And click on submit request button on change password request alert
    And check to verify New password changed "<Newpassowrdsend>" text on alert
    And click on Ok button on Change password alert
    And click on Go back button user should be on "<started>" screen
    And clear the driver code field area for valid test scenarios
    Then Change Password feature are verified successfully

    Examples: 
      | usnameforpwdchange         | login  | details                                                     | Newpassowrdsend                                                              | started     |
      | zulfiqar1010@infosun.co.uk | Log in | You will receive your new password on your registered email | Your New Password has been set successfully and sent to the registered email | Get Started |

  @SplashesLogintestScenarios
  Scenario Outline: Information Missing when No Vechile assigned and driver should not be logged in scenarios verification
    Given User should be on Driver Code screen to verify driver Information Missing on login screen
    When Entered Driver code "<drivercode>" for Information Missing verification
    And Entered DriverID "<informationDriverID>" which have not Vechile assigned
    And Enterd Password "<informationpwd>" for Information Missing verification
    And click Login button for Information Missing verification
    And verify and get "<informationmissing>" alert message for Information Missing verification
    And click on OK button for Information Missing verification
    And go back to Driver code screen to verify more scenarios after Information Missing verification
    And clear driver code field after Information Missing verification
    Then Driver Information Missing are properly verified when no vechile are assigned to the driver

    Examples: 
      | drivercode | informationDriverID | informationpwd | informationmissing                |
      | 6a4a753d   |               10108 |           9001 | Login failed, Information Missing |

  @SplashesLogintestScenarios
  Scenario Outline: UserName and Password field Empty and Invalid validations and verification
    Given User should be move to login screen with valid code so that proper validation and verification can be performed
    When User Enter valid "<validdrivercode>" code and Tab Register button then user move to the Login Screen
    And then clear user Name field an click on Login button for Empty UserName validation
    And verify required Username "<unamerequired>" alert error message and click Ok button
    And then next time Enter valid Username "<Username>" and click on Login button
    And verify password required alert error "<pwdrequired>" message and click on OK button
    And then enter wrong "<wrongpwd>" password and click on OK button
    And verify invalid password or username error "<InvalidUnamePwd>" message and click on OK Button
    And then clear the wrong password feild for valid password
    And Enter valid "<Password>" password for further level of testing
    Then UserName and Password field Invalid and validation are verified with proper error message

    Examples: 
      | validdrivercode | unamerequired          | Username       | pwdrequired           | wrongpwd | InvalidUnamePwd              | Password |
      | 6a4a753d        | Please select Username | zulfiqartest79 | Please enter Password |     1121 | Invalid UserName or Password |    13327 |

  @SplashesLogintestScenarios
  Scenario Outline: Verify Remember me feature verification on login screen
    Given User must be on login screen and username and password must be entered
    When check that Username "<Username>" are entered before login
    And check that password "<Password>" are entered before login
    And Tick on remember me tick box
    And click on Login button for remember me verification
    And click on disclaimer Accept button for remember me verification
    And then verify that user should be on Homescreen by verifing side menue icon for remember me verification
    And then click on Side menu icon button for remember me verification
    And click on Logout button and logout from DM8 for remember me verification
    And verify that Username "<Username>" is present and entered after logout
    And verify that Password "<Password>" is present and entered after logout
    And again click on Login button to verify that same entered Username and Password are working fine
    Then Remember me Feature are properly working and verified

    Examples: 
      | Username       | Password |
      | zulfiqartest79 |    13327 |
