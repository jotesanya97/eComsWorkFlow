@Login
Feature: Login Test

Scenario Outline: As a user I want to check if I can login successfully
Given I go to the Home Page
And I click my account
And I enter my email "<email>" address
And I enter my password "<password>"
And I click the sign in now button
When I verify that "<user>" is logged in
Then I sign out

Examples:
| email                  | password         | user           |
| jotesanya97@gmail.com  | Today01          | James          |

  @Login

  Scenario Outline: As a user I want to see if an error message will appear when I login with the incorrect details
    Given I go to the Home Page
    And I click my account
    And I clear the email input field
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the sign in now button
    Then I want to see an error "<errormessage>" error message details

    Examples:
      | email                 | password      | errormessage                              |
      | jotesanya97@gmail.com |               | Sorry, we have been unable to sign you in.|
      |                       | Bababinraders1| Sorry, we have been unable to sign you in.|
      | jotesanya97@gmail.com | yeezus        | Sorry, we have been unable to sign you in.|
      | xxxxxxxxxx@gmail.com  | Bababinraders1| Sorry, we have been unable to sign you in.|
      |                       |               | Sorry, we have been unable to sign you in.|