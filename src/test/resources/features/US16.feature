Feature: US16 Vice Dean, Kullanicilarin Gonderdigi Mesajlari Gorebilmelidir
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