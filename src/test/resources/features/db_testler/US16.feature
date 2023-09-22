Feature: Vice Dean Kullanicilarin Gonderdigi Mesajlari Gorebilmelidir

  Scenario Outline: TC01 Gonderilen Mesajlar DB Goruntulenmeli
    Given database'e bağlanır
    When ogrenciler "<email>" ile cagirilir
    Then message "<message>", name "<name>", email "<email>", date "<date>", subject "<subject>" bilgilerinin goruntulendigi dogrulanir DB
    Examples:
      | message        | name     | email              | date       | subject |
      | kayıt hakkında | team0612 | team0606@gmail.com | 2023-09-14 | kayıt |
