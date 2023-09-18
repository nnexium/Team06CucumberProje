Feature: Teacher, ogrenciye verdigi notlari, gorebilmeli ve guncelleyebilmelidir.
  @Us18
  Scenario: Teacher olarak login olma
    Given kullanici teacher hesabi ile ana sayfaya gider
    Then kullanici teacher hesabi ile login butonuna tiklar
    And kullanici teacher hesabi ile username ve password ile giris yapar
    But kullanici teacher hesabi ile loginn butonuna tiklar


  Scenario: Teacher ders ogrenci devamsizlik not ve info note gorebilmelidir
    Given kullanici student info listte isim dogrular
    Then kullanici student info listte ders adi dogrular
    And kullanici student info listte devamsizlik dogrular
    But kullanici student info listte midterm exam dogrular
    And kullanici student info listte final exam dogrular
    Then kullanici student info listte note dogrular
    And kullanici student info listte info note dogrular
    And kullanici student info listte info avarage dogrular

  Scenario: Teacher ders ogrenci devamsizlik not ve info note guncelleyip silebilmelidir
    Given kullanici student info listte edit butonuna tiklar
    Then kullanici midterm exam alaninda "<midterm notu>" gunceller
    And kullanici final exam alaninda "<final notu>" gunceller
    Then kullanici guncelsubmit butonuna tiklar
    But kullanici teacher hesabi ile "Student info updated successfully" yazisini dogrular
    And kullanici Edit student info sayfasinda "x" butonuna tiklar
    But kullanici ogrenci bilgisi siler
    And kullanici sayfayi kapatir

