Feature: feature1

Scenario: homepage 

Given user is in "Web Examples - CrossBrowserTesting.com"  page
When user clicks on  Selenium Example Page link
Then system should display "Selenium Test Example Page" page

Scenario: seleniumPage
Given user is in "Web Examples - CrossBrowserTesting.com"  page
When user clicks on  Selenium Example Page link
Then system should display "Selenium Test Example Page" page
When user enter "sheereesh1" on the form elements
Then user click on the submit button  