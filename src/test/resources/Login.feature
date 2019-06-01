@Login
Feature: Login Test
  Scenario Outline: As a user I want to see if an error message will appear when I login with the incorrect details
    Given I go to the Home Page
    And I click the login link
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the login button
    Then I want to see an error "<errormessage>" error message details

    Examples:
      | email                | password       | errormessage   |
      | jotesanya97@gmail.com |               | Invalid request|
      |                       | Bababinraders1| Invalid request|
      | jotesanya97@gmail.com | yeezus        | Invalid login  |
      | xxxxxxxxxx@gmail.com  | Bababinraders1| Invalid login  |
      |                       |               | Invalid request|


  @Login


  Scenario Outline: As a user I want to check if I can login successfully
    Given I go to the Home Page
    And I click the login link
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the login button
    Then I verify that "<user>" is logged in
    And I sign out

    Examples:
      | email                  | password         | user           |
      | jotesanya97@gmail.com  | Bababinraders1   | James Otesanya |

    #@Login
    #Feature: Login Test

  #Scenario Outline: As a user I want to check if I can login successfully
    #Given I go to the Home Page
    #And I click the login link
    #And I enter my email "<email>" address
    #And I enter my password "<password>"
    #When I click the login button
   # Then I verify that "<user>" is logged in
   # And I sign out

   # Examples:
    #  | email                  | password         | user           |
     # | jotesanya97@gmail.com  | Bababinraders1   | James Otesanya |


