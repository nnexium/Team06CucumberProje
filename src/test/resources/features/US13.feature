@US13
Feature: US13 Vice Dean öğretmen oluşturabilmelidir.
  Scenario Outline: TC01 Vice Dean öğretmen oluşturabilmelidir.
    Given Ana sayfaya git.
    And Login Butonuna Tıkla.
    And Vice Dean User Name Bilgisini Gir.
    And Vice Dean Password Bilgisini Gir.
    And Mavi Login Butonuna Tıkla.
    And Menu butonuna tıkla.
    And Teacher Management  butonuna tıkla
    And Submit butonu gorunene kadar sayfayi asagiya kaydir
    And Add Teacher menüsündeki submit butonuna tıkla
    And Boş bırakılamaz olan bölümleri doğrula
    And Choose Lessons butonuna tıkla ve öğretmenin gireceği dersi seç
    And Öğretmen "<Name>","<Surname>","<BirthPlace>", "<email>","<PhoneNumber>" gir
    And Öğretmen Cinsiyeti Seç
    And Öğretmen Date of Birth gir.
    And ogretmen "<Ssn>","<UserName>","<Password>" gir
    And Add Teacher menüsündeki submit butonuna tıkla
    And Öğretmen eklendiğini doğrula
    And Sayfayi kapat
    Examples:
      | Name  | Surname   | BirthPlace | email               | PhoneNumber  | Ssn          | UserName   | Password     |
      | Tony  | Yavanov   | Makedonya  | tonyyavkk@gmail.com | 256-569-1785 | 123-56-1455  | Yavanovkk  | Yavanov1235  |