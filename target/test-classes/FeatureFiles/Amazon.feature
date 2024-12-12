@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @Homepage @Regression
  Scenario: Test title of homepage
    When User get the title of homepage
    Then title should matched with homepage title

  @Sellpage @Regression
  Scenario: Test title of Sell page
    When User open Sell page
    And User get the title of Sell page
    Then Title should matched with SellPage Title

  @Bestseller
  Scenario: Test title of BestSeller page
    When User open BestSellers page
    And User get the title of BestSellers page
    Then Title should matched with BestSellers page Title

  @Mobiles
  Scenario: Test title of Mobiles page
    When User open Mobile page
    And User get the title of  Mobile page
    Then Title should matched with  Mobile page Title
