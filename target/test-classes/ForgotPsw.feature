@ForgotPsw
Feature: ForgotPsw Test

  Scenario: As a user I want to see if I can still login even though I have forgotten my password
    Given I go to the Home Page
    And I click the login link
    And I click on the forgot your password link
    When I enter my email in the enter email field
    Then I click reset password


 #At this point I will check my email to see if I have received a message which will show me how I can reset my password
# I will then write the manual test cases, to check if I can create a new password and login with that password.


