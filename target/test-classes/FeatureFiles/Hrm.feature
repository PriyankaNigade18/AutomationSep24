Feature: Test OrangeHrm application

  Scenario Outline: Test data driven for hrm login feature
    Given User open Hrm application
    When User enter "<username>" and "<password>"
    And user click on Hrm login button
    Then User should navigate to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Smita    | test123  |
      | Admin    | admin123 |
      | Rahul    | test123  |
