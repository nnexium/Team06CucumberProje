@US03
 Feature: US03 Managementshcool Sayfasi Testi
  Scenario: TC01 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then User Name  ve password bilgilerini gir
    Then Login'e tıkla
    Then Navbar da bulunan Contact kısmına tıklar

  Scenario Outline: TC01 Kullanıcı Contact Kısmından Mesaj Gönderebilme
    Given : Kullanıcı Your Name "<Your Name>" kısmına bilgileri yazar
    Then : Kullanıcı Your Email "<Your Email>" kısmına bilgileri yazar
    Then : Kullanıcı Subject "<Subject>" kısmına bilgileri yazar
    Then : Kullanıcı Mesage "<Message>" kısmına bilgileri yazar
    Then : Kullanıcı Send Mesaj Buttonuna tıklar
    Then : "Contact Message Created Successfully" yazısının görüldüğünü doğrula.
    And  : Sayfayı kapatır1
    Examples:
      | Your Name | Your Email        | Subject | Message                |
      | Team06    | Team06@team06.com | Team06  | Bu Proje Harika Dostum |

  Scenario: TC02 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then User Name  ve password bilgilerini gir
    Then Login'e tıkla
    Then Navbar da bulunan Contact kısmına tıklar

  Scenario Outline: TC02 Kullanıcı Contact Kısmından Mesaj Gönderebilme
    Given : Kullanıcı Your Name "<Your Name>" kısmına bilgileri yazar
    Then : Kullanıcı Your Email "<Your Email>" kısmına bilgileri yazar
    Then : Kullanıcı Subject "<Subject>" kısmına bilgileri yazar
    Then : Kullanıcı Mesage "<Message>" kısmına bilgileri yazar
    Then : Kullanıcı Send Mesaj Buttonuna tıklar
    Then : "Contact Message Created Successfully" yazısının görüldüğünü doğrula.
    And  : Sayfayı kapatır1
    Examples:
      | Your Name | Your Email        | Subject | Message                |
      | Team06    | Team06@team06.com | Team06  | Bu Proje Harika Dostum |

  Scenario: TC03 Kullanıcı login olma
    Given : kullanici managementonschool sayfasina gider
    Then Login butonuna tıklar
    Then User Name  ve password bilgilerini gir
    Then Login'e tıkla
    Then Navbar da bulunan Contact kısmına tıklar

  Scenario Outline: TC03 Kullanıcı Contact Kısmından Farklı Email bilgileri ile Mesaj Gönderebilme
    Given : Kullanıcı Your Name "<Your Name>" kısmına bilgileri yazar
    Then : Kullanıcı Your Email "<Your Email>" kısmına bilgileri yazar
    Then : Kullanıcı Subject "<Subject>" kısmına bilgileri yazar
    Then : Kullanıcı Mesage "<Message>" kısmına bilgileri yazar
    Then : Kullanıcı Send Mesaj Buttonuna tıklar
    Then : "Your Subject Should Be at least 4 characters" yazısının her iki kısım için görüldüğünü doğrula.
    And  : Sayfayı kapatır1
    Examples:
      | Your Name | Your Email        | Subject | Message |
      | Team06    | Team06@team06.com | Te      | Bu      |