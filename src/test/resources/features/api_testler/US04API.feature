@apitesti
  Feature: US04 Admin Dean Ekleyebilmeli
  Scenario: TC01 Dean basarili bir sekilde eklenebilmeli
    Given  Dean eklemek icin Post request hazirligi yapilir
    And  Gonderilecek dean bilgileri hazirlanir
    When Dean eklemek icin Post request gonderilir
    Then Dean bilgileri dogrulanir
