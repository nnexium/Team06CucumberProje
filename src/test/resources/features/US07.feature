
Feature: US07_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir
  Scenario:TC01_Dean_Kullanıcıların_Gönderdiği_Mesajları_Görebilmelidir
    Given Kullanici anasayfaya gider
    Then Login kutusuna tiklar
    And UserName kutusuna "deanUserName" yazar
    And Password kutusuna "deanSifre" yazar
    And Login butonuna tiklar
    And Kullanici anasayfada "HiDeanTeam06" yazisini görür
    And Kullanici Menu butonunu tiklar
    And Kullanici Contact Get All butonunu tiklar
    And Kullanici gönderilen mesajları görür
    And Kullanici Silme butonu göremez ve silme işlemini yapamaz
    And Kullanici sayfayi kapatir
