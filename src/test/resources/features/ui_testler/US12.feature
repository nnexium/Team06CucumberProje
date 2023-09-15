Feature: US12

  Scenario: TC01 Vice Dean öğretmene ders atayabilmelidir.
    Given e kullanici ana sayfaya gider
    Then e kullanici login butonuna tiklar
    Then e kullanici adini ve sifresini girer
    Then e kullanici giris icin login butonuna tiklar
    Then e kullanici menu'ye tiklar
    Then e kullanici Lesson Management'e tiklar
    Then e kullancii Lesson Program'a tiklar
    Then e kullanci ders,gun,baslama saati,bitis saati gereksinimlerini doldurur
    Then e kullanici Submit butonuna tiklar
    Then e kullanici bir alttaki Lesson Program Assignment bolumunden ogretmene vermek istedigi derselri secer
    Then e killanici onunda altindaki Choose Teacher bolumune gelir
    Then e kullanici istedigi ogretmeni secer
    Then e kullanici ogretmeni atamak icin submit butonuna tiklar