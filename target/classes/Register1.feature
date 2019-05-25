@Register
Feature: Register New User

  Scenario Outline: As a new user i want to create an account
    Given I go to the Home Page
    And I click the login link
    And I enter my new email address
    And I click on the create account button
    And I click on the male radio button
    And I enter a firstname "<firstname>"
    And I enter a lastname "<lastname>"
    #And I verify that email address is prepopulated
    And I enter a password "<password>"
    And I enter date of birth
    And I enter address
    And I enter city
    And I enter state
    And I enter postal code
    And I enter country
    And I enter mobile number
    When I click on register button
    Then I verify that "<user>" is logged in
    #And I sign out
    Examples:
     | firstname | lastname | password | user       |
     | mike      | dean     | Today01  | mike dean  |
     | john      | ken      | Today01  | john ken   |
     | sarah     | anne     | Today01  | sarah anne |

