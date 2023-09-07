@US01
Feature: US001 Aday öğrenciler sisteme kayıt olabilmelidir.(Register)
Background: Register islemleri
  Given Kullanici "managementonschoolsUrl" sayfasina gider
  When Kullanici Register Butonuna tiklar
  Then  Register Butonuna tiklar
  And  Kullanici 2 saniye bekler


  Scenario: TC01 Register
    When Girer name "name", surname "surname",birth_place "birth_place", phone_number "phone_number",gender "gender", birth_day "birth_day",ssn "ssn",username "username",password"password"
    And  'Guest User registired.' yazisinin göründüğünü doğrula



  Scenario: TC02 Register Name alani bos
    When Name alani boş kalir , name "name", surname "surname",birth_place "birth_place", phone_number "phone_number",gender "gender", birth_day "birth_day",ssn "ssn",username "username",password"password"
    And  Name alaninda 'Required' yazisinin göründügünü doğrula



  Scenario: TC03 Register Surname alani bos

    When Surname alani bos kalir "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And  Surname alaninda 'Required' yazisinin göründügünü doğrula



  Scenario: TC04 Register birth place alani bos

    When Birth place alani bos kalir "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And  Birth place alaninda 'Required' yazisinin göründügünü doğrula



  Scenario: TC05 "SSN" alaninda; 3. ve 5. rakamdan sonra "-" icermiyorsa kayit yapilamamali (Negatif Senaryo)

    When Kullanici "SSN" alanina "-" içeremeyen ve 11 rakamdan oluşan değerleri girer. name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And  "Please enter valid SSN number" yazisi görüldügünü dogrula
    And Kullanici sayfayi kapatir






