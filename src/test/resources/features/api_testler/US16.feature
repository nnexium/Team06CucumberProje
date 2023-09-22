Feature: Vice Dean Kullanicilarin Gonderdigi Mesajlari Goruntuleyebilmelidir

  Scenario: TC01 Mesajin Goruntulenebilmesi
    Given Mesaji goruntuleyebilmek icin get request hazirliklari yapilir
    When mesaji goruntuleyebilmek icin get request yapilir
    Then message, name, email, date, subject bilgilerinin goruntulendigi dogrulanir