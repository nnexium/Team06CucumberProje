Feature: Teacher ogrencilere not verebilmelidir.
  @Us17
  Scenario: Teacher olarak login olma
    Given kullanici ana sayfaya gider
    When kullanici teacher olarak login butonuna tiklar
    And kullanici teacher olarak username ve password ile giris yapar
    Then kullanici giris butonuna tiklar


  Scenario: Teacher ders ogrenci devamsizlik not ve info note girebilmelidir
    Given kullanici choose lesson alanindan ders secer
    When kullanici choose lesson alanindan ders secer
    Then kullanici choose student alanindan ogrenci secer
    And kullanici choose education term alanindan dönem secer
    Then kullanici absentee midterm final exam info note alanlarina bilgi girer
    And kullanici submit butonuna tiklar
    Then kullanici "student info saved successfully" dogrular
    And kullanici  teacher sayfasini kapatir


