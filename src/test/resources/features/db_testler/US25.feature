Feature: Admin Ogrenci Olusturabilmeli

  Scenario Outline: TC01 Ogrenci Bilgileri DB kontrol edilmeli
    Given database'e bağlanır
    When olusturulan ögrenci "<name>" ile çağırılır
    Then Girdigimiz student bilgilerinin advisorTeacherId "<advisorTeacherId>",birthDay "<birthDay>",birthPlace "<birthPlace>",email "<email>",fatherName "<fatherName>",motherName"<motherName>",gender"<gender>",name"<name>",surname"<surname>",phoneNumber"<phoneNumber>",ssn"<ssn>",username"<username>",password"<password>" içerdiği dogrulanir
    Examples:
      | advisorTeacherId | birthDay | birthPlace | email | fatherName | motherName | gender | name | surname | phoneNumber | ssn | username | password |
      |     18      | 2000-09-02 | bursa | team06123@gmail.com | baba | anne | 1 | team7658 | jake | 764-927-9386 | 826-35-9476 | LenaMena | $2a$10$dE.faI84usES78IbrdSGp.fzABWUuCVqO7wj5AGW5BBQuK8.3n.9W |
