Feature: Verify Go back and Change dropoff address and Add Extra charges verification on Job flow

  @OnboardingGobackChangeDropoffAddextra
  Scenario Outline: Create a job from evop to verify Goback and change dropoff address and Add extra charges
    Given Job request are given for Goback and change dropoff address and Add extra charges verification
    When Job request are send to the server for Goback and change dropoff address and Add extra charges verification
    Then new job has been created in order to check and verify Goback and Change dropoff and extra charges

  @OnboardingGoback
  Scenario Outline: Go back button functionality verification on Job status
    Given Job has been received on DM8 and Accept and move to STC status to verify Go back in all job status
    When scroll up the screen so that Go back button are visible
    And check that Driver are in STC status by verifying clear "<clr>" button text
    And Click on Back button on STC status
    And check to verify driver get back to POB status by verifying stc "<stc>" button text
    And click on Go back button POB status
    And check to verify driver get back to Waiting status by verifying pob "<pob>" button text
    And click on Back button on waiting status
    And check to verify driver get back to Accepted status by verifying waiting "<wait>" button text
    Then Go back button are verified in all job status

    Examples: 
      | clr   | stc   | pob   | wait    |
      | Clear | S.T.C | P.O.B | Waiting |

  @OnboardingChangeDropoff
  Scenario Outline: Change dropoff Address functionality verification on Job status
    Given Job Status should be in POB by verifying stc "<stc>" to check for ChangeDropoff address
    When Click on Change dropoff address button
    And check to verify Change Address whole alert
    And check to verify Change Address title "<titile>" text
    And check to verify change address Alert messages dialog
    And check verify cancel "<cnl>" button text on change address dialog
    And check to verify update "<update>" text on change address dialog
    And click on first address to change dropoff zone address
    And click on Update button to update the address on POB status
    And now move job to STC status to check address change again
    And click on change address button on STC status
    And click on address zone on STC status
    And click on Update button on STC status
    Then Change address is properly working and address zone can be changed easily

    Examples: 
      | stc   | titile        | cnl    | update |
      | S.T.C | Dropoff Zones | CANCEL | UPDATE |

  @OnboardingAddExtra
  Scenario Outline: Verify Add Extra Charges on Job status
    Given Job Status should be in POB by verifying stc "<stc>" to check for Adding extra charges
    When Scroll screen so that Add extra button should be clickable
    And click on Add Extra button on POB status
    And check to verify whole Extra Alert on POB status
    And check to verify title "<extratitle>" text on Add Extra alert
    And check whole message area on Add Extra alert
    And check cancle "<cnl>" text on Add extra alert
    And check ok "<ok>" text on Add extra alert
    #And click to Enter "<pound>" pound extra value
    And click on OK button to add Extra charges
    And move job to STC screen to add Extra charges
    And click on Add Extra button STC screen
    #And click to Add "<pound>" more extra pounds on STC screen
    And agin click on OK button to add more Extra on STC screen
    And click to Clear and submit feedback of job with Extra value added
    Then Adding Extra charges can be added easily on both POB and STC Job status

    Examples: 
      | stc   | extratitle                 | cnl    | ok | pound |
      | S.T.C | Please enter extra amount: | CANCEL | OK |    10 |
