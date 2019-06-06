@Search
Feature: Search
  Scenario Outline: As a user I want to search for an item

    Given I go to the Home Page
    And I click my account
    And I enter my email "<email>" address
    And I enter my password "<password>"
    And I click the sign in now button
    And I type "Shoes" in the search input box
    When I click on the search button
    Then I click on the item I want






    Examples:
      | email                  | password         | user           |
      | jotesanya97@gmail.com  | Today01          | James Otesanya |