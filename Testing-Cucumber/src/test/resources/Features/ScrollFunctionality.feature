Feature: Verify ScrollUp without 'Arrow' button and ScrollDown 

@TestScroling
Scenario: User is able to perform scroling functionality
    Given user is able to open the URL
    And Verify that home page is visible successfully
    When Scrolldown page to bottom and Verify SUBSCRIPTION is visible
    Then Scrollup page to top
    And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
    