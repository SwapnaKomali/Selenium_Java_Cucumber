Feature: User Login and contactus form
@testLogin
  Scenario Outline: User enters incorrect email and password
    Given user is able to open the URL
    And Verify that home page is visible successfully
    And user is click on  sign up button
    When user enters incorrect "<MailId>" and "<Password>"
    Then user should see an error message
    
    Examples:
   |   MailId          |  Password |
   | xyz@gmail.com     |   1212@   |
    
    
 @testContact 
  Scenario Outline: Verify Contact Us Form
    Given user is able to open the URL
    And Verify that home page is visible successfully
    When Click on Contact Us button and verify "GET IN TOUCH" is visible
    Then Enter "<Name>", "<Email>", "<Subject>" and "<Message>"
    And Upload File in Contact Form
    Then Click on Submit Button
    And Verify Success Message
    Then Click on home button and verify home page
    Examples:
    | Name    | Email                    |   Subject         |   Message|
    | doll    | swapnakomali96@gmail.com | AutomationPractice|    NA    |
    
    
    
    