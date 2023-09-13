@US05

Feature: US05 Admin Deanlari Gorebilmeli Silebilmeli ve Guncelleyebilmeli

  Scenario:
    Given kullanici anasayfaya giderr
    When kullanici login butonuna tiklar
    And kullanici admin olarak giris yapar
    And kullanici 2 saniye bekler
    And kullanici sayfadaki Menu butonuna tiklar
    And kullanici 2 saniye bekler
    And kullanici Main Menu alanından Dean Management Basligina tıklar
    And kullanici 2 saniye bekler
    And kullanici Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görünür oldugunu dogrular
    And kullanici sayfayi kapatir








