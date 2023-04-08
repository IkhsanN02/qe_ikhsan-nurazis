Feature: Login
    As a user
    I want to login
    So that I can access my homepage

    Scenario: User success login
      Given I am on the login page
      When I input valid email and password
      And click login button
      Then I go to homepage

    Scenario: User failed login
      Given I am on the login page
      When I input invalid email and password
      And click login button
      Then I will get error message