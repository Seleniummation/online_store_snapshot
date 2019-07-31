Feature: Search Functionality




  Background:
    Given I am on ebuyer home page

  Scenario Outline: Search for an item
    And I enter "<product>" keyword into search text box
    When I click search button
    And I click list icon to change layout of items
    Then List of product are displayed
    Examples:
      | product |
      | router  |

  Scenario Outline: Add an item to shopping basket
    And I enter "<product>" code into search text box
    And I click search button
    When I click add to basket button
    Then Quantity, description and price of items in shopping basket are displayed
    Examples:
      | product    |
      | 81F501FVUK |