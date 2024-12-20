Feature: Login Practice page

  Background: 
    Given I open practice login page

  Scenario: To validate login with valid data
    When I enter valid user name
    When I enter valid password
    And I Click on Submit button
    Then Home page should display

  Scenario: To validate login with invalid data
    When I enter invalid user name
    When I Enter invalid password
    And Click on submit button
    Then Error message should display
