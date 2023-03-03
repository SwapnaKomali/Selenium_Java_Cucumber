
Feature: user is able to View category products
@testViewcategory
  Scenario:User is able to view the types of products
    Given user is able to open the URL
    And Verify that home page is visible successfully
    Then Verify that "CATEGORY" are visible on left side bar
    And Click on Women category
    When Click on any category link under Women category
    And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    When click on any sub-category link of Men category
    And Verify that user is navigated to that category page
    