@US01
Feature: US001 Aday öğrenciler sisteme kayıt olabilmelidir.(Register)
  @US01TC01
  Scenario Outline:Register
    Given Kullanici "https://managementonschools.com" sayfasina gider.
    Given Kullanici Register Butonuna tiklar
    When Girer name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    Then  Register Butonuna tiklar
    And  "Guest User registired." yazisinin göründüğünü doğrula.
    #Then close browser

    Examples:
      | username         | birth_day  | birth_place | gender | name | phone_number | ssn         | surname | password |
      | johndoe151tech61 | 01-08-2023 | New York    | Male   | John | 614 776 8774 | 614-66-7696 | Doe     | John.123 |


