@login
Feature: User Login

  Background:
    Given the app is launched

  @smoke
  Scenario: Successful login with valid credentials
    When the user enters username "standard_user"
    And the user enters password "secret_sauce"
    And the user taps the login button
    Then the welcome screen should be displayed