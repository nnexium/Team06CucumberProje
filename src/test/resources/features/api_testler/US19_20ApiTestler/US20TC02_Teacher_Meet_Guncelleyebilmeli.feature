@ApiTest @3
Feature: US20_Teacher_Meet_Güncelleyebilmeli
  Scenario: TC02_Teacher_Meet_Güncelleyebilir
    Given kullaniciUS20_TC02 set the url
    When kullaniciUS20_TC02 sends put request and gets the response
    Then kullaniciUS20_TC02 Status code should be 200 olmalı
    Then kullaniciUS20_TC02 validate response body
