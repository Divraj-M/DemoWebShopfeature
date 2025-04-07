#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Pass the Email id for NewsLetter to get regular updates

	@Newslettervalid
	Scenario Outline: To pass the valid email to the newsletter 
	Given I am on the DemoWebShop website
	When user enter the valid email id to the newsletter
	Then user should see the Thank you message
	
	Examples:
	|abc@gmail.com|
	|rjk@gmail.com|
	|ab@gmail.com |
	|neo@gmail.com|
	
	@NewsletterInvalid
	Scenario Outline: To pass the invalid email to the newsletter
	Given I am on the DemoWebShop website
	When user enter the invalid email id to the newsletter
	Then user should see the message as enter valid email
	
	Examples:
	|hj  |
	|jnkj|
	|emai|
	|.com|
	
	