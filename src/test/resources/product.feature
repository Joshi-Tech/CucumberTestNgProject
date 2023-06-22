Feature: product Feature
  Scenario: User has credentials and signing in
    Given Given user launches website "https://www.nopcommerce.com/en"
    Then hover on  product
    And click Features
    Then get title of the page
    Then quit

