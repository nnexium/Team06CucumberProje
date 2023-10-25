@ApiTest @4
Feature: US20_Teacher_Meet_Silebilmelidir
  Scenario: TC03_Teacher_Meet_Silebilir
    Given kullaniciUS20_TC03 set the url
    When kullaniciUS20_TC03 sends delete request and gets the response
    Then kullaniciUS20_TC03 Status code should be 200 olmalı
    Then kullaniciUS20_TC03 validate response body
