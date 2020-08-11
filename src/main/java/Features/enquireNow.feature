Feature: Roicians enquireNow feature

#with examples keyword
#Scenario Outline: Roicians enquireNow test scenario

#Given user is already on the enquireNow
#Then user enters enquire now details "<firstname>" , "<lastname>" , "<address>" , "<number>" and "<email>"
#Then user enter background information "<skills>" , "<years_exp>"

#Examples:
#	| firstname | lastname | address | number | email | skills | years_exp |
#	| test | test last | test-add | 123456 | test@gmail.com| testskill | 1 |
#	| test1 | test1 last | test1-add | 1234567 | test1@gmail.com| test1skill | 2 |
#	| test2 | test2 last | test2-add | 1234568 | test2@gmail.com| test2skill | 3 |
	
#with table
Scenario: Roicians enquireNow test scenario

Given user is already on the enquireNow
Then user enters enquire now details
| test | test last | test-add | 12345 | test@gmail.com |

Then user enter background information
| test skills | 1 |
