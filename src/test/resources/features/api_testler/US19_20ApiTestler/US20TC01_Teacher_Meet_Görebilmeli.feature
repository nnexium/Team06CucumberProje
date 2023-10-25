@ApiTest @2
Feature: US20_Teacher_Meet_Gorebilmeli
  Scenario: TC01_Teacher_Meet_Gorur
    Given kullaniciUS20_TC01 set the url
    When kullaniciUS20_TC01 sends post request and gets the response
    Then kullaniciUS20_TC01 Status code should be 200 olmalı
    Then kullaniciUS20_TC01 validate response body
