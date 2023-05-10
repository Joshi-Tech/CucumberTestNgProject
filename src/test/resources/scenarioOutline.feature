Feature: with multiple users

  @smoke
  Scenario Outline: test with multiple data set
  #Background: Steps commonly used in signup and check availability
    Given user launches website "https://www.nopcommerce.com/en"
    Then clicks on signup button
    And click register
    Then register page opens
    Then get tile of registration form
    Then get personal details title
    Then type first name "<firstName>"
    Then type last name "<lastName>"
    Then type email "<email>"
    Then confirm email "<confirmEmail>"
    And type user name "<userName>"
    Then check availability
    And verify user name available
    Examples:
      | firstName | lastName | email                  | confirmEmail           | userName      |
      | Shyam     | Manohar  | shyam.manohar@test.com | shyam.manohar@test.com | shyam.manohan |
      | Govind    | Hari     | govind.hari@test.com   | govind.hari@test.com   | govind.hari   |
      | Murli     | Manohar  | murli.manohar@test.com | murli.manohar@test.com | murli.manohar |

