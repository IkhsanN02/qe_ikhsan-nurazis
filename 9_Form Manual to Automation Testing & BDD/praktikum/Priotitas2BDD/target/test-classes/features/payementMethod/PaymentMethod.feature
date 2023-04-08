Feature: Payment method
  As a user
  I want to buy the product
  So that I can access payment method

  Scenario: Select a payment method with correctly mobile phone number
    Given I am on the menu all product
    When I choose "Pulsa" product
    And I enter mobile phone number correctly
    Then I can select a payment method

  Scenario: select a payment method incorrectly mobile phone number
    Given I am on the menu all product
    When I choose "Pulsa" product
    And I enter mobile phone number incorrectly
    Then I got an error message