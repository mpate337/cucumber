Feature: Roicians enquireNow feature

#table with mapping
Scenario: Roicians enquireNow test scenario

Given user is already on the enquireNow map
Then user enters enquire now details with map
| first name | last name  | address   | number  | email id       |
| test 		 | test last  | test-add  | 12345   | test@gmail.com |
| test1  	 | test1 last | test1-add | 1234567 | test1@gmail.com|
| test2 	 | test2 last | test2-add | 1234568 | test2@gmail.com| 

Then user enter background information with map
| skills   	  	| years of exp| 
| test skills  	| 1 		  |
| test1 skills  | 2 		  |
| test2 skills  | 3 		  |