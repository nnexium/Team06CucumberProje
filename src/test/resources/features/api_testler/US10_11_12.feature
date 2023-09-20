@apitesti
  Feature: US10
    Scenario: Vice Dean ders programı oluşturabilmelidir.
      Given Ders eklemek icin Post request hazirligi yapilir
      And Gonderilicek bilgiler hazirlanir
      When Ders programi eklemek icin Post request gonderilir
      Then Ders bilgileri onaylanir

      Scenario: US11 Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
        Given Ders eklemek icin Post request hazirligi yapilir
        And Gonderilicek bilgiler hazirlanir
        When Ders programi eklemek icin Post request gonderilir
        Then Onceden olusturulmus ders programi silinir ve silindigi kontrol edilir

        Scenario: US12 Vice Dean öğretmene ders atayabilmelidir.
          Given Ders eklemek icin Post request hazirligi yapilir
          And Gonderilicek bilgiler hazirlanir
          When Ders programi eklemek icin Post request gonderilir
          And Onceden olusturulmus dersler ile onceden olusturulmus ogretmene ders atamasi yapilir