
Feature: US04 Managementshcool Sayfasi Testi

  Scenario: TC01 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then kullanıcı bilgileri gir
    Then Login'e tıkla
    Then Menu Butonuna Tıkla
    Then Sol tarafta açılan "Dean Management" kısmına tıklar

  Scenario Outline: TC01 Kullanıcı Dean Ekleyebilmeli
    Given : Kullanıcı Name "<Name>" kısmına bilgileri yazar
    Then : Kullanıcı Surname "<Surname>" kısmına bilgileri yazar
    Then : Gender kısmında cinsiyet seçili olmadığını gör
    Then : Gender Kısmında cinsiyet seçimini yap
    Then : Kullanıcı BirthPlace kısmına bilgileri yazar
    Then : Kullanıcı Doğum Tarihi seçer
    Then : Kullanıcı Phone "<Phone>" bilglerini yazar
    Then : Kullanıcı SSN no "<SSN no>" bilgilerini yazar
    Then : Kullanıcı User Name "<User Name>" bilgilerini yazar
    Then : Kullanıcı Password "<Password>" bilgilerini yazar
    Then : Kullanıcı Submit Buttonuna tıklar
    Then : Kullanıcı Başarı ile Dean kayıt edildiği mesajınının görüldüğünü doğrula
    And  : Sayfayı kapatır

    Examples:
      | Name | Surname | User Name  | Phone        | SSN no     | Password |
      | Dean | Team    | DeanTeam06 | 538-528-3344 | 123-555666 | Team0612 |
  @US04
  Scenario: TC02 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then kullanıcı bilgileri gir
    Then Login'e tıkla
    Then Menu Butonuna Tıkla
    Then Sol tarafta açılan "Dean Management" kısmına tıklar
  @US04
  Scenario Outline: TC02 Kullanıcı Dean Ekleme hatasını görebilmeli
    Given : Kullanıcı Name "<Name>" kısmına bilgileri yazar
    Then : Kullanıcı Surname "<Surname>" kısmına bilgileri yazar
    Then : Kullanıcı BirthPlace kısmına bilgileri yazar
    Then : Kullanıcı Doğum Tarihi seçer
    Then : Kullanıcı Phone "<Phone>" bilglerini rakamlar arasında "-" işareti olmadan yazar
    Then : Kullanıcı SSN no "<SSN no>" bilglerini rakamlar arasında "-" işareti olmadan yazar
    Then : Kullanıcı User Name "<User Name>" bilgilerini yazar
    Then : Kullanıcı Password "<Password>" bilgilerini yazar
    Then : Kullanıcı Submit Buttonuna tıklar
    Then : Kullanıcı çıkan hata mesajının göründüğünü doğrula
    And  : Sayfayı kapatır

    Examples:
      | Name | Surname | User Name  | Phone        | SSN no      | Password |
      | Dean | Team    | DeanTeam06 | 538-528-3344 | 123-55-5666 | Team0612 |

