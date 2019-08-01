 Feature: Customer Account
  As a user, i want to be able to sign in so that transactions are processed to checkout

  Background:
    Given I am on ebuyer home page

  Scenario: SignIn link Functionality
    When I click sign in link
    Then Sign in or register text is displayed

  Scenario: Open forgotten your password form
    And I click sign in link
    When I click forgotten your password link
    Then Forgot your password text is displayed

  Scenario Outline: Existing customers can sign in
    And I click sign in link
    And I enter "<myemail>" and "<password>" credentials
    And I click the sign in button
    Then My username is displayed
    Examples:
      | myemail            | password |
      | taniwono@gmail.com | Ladies03 |


   Scenario: SignIn link Functionality Refactor
     When I click sign in link
     Then "Sign in or register text" is displayed

   Scenario: Open forgotten your password form Refactor
     And I click sign in link
     When I click forgotten your password link
     Then "Forgot your password text" is displayed

   Scenario Outline: Existing customers can sign in Refactor
     And I click sign in link
     And I enter "<myemail>" and "<password>" credentials
     And I click the sign in button
     Then "My username" is displayed
     Examples:
       | myemail            | password |
       | taniwono@gmail.com | Ladies03 |

















  #Scenario Outline: Open registration form
   # Given I am on ebuyer home page
    #And I click sign in link
    #And I enter "<email>" credentials
    #And I enable no sign me up radio button
    #And I click the sign up button
    #Then Join ebuyer today text is displayed
    #Examples:
      #| email          |
      #| test@gmail.com |

  #Scenario Outline: New users can complete registration form
    #Given I am on ebuyer home page
    #And I click sign in link
    #Examples:
     # |  |

  #Scenario: Reset forgotten password
    #Given I am on ebuyer home page
    #And I click sign in link
    #And I click forgotten your password link
    #Then






