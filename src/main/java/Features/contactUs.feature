Feature: Roicians contactUs feature

#without examples keyword
#Scenario: Roicians contactUs test scenario
#
#Given user is already on the contactUs
#When title of contactUs is Contact - Roicians
#Then user enters "test" , "test@gmail.com" , "test-sub" , "123455" and "message" 

#with examples keyword
Scenario Outline: Roicians contactUs test scenario

Given user is already on the contactUs
When title of contactUs is Contact - Roicians
Then user enters "<name>" , "<email>" , "<sub>" , "<number>" and "<message>"

Examples:
	| name | email | sub | number | message |
	| test | test@gmail.com | test-sub | 123456 | test-msg|
	| test1 | test1@gmail.com | test1-sub | 1234567 | test1-msg|
	| test2 | test2@gmail.com | test2-sub | 1234568 | test2-msg|