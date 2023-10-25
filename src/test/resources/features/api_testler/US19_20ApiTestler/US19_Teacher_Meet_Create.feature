@ApiTest @1
Feature: US19_Teacher_Meet_Ekleyebilmeli
  Scenario: TC01_Teacher_Meet_Ekler
    Given kullaniciUS19_TC01 set the url
    When kullaniciUS19_TC01 send post request
    Then Status code should be 200 olmalı
    Then kullaniciUS19_TC01 validate response body

