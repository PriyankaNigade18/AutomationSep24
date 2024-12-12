Feature: Test CRm apllication

  Background: 
    Given user open "https://automationplayground.com/crm/" application
    When User click on SignIn link

  Scenario: Test SignIn link
    Then It should navigate to login page

  Scenario: Test Login functionality
    When user enter valid email "test@gmail.com" and password "test123"
    And User click on crm Submit button
    Then user should navigate customers page
