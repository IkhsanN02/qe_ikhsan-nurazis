@SelectProductSepulsa
Feature: Select product
  As a user
  I want to see the product
  So that I can access the product

  @SelectProduct
  Scenario: User select product
    Given I am on the home page
    When I click other
    And I click Pascabayar product
    Then I can select the product