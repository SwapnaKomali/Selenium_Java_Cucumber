Feature: Product Search
@testSearchProduct
  Scenario Outline: User able to search products
    Given user is able to open the URL
    And Verify that home page is visible successfully
    When click on Products button and verify "ALL PRODUCTS" page is visible
    Then Enter product name in search input and click search button
    And verify "SEARCHED PRODUCTS" is visible 
    And  Verify all the products related to "<search>" are visible
     Examples:
     |search|
     |Blue Top|