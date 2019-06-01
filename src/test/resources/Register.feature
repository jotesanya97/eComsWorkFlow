@Register

Feature: Register New User

  Scenario Outline: As a new user i want to create an account
    Given I go to the Home Page
    And I click the sign up button
    And I enter my new email address
    And I enter my phone number
    And I verify my phone number via text message
   # And I click agree to the terms and conditions
   # And I click the I am not a robot box
    #And I click the sign up button
    #And I type my validation code in the verification field
   # And I click submit
    #And I would go to my mail box
   # And I click the link to validate my account
   # And I enter my company name
    #And I enter a firstname "<firstname>"
    #And I enter a lastname "<lastname>"
    #And I enter a password "<password>"
    #And I confirm the password
    #And I click the sign up button
    #And I enter my email address
    #And I enter my password
    #When I click the login button
    #Then I verify that "<user>" is logged in
    #And I sign out
    Examples:
      | firstname | lastname | password | user       |
      | mike      | dean     | Today01  | mike dean  |
     #| john      | ken      | Today01  | john ken   |
     #| sarah     | anne     | Today01  | sarah anne |


