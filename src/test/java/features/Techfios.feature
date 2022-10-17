@BothScenarios
Feature: Background Color Validation

Background: 
Given User is on techfios Login page

@Scenario1
Scenario: set sky blue background
Given Set SkyBlue Background button exists
When I click on the button
Then the background color will change to sky blue

@Scenario2
Scenario: set sky white background
Given Set SkyWhite Background button exists
When I click on the sky white button
Then the background color will change to sky white
