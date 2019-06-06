@Register

Feature: Register New User

  Scenario Outline: As a new user i want to create an account
    Given I go to the Home Page
    And I click my account
    And I click continue on the new customers side
    And I enter my title
    And I enter a firstname "<firstname>"
    And I enter a lastname "<lastname>"
    And I enter my email address
    And I enter my password
    And I enter my date of birth
    And I enter my contact telephone number
    And I enter my house number or name
    And I enter my postcode
    And I click search
    And I click no
    And I click on the post tick box
    And I click on the telephone tickbox
    And I click on the SMS tickbox
    And I click on the Email tickbox
    And I click register my account
    And I click continue and register
    And I click shop now
    When I verify that "<user>" is logged in
    Then I sign out

    Examples:
      | firstname | lastname | password | user       |
      | mike      | dean     | Today01  | Mike       |
     #| john      | ken      | Today01  | john ken   |
     #| sarah     | anne     | Today01  | sarah anne |


