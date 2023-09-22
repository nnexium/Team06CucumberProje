Feature: Admin Ogrenci Olusturabilmeli

  Scenario: TC01 Ogrenci Olusturmak icin hazirliklar yapilir Admin
    Given Student eklemek icin post request hazirligi yapilir Admin
    And  ogrenci bilgileri girilir Admin
    When Student eklemek icin post request gonderilir Admin
    Then Student bilgileri dogrulanir Admin
