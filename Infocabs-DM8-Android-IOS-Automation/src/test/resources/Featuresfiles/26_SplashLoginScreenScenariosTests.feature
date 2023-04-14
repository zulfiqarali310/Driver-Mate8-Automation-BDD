Feature: Splashes Login and Get Started Screen details positive and negative Scenarios

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
      | Please enter the Code |   123456676 | Invalid Code | 6a4a753d        |

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
      | usnameforpwdchange | login  | details                                                     | Newpassowrdsend                                                              | started     |
      | zulfiqar1010@infosun.co.uk | Log in | You will receive your new password on your registered email | Your New Password has been set successfully and sent to the registered email | Get Started |
