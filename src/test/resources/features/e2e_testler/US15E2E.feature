@E2E @US15
Feature: US15 Vice Dean Ogrenci Olusturabilmelidir

  @US15_UI
  Scenario: TC01 Vice Dean, Ogrenci Olusturabilmeli
    Given kullanici managementonschools sayfasina gider
    Then login'e tikla
    Then username alanina kullanici adi gir
    Then password alanina sifre gir
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
    But kullanici 2 saniye bekler
    Then submit butonuna tikla
    But kullanici 2 saniye bekler
    And  student saved successfully mesajini gordugunu dogrula
    But kullanici 2 saniye bekler
    And  sayfayi kapat

    @US15_API
  Scenario: TC01 Ogrenci Olusturmak icin hazirliklar yapilir
    Given Student eklemek icin post request hazirligi yapilir
    And  ogrenci bilgileri girilir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir

      @US15_DB
  Scenario Outline: TC01 Ogrenci Bilgileri DB kontrol edilmeli
    Given database'e bağlanır
    When olusturulan ögrenci "<name>" ile çağırılır
    Then Girdigimiz student bilgilerinin advisorTeacherId "<advisorTeacherId>",birthDay "<birthDay>",birthPlace "<birthPlace>",email "<email>",fatherName "<fatherName>",motherName"<motherName>",gender"<gender>",name"<name>",surname"<surname>",phoneNumber"<phoneNumber>",ssn"<ssn>",username"<username>",password"<password>" içerdiği dogrulanir
    Examples:
      | advisorTeacherId | birthDay   | birthPlace | email               | fatherName | motherName | gender | name     | surname | phoneNumber  | ssn         | username | password                                                     |
      | 18               | 2000-09-02 | bursa      | team06123@gmail.com | baba       | anne       | 1      | team7658 | jake    | 764-927-9386 | 826-35-9476 | LenaMena | $2a$10$dE.faI84usES78IbrdSGp.fzABWUuCVqO7wj5AGW5BBQuK8.3n.9W |



