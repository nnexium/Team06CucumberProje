
Feature: US004 Adding Deans As Admin Via Api
  Background: Set POST dean endpoint
    Given I set POST dean service api endpoint
@dean
  Scenario: TC001 POST request to create a dean
    And I set data of dean
    When I send POST request to add a dean
    Then I verify data of dean

  Scenario: TC002 POST request to validate error message when empty field values are sent in body
    And I set body fields with no values except gender
    When I send POST request to add a dean with blank fields
    Then I verify status code is 400
    And I verify error message "Please enter your birth place"
    And I verify error message "Please enter your birthday"
    * I verify error message "Password should be  between 8 and 60 characters long."
    * I verify error message "Please enter your phone number"
    * I verify error message "Please enter your surname"
    * I verify error message "Please enter your name"
    * I verify error message "Please enter your  username"
    * I verify error message "must not be null"



