Feature: Check availability feature

  Background: Steps commonly used in signup and check availability
    Given user launches website "https://www.nopcommerce.com/en"
    Then clicks on signup button
    And click register
    Then register page opens
    Then get tile of registration form
    Then get personal details title
    Then type first name "Lax"
    Then type last name "Joshi"
    Then type email "ram.shyam@gmail.com"
    Then confirm email "ram.shyam@gmail.com"
    And type user name "Ram.Shyam"

  @sanity
  Scenario: Check user name availability
    Then check availability
    And verify user name available
    #Then tear down browser


  @regression
  Scenario: Sign up
    Given when user has inserted user name
    Then click country drop down
    Then select country name "India"
    And Click time zone drop down
    Then Select time zone "Central America"
    Then get title of password form
    Then type password "RamSharma"
    And confirm password "RamSharma"
    Then click my company primarily drop down
    Then select one option from my company primarily "Other"
    Then click intention to use nopCommerce
    Then select intention to use nopCommerce "As an example for personal training"
    Then click my main activity in the company drop down
    Then select my role option "Technical developer"
    Then click how many people work for the company
    Then select one of the company size option "6–15"
    And click register button
    Then registration second page opens which has text "Almost done!"
   # Then close browser


