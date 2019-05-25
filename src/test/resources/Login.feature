@Login
Feature: Login Test

  Scenario Outline: As a user I want to check if I can login successfully
    Given I go to the Home Page
    And I click the login link
    And I enter my email "<email>" address
    And I enter my password "<password>"
    When I click the login button
    Then I verify that "<user>" is logged in
    And I sign out

    Examples: 
      | email                  | password  | user           |
      | davin.riches@gmail.com | Today01   | Davin Riches   |
      | mike261@gmail.com      | Today01   | mike dean      |
      | mike424@gmail.com      | Today01   | sarah anne     |

    @Login
    Scenario Outline: As a user I want to see an error message when I login incorrectly
      Given I go to the Home Page
      And I click the login link
      And I enter my email "<email>" address
      And I enter my password "<password>"
      When I click the login button
      Then I see an error "<errormessage>" message details

      Examples:
      | email               | password | errormessage              |
      | maxtest964@gmail.com|          | Password is required.     |
      |                     | Today1   | An email address required.|
      | maxtest964@gmail.com| xxxxxx   | Authentication failed.    |
      | xxxxxxxxx@gmail.com | Today1   | Authentication failed.    |
      |                     |          | An email address required.|

