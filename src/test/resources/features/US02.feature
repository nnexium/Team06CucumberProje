Feature: US02 Admin bilgileri görmeli ve silebilmeli

  Scenario: TC01 Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Given Admin "managementonschoolsUrl" sayfasina gider
    When Admin Login Butonuna tıklar
    And Admin "managementAdminUser" alanına kayıtlı user name girer
    And Admin "managementAdminPassword" alanına kayıtlı passwordünü girer
    And Admin login butonuna tıklar
    And Admin açılan pencerede menu butonuna tıklar
    And Admin Guest User'a tiklar
    Then Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görünür olduğunu doğrular

  Scenario: TC02 Admin Guest User List bilgilerini silebilmeli
    Given Admin "managementonschoolsUrl" sayfasina gider
    When Admin Login Butonuna tıklar
    And Admin "managementAdminUser" alanına kayıtlı user name girer
    And Admin "managementAdminPassword" alanına kayıtlı passwordünü girer
    And Admin login butonuna tıklar
    And Admin açılan pencerede menu butonuna tıklar
    And Admin Guest User'a tiklar
    And Admin silme işlemi için, Guest User List de, Name, Phone Number, SSN, User Name in olduğu tabloda "Çöp Kutusu" işaretini tıklar
    Then Admin "Guest User Deleted Successfull" yazısının görünür olduğunu doğrular