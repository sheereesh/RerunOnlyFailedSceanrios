Feature: feature 2
Background: bg1
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on the link Selenium Example Page
Scenario Outline: Scenario1
Given  user is in "Selenium Test Example Page" home page
When user enters the "<data1>" on the Form Elements
And user enters the "<data2>" on the Text Area
Then user click on the submit button  

Examples:
|data1|data2|
|sheereesh|naveen|
|soudamani|soudamaniii|
|srinivas|pedayogaih|