Feature: Vice Dean Ogrenci Olusturabilmeli

  Scenario: TC01 Ogrenci Olusturmak icin hazirliklar yapilir
    Given Student eklemek icin post request hazirligi yapilir
    And  ogrenci bilgileri girilir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir


