@US23

Feature: US23 Admin, Vice Dean hesabı olusturabilmelidir.

  Scenario: TC01_Admin_Vice_Dean_olusturabilmelidir
    Given kullanici anasayfaya giderr
    When kullanici login butonuna tiklar
    And kullanici admin olarak giris yapar
    And kullanici 2 saniye bekler
    And kullanici sayfadaki Menu butonuna tiklar
    And kullanici Menu alanından Vice Dean Management Basligina tıklar
    And kullanici 2 saniye bekler
    And kullanici "name","surname","birthPlace" bilgilerini girer
    And kullanici "genderType" seçer
    And kullanici "birthday","phoneNumber","ssnValue","username" bilgilerini girer
    And kullanici 2 saniye bekler
    And kullanici "submit" tiklar
    And kullanici 2 saniye bekler
    And kullanici Vice Dean saved" mesajının görüldüğünü doğrular
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir

  Scenario: TC02_Admin_Vice_Dean_olusturabilmelidir_Negatif
    Given kullanici anasayfaya giderr
    When kullanici login butonuna tiklar
    And kullanici admin olarak giris yapar
    And kullanici 2 saniye bekler
    And kullanici "name","surname","birthPlace","genderType","birthday","phoneNumber","ssnValue","username" bilgilerini bos birakir
    And kullanici 2 saniye bekler
    And kullanici "password" alanina sekiz karakterden az password girer ve submit tiklar
    And kullanici Vice Dean hesabı oluşturulamadığını doğrular
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir


  Scenario: TC03_Admin_Vice_Dean_olusturabilmelidir_Negatif
    Given kullanici anasayfaya giderr
    When kullanici login butonuna tiklar
    And kullanici admin olarak giris yapar
    And kullanici 2 saniye bekler
    And kullanici "name","surname","birthPlace","birthday","phoneNumber","ssnValue","username" bilgilerini gir
    And kullanici "genderType" seçimi yapar
    And kullanici 2 saniye bekler
    And kullanici "password" alanina sekiz karakterli küçük har içermeyen password girer ve submit tiklar
    And kullanici 2 saniye bekler
    And kullanici Vice Dean hesabı oluşturulamadığını doğrularr
    And kullanici sayfayi kapatir

  Scenario: TC04_Admin_Vice_Dean_olusturabilmelidir_Negatif
    Given kullanici anasayfaya giderr
    When kullanici login butonuna tiklar
    And kullanici admin olarak giris yapar
    And kullanici 2 saniye bekler
    And kullanici "name","surname","birthPlace","birthday","phoneNumber","ssnValue","username" bilgilerini gir
    And kullanici "genderType" seçimi yapar
    And kullanici 2 saniye bekler
    And kullanici "password" alanina sekiz karakterli büyük harf içermeyen password girer ve submit tiklar
    And kullanici 2 saniye bekler
    And kullanici Vice Dean hesabı oluşturulamadığını doğrularrr
    And kullanici sayfayi kapatir