Feature: Test OpenCart application

  Scenario: Test Register feature with valid data
    Given user open the register page of opencart
    When user enters appropriate data
      | fname | lname  | email             | telephone | password | cpassword |
      | Sonal | sharma | sonal24@gmail.com |  98877665 | test123  | test123   |
    When user select yes newsletter
    And check the privacy policy checkbox
    And click on Continue button
    Then user should be register into application

  Scenario: Test Login feature with valid credentials
    Given user open the login page
    When user enters valid credentials
      | sonal24@gmail.com | test123 |
    When user click on login button of cart
    Then user should able to login
