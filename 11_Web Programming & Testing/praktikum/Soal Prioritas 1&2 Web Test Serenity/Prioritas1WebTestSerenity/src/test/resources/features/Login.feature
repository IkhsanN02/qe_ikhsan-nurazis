@Login
Feature: login
  As a user
  I want to go to homepage
  So that i can purchase product

  @test1
  Scenario: As a user, i login with accepted username standard_user
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page

  @test2
  Scenario: As a user, i login with not accepted username test_alta
    Given I am on the login page
    When I enter invalid username
    And I enter valid password
    And I click login button
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  @test3
  Scenario: As a user, i login with accepted username problem_user
    Given I am on the login page
    When I enter "problem_user" username
    And I enter valid password
    And I click login button
    Then I am on the home page