Feature: US01_Aday_ÖĞrenciler_Sisteme_Kayıt_Olabiimelidir.
  @US01
  Scenario: TC01_Aday_ÖĞrenciler_Sisteme_Kayıt_Olabiimelidir.
    Given kullanici ana sayfaya gider
    Then kullanici register butonuna tiklar
    And kullanici name girer
    But kullanici 2 saniye bekler
    And sayfayi kapatir

