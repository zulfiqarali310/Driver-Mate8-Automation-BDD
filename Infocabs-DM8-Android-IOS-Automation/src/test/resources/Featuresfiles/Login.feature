Feature: Login Secnarios

  Scenario Outline: Login with valid user name and password
    Given DM8 Application has already lunched
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then User should be landed on dashboard screen

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
