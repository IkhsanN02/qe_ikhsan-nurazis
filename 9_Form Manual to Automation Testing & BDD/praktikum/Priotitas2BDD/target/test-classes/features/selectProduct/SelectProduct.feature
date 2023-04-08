Feature: Select product
    As a user
    I want to see the product
    So that I can access the product

    Scenario: User select product
      Given I am on the home page
      When I click "Others"
      And I go to menu all product
      Then I can select the product