@ignore


Feature: Search for Items

  Background:
    Given I go to the Home Page

    @Search
    Scenario: As a user I want to search for an item
    When I search for "shirt" in the search input box
    Then I see "1 result has been found" product listing page
    And I see search description "Faded short sleeved T-shirts" price "$16.51" and item "in stock"

