
Feature: Add Products to cart
@testAddtoCart
  Scenario: User able to search products and add to cart
   Given user is able to open the URL
    And Verify that home page is visible successfully
   When click on Products button and verify "ALL PRODUCTS" page is visible
    Then Hover over first product and click Add to cart
    And Click Continue Shopping button
    Then Hover over second product and click Add to cart
    And Click View Cart button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price
    
    
    
    