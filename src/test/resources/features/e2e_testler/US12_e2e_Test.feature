Feature: US12_e2e_Test

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
    Then tester kullanicinin siteden girdigi bilgiler database e gidip gitmedigini kontrol eder

    Scenario: 1
      Given tester kullanicinin siteden girdigi bilgiler database e gidip gitmedigini kontrol eder