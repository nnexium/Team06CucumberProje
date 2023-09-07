
  Feature:US_08_ViceDean_Ders_Olusturabilmelidir

    Background: Kullanici anasayfaya gider
      Given Login kutusuna tiklar
      Given UserName kutusuna "viceDeanUserName" yazar
      Given Password kutusuna "viceDeanSifre" yazar
      Given Login butonuna tiklar
      Given Kullanici anasayfada "Hi ViceDeanTeam06" yazisini görür

    Scenario: TC_01_ViceDean_Ders_Olusturabilmelidir

      And Kullanici Lessons butonunu tiklar
      And Kullanici Lesson Name kutusuna "lessonName" yazar
      And Kullanici Compulsory butonunu isaretler
      And Kullanici Credit Score butonuna "creditScore" yazar
      And Kullanici Submit butonuna tiklar
      But Kullanici 2sn bekler
      And Kullanici "Lesson Created" yazisini görür



#5-'Credit Score' butonuna Credit Score yaz
  #6-'Submit' butonuna tıkla
  #7-Lesson Name'in 'Required' mesajını gör

    Scenario:TC_02_ViceDean_Ders_Olusturabilmelidir
      And Kullanici "Lesson Management" yazisini gorur
      And Kullanici Lesson Name kutusunu bos birakir
      And Kullanici Compulsory butonunu bos birakir
      And Kullanici Credit Score butonuna "creditScore" yazar
      And Kullanici Submit butonuna tiklar
      But Kullanici 2sn bekler
      And Kullanici Lesson Name kutusunun altindaki "Required" yazisini gorur






