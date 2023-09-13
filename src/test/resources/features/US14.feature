Feature: US14 Vice Dean öğretmenleri görebilmeli ve güncelleme yapabilmelidir.
  Scenario Outline: TC01 Vice Dean öğretmenleri görebilmeli ve güncelleme yapabilmelidir.
    Given Ana sayfaya git.
    And Login Butonuna Tıkla.
    And Vice Dean User Name Bilgisini Gir.
    And Vice Dean Password Bilgisini Gir.
    And Mavi Login Butonuna Tıkla.
    And Menu butonuna tıkla.
    And Teacher Management  butonuna tıkla
    And Sayfayi asagi kaydir ve Teacher List goruntulendigini dogrula
    And Sayfadaki en son satirin altinda > butonuna tikla
    And Olusturulan Teacherin Name, Phone Number, SSN, User Name bilgileri görüldugunu dogrula
    And Ekrana gelen son Teacher Listteki kendi olusturdugun teacherin karsisindaki Edit butonuna tikla
    And Choose Lessons butonuna tıkla ve öğretmenin gireceği dersi guncelle
    And Öğretmen "<Name>","<Surname>","<BirthPlace>","<email>","<PhoneNumber>"guncelle
    And ogretmen "<Ssn>" guncelle
    And is Advisor Teacher guncelle
    And Gender guncelle
    And Öğretmen Date of Birth guncelle
    And Ogretmen "<UserName>","<Password>" guncelle
    And Submit butonuna tikla
    And Bilgilerin guncellendigini dogrula
    And Sayfayi kapat
    Examples:
      | Name  | Surname     | BirthPlace | email         | PhoneNumber  | Ssn         | UserName   | Password |
      | Tony  | Yavanov    | brezilya   | alex@gmail.com | 123-896-5694 | 125-89-4566 | Yavanov    | Alex4674 |



