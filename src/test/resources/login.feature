Feature: Login Feature
  Scenario: User has credentials and signing in
    Given Given user launches website "https://www.nopcommerce.com/en"
    Then click login option
    Then Get login page title
    Then Get login form title
    Then Enter user name "Lax.Joshi"
    Then Enter password "RamSharma"
    Then click login button
    Then close browser

