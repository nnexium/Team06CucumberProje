Feature: US11

  Scenario: TC01 Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
    Given e kullanici ana sayfaya gider
    Then e kullanici login butonuna tiklar
    Then e kullanici adini ve sifresini girer
    Then e kullanici giris icin login butonuna tiklar
    Then e kullanici menu'ye tiklar
    Then e kullanici Lesson Management'e tiklar
    Then e kullancii Lesson Program'a tiklar
