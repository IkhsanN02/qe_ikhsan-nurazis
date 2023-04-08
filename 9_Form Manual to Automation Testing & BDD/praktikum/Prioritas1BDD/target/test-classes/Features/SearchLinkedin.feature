Feature: Search People Linkedin
  Scenario: I want to using feature search on linkedin
    Given I open browser
    And Open website Linkedin
    When I click people
    And I input first name "Gilang"
    And I input last name "Aries Prasetyo"
    Then Showing result related with the input