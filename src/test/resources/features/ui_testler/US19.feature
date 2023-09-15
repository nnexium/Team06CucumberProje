Feature: US19_Teacher_Ogrenciler_ile_toplanti_duzenleyebilmeli

  @US19
  Scenario: US19_Teacher_Ogrenciler_ile_toplanti_duzenleyebilmeli
    Given kullanici ana sayfaya gider
    Then kullanici login butonuna tiklar
    And kullanici username bilgilerini girer
    And kullanici password bilgilerini girer
    And kullanici username ve password ile giris icin login butonuna tiklar
    And kullanici acilan sayfada sag ust taraftaki <Menu> yazisina tiklar
    And kullanici 1 saniye bekler
    And kullanici ekranin sol kisminda acilan pencereden <Meet Management> yazisina tiklar
    And kullanici 2 saniye bekler
     And kullanici ogrenci secmek icin Choose Students yazisinin altindaki Select Student yazisina tiklar
    And kullanici 2 saniye bekler
    And kullanici <Date of Meet> kismina bugunden once bir tarih girer
    And kullanici 1 saniye bekler
    And kullanici <Start Time> yazisinin altindaki kutucuğa toplanti baslama saatini girer
    And kullanici 1 saniye bekler
    And kullanici <Stop Time> yazisinin altindaki kutucuğa toplanti bitis saatini girer
    And kullanici 1 saniye bekler
    And kullanici <Description> kismina açiklama girer
    And kullanici Submit butonuna tiklar
    And kullanici ekranın üst kisminda hata uyarisi gorur
    And kullanici 3 saniye bekler
    And kullanici <Date of Meet> kismina bugunden sonra olacak sekilde gecerli bir tarih girer
    And kullanici 1 saniye bekler
    And kullanici Submit butonuna tiklar
    And kullanici ekranin ust kisminda Meet saved successfully onay mesajini gorur
    And kullanici sayfayi kapatir

















