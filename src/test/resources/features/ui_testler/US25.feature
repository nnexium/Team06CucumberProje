Feature: US25 Admin Ogrenci Olusturabilmelidir

  Background: Ana sayfaya gider
    Given kullanici managementonschools sayfasina gider


  Scenario: TC01 Admin, Ogrenci Olusturabilmeli
    Then login'e tikla
    Then username alanina admin kullanici adi gir
    Then password alanina admin sifre gir
    Then login butonuna tikla
    Then menu'ye tikla
    Then studentManagement'a tikla
    But kullanici 2 saniye bekler
    Then choose teacher ddm'den ogretmen sec
    And  name, surname, birthPlace, email, bilgilerini gir
    But kullanici 3 saniye bekler
    And  gender bolumunden cinsiyet sec
    And  ogrenciPassword gir
    And phone number gir
    And  dateOfBirth,ssn,userName,fatherName,motherName bilgilerini gir
    Then submit butonuna tikla
    But kullanici 2 saniye bekler
    And  student saved successfully mesajini gordugunu dogrula
    But kullanici 2 saniye bekler
    And  sayfayi kapat


  Scenario: TC02 Doldurulması zorunlu alanlar bos birakildiginda "Required" uyarisi gelmeli
    Then login'e tikla
    Then username alanina admin kullanici adi gir
    Then password alanina admin sifre gir
    Then login butonuna tikla
    Then menu'ye tikla
    Then studentManagement'a tikla
    But kullanici 2 saniye bekler
    Then choose teacher ddm'den ogretmen sec
    And  name,surname, birthPlace, email, phone, dateOfBirth, ssn, userName, fatherName, motherName, password alanini bos birak
    And  gender bolumunden cinsiyet sec
    Then submit butonuna tikla
    But kullanici 2 saniye bekler
    And bos birakilan alanlara required uyarisinin geldigini dogrula
    But kullanici 2 saniye bekler
    And  sayfayi kapat