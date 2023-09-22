@E2E @US25
Feature: US25 Admin Ogrenci Olusturabilmelidir

  @US25_UI
Scenario: TC01 Admin, Ogrenci Olusturabilmeli
Given kullanici managementonschools sayfasina gider
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

    @US25_API
  Scenario: TC01 Ogrenci Olusturmak icin hazirliklar yapilir Admin
    Given Student eklemek icin post request hazirligi yapilir Admin
    And  ogrenci bilgileri girilir Admin
    When Student eklemek icin post request gonderilir Admin
    Then Student bilgileri dogrulanir Admin

      @US25_DBK
  Scenario Outline: TC01 Ogrenci Bilgileri DB kontrol edilmeli
    Given database'e bağlanır
    When olusturulan ögrenci "<name>" ile çağırılır
    Then Girdigimiz student bilgilerinin advisorTeacherId "<advisorTeacherId>",birthDay "<birthDay>",birthPlace "<birthPlace>",email "<email>",fatherName "<fatherName>",motherName"<motherName>",gender"<gender>",name"<name>",surname"<surname>",phoneNumber"<phoneNumber>",ssn"<ssn>",username"<username>",password"<password>" içerdiği dogrulanir
    Examples:
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | motherName | gender | name | surname | phoneNumber | ssn | username | password |
      |     18      | 2000-09-02 | bursa | team06123@gmail.com | baba | anne | 1 | team7658 | jake | 764-927-9386 | 826-35-9476 | LenaMena | $2a$10$dE.faI84usES78IbrdSGp.fzABWUuCVqO7wj5AGW5BBQuK8.3n.9W |

