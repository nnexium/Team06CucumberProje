Feature: admin olusturma

  @US22
  Scenario: admin bilgilerini girebilmeli

    Given kullanici ana sayfaya git
    Then kullanici login butonuna tikla
    Then kullanici username bilgilerini gir
    And kullanici password bilgilerini gir
    And kullanici username ve password ile giris icin login butonuna tikla
    And kullanici username bilgilerini girer
    And kullanici password bilgilerini girer
    And Name girilmelidir. Boş bırakılamaz.
    And Surname girilmelidir. Boş bırakılamaz.
    And Birth Place girilmelidir. Boş bırakılamaz.
    And Cinsiyet seçilmelidir. Boş bırakılamaz.
    And Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Telefon numarası girilmelidir. Boş bırakılamaz.
    And SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And submit butonuna tikla




