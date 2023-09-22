@E2E @US16
Feature: US16 Vice Dean, Kullanicilarin Gonderdigi Mesajlari Gorebilmelidir

  @US16_UI
  Scenario: Mesajlar goruntulenebilmeli ve silinebilmeli
    Given kullanici managementonschools sayfasina gider
    Then login'e tikla
    Then username alanina kullanici adi gir
    Then password alanina sifre gir
    Then login butonuna tikla
    Then menu'ye tikla
    Then contact get all tikla
    And  silme butonunun goruntulendigini dogrula
    And  message bilgisinin goruntulendigini dogrula
    And  name bilgisinin goruntulendigini dogrula
    And  email bilgisinin goruntulendigini dogrula
    And  date bilgisinin goruntulendigini dogrula
    And  subject bilgisinin goruntulendigini dogrula
    Then mesajlarin silinebildigini dogrula
    Then sayfayi kapat

    @US16_API
  Scenario: TC01 Mesajin Goruntulenebilmesi
    Given Mesaji goruntuleyebilmek icin get request hazirliklari yapilir
    When mesaji goruntuleyebilmek icin get request yapilir
    Then message, name, email, date, subject bilgilerinin goruntulendigi dogrulanir

      @US16_DB
  Scenario Outline: TC01 Gonderilen Mesajlar DB Goruntulenmeli
    Given database'e bağlanır
    When ogrenciler "<email>" ile cagirilir
    Then message "<message>", name "<name>", email "<email>", date "<date>", subject "<subject>" bilgilerinin goruntulendigi dogrulanir DB
    Examples:
      | message        | name     | email              | date       | subject |
      | kayıt hakkında | team0612 | team0606@gmail.com | 2023-09-14 | kayıt |
