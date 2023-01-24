Feature: Verify facebook login page

  Scenario: Login
    Given User should be in the facebook login page
    When User should enter the username and password
    And user should select the login button
    Then Verify the login is successful
