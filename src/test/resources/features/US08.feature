
  Feature:US_08_ViceDean_Ders_Olusturabilmelidir
    Background: ViceDean Ders Olusturabilmeli
      Given Kullanici anasayfaya gider
      And  Kullanici 1 saniye bekler
      When Login kutusuna tiklar
      And  Kullanici 1 saniye bekler
      Then  UserName kutusuna "viceDeanUserName" yazar
      And  Kullanici 1 saniye bekler
      Then Password kutusuna "viceDeanSifre" yazar
      And  Kullanici 1 saniye bekler
      Then Login butonuna tiklar
      Then Kullanici anasayfada "Hi ViceDeanTeam06" yazisini görür
      And  Kullanici 1 saniye bekler
      And Kullanici Lessons butonunu tiklar
      And Kullanici "Lesson Management" yazisini gorur


    Scenario: TC_01_ViceDean_Ders_Olusturabilmelidir

      And Kullanici Lesson Name kutusuna "lessonName" yazar
      And  Kullanici 2 saniye bekler
      And Kullanici Compulsory butonunu isaretler
      And  Kullanici 1 saniye bekler
      And Kullanici Credit Score butonuna "creditScore" yazar
      And  Kullanici 2 saniye bekler
      And Kullanici Submit butonuna tiklar
      And  Kullanici 2 saniye bekler
      And Kullanici "Lesson Created" yazisini görür
      And Kullanici sayfayi kapatir


    Scenario:TC_02_Lesson_Name_Required_Mesajini_Gorur

      And Kullanici Lesson Name kutusuna "" yazar
      And  Kullanici 1 saniye bekler
      And Kullanici Compulsory butonunu bos birakir
      And  Kullanici 1 saniye bekler
      And Kullanici Credit Score butonuna "creditScore" yazar
      And  Kullanici 2 saniye bekler
      And Kullanici Submit butonuna tiklar
      But Kullanici 2sn bekler
      And Kullanici Lesson Name kutusunun altindaki "Required" yazisini gorur
      And Kullanici sayfayi kapatir



    Scenario:TC_03_Credit_Score_Required_Mesajini_Gorur
      And Kullanici Lesson Name kutusuna "lessonName" yazar
      And  Kullanici 1 saniye bekler
      And Kullanici Compulsory butonunu bos birakir
      And  Kullanici 1 saniye bekler
      And Kullanici Credit Score butonuna "" yazar
      And  Kullanici 2 saniye bekler
      And Kullanici Submit butonuna tiklar
      But Kullanici 2sn bekler
      And Kullanici Credit Score kutusunun altindaki "Required" yazisini gorur
      And Kullanici sayfayi kapatir








