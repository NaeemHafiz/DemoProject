Feature: Login Feature

  Background:
    Given the user is on the login page

  Scenario: Successful login
    When the user enters valid credentials
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful login
    When the user enters invalid credentials
    Then an error message should be displayed
