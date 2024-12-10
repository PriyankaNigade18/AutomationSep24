Feature: Test SwagLab application

  Scenario: Test Login with valid credentials
    Given Open SwagLab application
    When I enter username "standard_user" and password "secret_sauce"
    And I clicked on Login button
    Then I should able to login and navigated to Inventory page
