Feature: User Registration and Login

  Scenario: Successful user registration and login
    When User opens the registration modal
    And User enters username and password
    And User clicks on register
    Then User should see a registration confirmation alert

    When User opens the login modal
    And User enters username and password for login
    And User clicks on login
    Then User should be logged in successfully
