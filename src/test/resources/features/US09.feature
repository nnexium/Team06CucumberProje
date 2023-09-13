Feature: US_09_Vice_Dean_ders_listesini_görebilmeli_ve_güncellemeler_yapabilmelidir. (Lessons - Lesson List)

Scenario: TC_01_Vice_Dean_ders_listesini_görebilmeli_ve_güncellemeler_yapabilmelidir. (Lessons - Lesson List)
 Given Kullanici anasayfaya gider
  When Login kutusuna tiklar
  Then  UserName kutusuna "viceDeanUserName" yazar
  And  Kullanici 2 saniye bekler
  Then Password kutusuna "viceDeanSifre" yazar
  And  Kullanici 2 saniye bekler
  Then Login butonuna tiklar
  Then Kullanici anasayfada "Hi ViceDeanTeam06" yazisini görür
  And  Kullanici 2 saniye bekler
  And Kullanici Lessons butonunu tiklar
  And Kullanici sayfayi assagi kaydirip Lesson List i gorur
 And  Kullanici 2 saniye bekler
  And Kullanici Lesson Name,Credit Score ve Compulsory gorur
 And  Kullanici 1 saniye bekler
And Kullanici sayfayi assagi kaydirip >>butonuna tiklar
  And Kullanici Delete butonunu gorur ve tiklar
 And  Kullanici 2 saniye bekler
  And Kullanici "Lesson Deleted" mesajini gorur
 And  Kullanici 1 saniye bekler
  And Kullanici ders bilgilerini guncelle butonunu goremez ve ders bilgilerini guncelleyemez
 And Kullanici sayfayi kapatir

