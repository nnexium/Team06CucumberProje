@US04
Feature: US04 Managementshcool Sayfasi Testi

  Scenario: TC01 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then us gir pas gir
    Then Login'e tıkla
    Then Sol tarafta açılan "Dean Management" kısmına tıklar

  Scenario Outline: TC01 Kullanıcı Contact Kısmından Mesaj Gönderebilme
    Given : Kullanıcı Name "<Name>" kısmına bilgileri yazar
    Then : Kullanıcı Surname "<Surname>" kısmına bilgileri yazar
    Then : Kullanıcı BirthPlace kısmına bilgileri yazar
    Then : Gender kısmında cinsiyet seçili olmadığını gör
    Then : Gender Kısmında cinsiyet seçimini yap
    Then : Kullanıcı Doğum Tarihi seçer
    Then : Kullanıcı Phone "<Phone>" bilglerini yazar
    Then : Kullanıcı SSN no "<SSN no>" bilgilerini yazar
    Then : Kullanıcı User Name "<User Name>" bilgilerini yazar
    Then : Kullanıcı Password "<Password>" bilgilerini yazar
    Then : Kullanıcı Submit Buttonuna tıklar
    Then : Kullanıcı Başarı ile Dean kayıt edildiği mesajınının görüldüğünü doğrula
    And  : Sayfayı kapatır
    Examples:
      | Name | Surname | User Name  | Phone        | SSN no      | Password |
      | Dean | Team    | DeanTeam06 | 538-528-3344 | 123-555-666 | Team0612 |

  Scenario: TC02 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then Admin User Name  ve Admin password bilgilerini gir
    Then Login'e tıkla
    Then Login butonuna tıklar
    Then Sol tarafta açılan "Dean Management" kısmına tıklar

  Scenario Outline: TC01 Kullanıcı Contact Kısmından Mesaj Gönderebilme
    Given : Kullanıcı Name "<Name>" kısmına bilgileri yazar
    Then : Kullanıcı Surname "<Surname>" kısmına bilgileri yazar
    Then : Kullanıcı BirthPlace kısmına bilgileri yazar
    Then : Gender kısmında cinsiyet seçili olmadığını gör
    Then : Gender Kısmında cinsiyet seçimini yap
    Then : Kullanıcı Doğum Tarihi seçer
    Then : Kullanıcı Phone "<Phone>" bilglerini rakamlar arasında "-" işareti olmadan yazar
    Then : Kullanıcı SSN no "<SSN no>" bilglerini rakamlar arasında "-" işareti olmadan yazar
    Then : Kullanıcı User Name "<User Name>" bilgilerini yazar
    Then : Kullanıcı Password "<Password>" bilgilerini yazar
    Then : Kullanıcı Submit Buttonuna tıklar
    Then : Kullanıcı çıkan hata mesajının göründüğünü doğrula
    And  : Sayfayı kapatır
    Examples:
      | Name | Surname | User Name  | Phone      | SSN no    | Password |
      | Dean | Team    | DeanTeam06 | 5385283344 | 123555666 | Team0612 |

