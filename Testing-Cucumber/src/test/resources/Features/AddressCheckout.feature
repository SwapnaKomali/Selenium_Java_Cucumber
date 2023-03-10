
Feature: Verify address details in checkout page

@TestAddress
Scenario Outline: User is able to Check the address details
    Given user is able to open the URL
    And Verify that home page is visible successfully
    And user is click on  sign up button
    #Then Fill all details in Signup and create account
    Then Enter "<Name>" , "<MailId>","<pwd>","<Fname>" ,"<Lname>","<ads>","<state>" , "<city>","<zipcode>" and "<mobileNUM>"
    And Verify ACCOUNT CREATED! and click Continue button
    Then Verify Logged in as username at top
    When click on Products button and verify "ALL PRODUCTS" page is visible
    Then Hover over first product and click Add to cart
    And Click Continue Shopping button
    Then Hover over second product and click Add to cart
    And Click View Cart button
    Then and Click Proceed To Checkout
    And Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    Then Click Delete Account button 
    And Verify ACCOUNT DELETED!and click Continue button
    
    
    
    Examples:
    
    |Name      | MailId                 | pwd   | Fname    | Lname   |  ads             | state        |  city     | zipcode   | mobileNUM   |
    |Swapna    | swapnakomali129@gmail.com |fsgdfg | swapna   | komali  |  Peddapappuru    |andraparadesh | Anantapur | 515445    | 9346683203  |