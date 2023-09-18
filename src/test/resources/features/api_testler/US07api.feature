Feature: Dean gonderilen mesajlari gorur
  Scenario Outline: Dean gonderilen mesajlari gorur
    Given getAll requestiyle tum mesajlari getir
    Then name="<>",email="<>",subject="<>",message="<>",date="<>" goruldugunu dogrula
    Examples:
      | name     |email              |subject  |message          |date      |
      |team0612  |team0606@gmail.com |kayıt    |kayıt hakkında   |2023-09-17|

