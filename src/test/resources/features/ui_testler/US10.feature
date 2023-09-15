Feature: US10

  Scenario: TC01 Vice Dean ders programı oluşturabilmelidir.
    Given e kullanici ana sayfaya gider
    Then e kullanici login butonuna tiklar
    Then e kullanici adini ve sifresini girer
    Then e kullanici giris icin login butonuna tiklar
    Then e kullanici menu'ye tiklar
    Then e kullanici Lesson Management'e tiklar
    Then e kullancii Lesson Program'a tiklar
    Then e kullanci ders,gun,baslama saati,bitis saati gereksinimlerini doldurur
    Then e kullanici Submit butonuna tiklar