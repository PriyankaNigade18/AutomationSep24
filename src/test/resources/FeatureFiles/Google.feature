Feature: Test Google application

  Background: 
    Given Open Google application

  Scenario: Test the title of Google
    # Given Open Google application
    When user get the actual title
    Then title should matched with Google

  Scenario: Test google search with valid keyword
    # Given Open Google application
    When user enters valid keyword "Java" in search box
    Then User should valid search result
