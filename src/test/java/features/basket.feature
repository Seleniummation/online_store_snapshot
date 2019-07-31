Feature: Basket


  Background:
    Given I am on ebuyer home page

  Scenario Outline: Proceed to checkouts
    And I enter "<product>" description into search text box
    And I click search button
    And I click add to basket button
    And I click checkout button
    And I click continue to checkout button
    Then Sign in or register text is displayed
    Examples:
      | product                                              |
      | Canon Pixma Pro100S A3+ Colour Inkjet Printer        |
