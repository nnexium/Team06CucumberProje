
Feature: US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir
  Scenario:TC01_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir
    Given Kullanici anasayfaya gider
    And  Kullanici 1 saniye bekler
    Then Login kutusuna tiklar
    And  Kullanici 1 saniye bekler
    And UserName kutusuna "deanUserName" yazar
    And  Kullanici 1 saniye bekler
    And Password kutusuna "deanSifre" yazar
    And  Kullanici 1 saniye bekler
    And Login butonuna tiklar
    And  Kullanici 1 saniye bekler
    And Kullanici anasayfada "HiDeanTeam06" yazisini görür
    And  Kullanici 1 saniye bekler
    And Kullanici Menu butonunu tiklar
    And  Kullanici 1 saniye bekler
    And Kullanici Contact Get All butonunu tiklar
    And  Kullanici 1 saniye bekler
    And Kullanici gönderilen mesajları görür
    And  Kullanici 1 saniye bekler
    And Kullanici Silme butonu göremez ve silme işlemini yapamaz
    And Kullanici sayfayi kapatir
