@PaymentMethod
Feature: Payment method
  As a user
  I want to buy the product
  So that I can access payment method

  @ValidPhoneNumberPayment
  Scenario: Select a payment method with correctly mobile phone number
    Given I am on the menu all product
    When I choose pulsa product
    And I enter mobile phone number correctly
    And I choose nominal
    And I choose payment method
    Then I can select a payment method
