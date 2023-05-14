@login
Feature: Login

  As a user
  I want to see my home page
  So that I can Update my profile

  @LoginSuccess
  Scenario: User success login
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    Then I go to homepage

  @LoginFailed
  Scenario: User failed login
    Given I am on the login page
    When I input invalid email and password
    And I click login button
    Then I will get error message