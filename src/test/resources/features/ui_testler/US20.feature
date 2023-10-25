Feature: US20_Teacher_toplantıları_görebilmeli_güncelleyebilmeli_ve_silebilmeli

  @US20
  Scenario: US20_Teacher_toplantıları_görebilmeli_güncelleyebilmeli_ve_silebilmeli
    Given kullanici ana sayfaya gider
    Then kullanici login butonuna tiklar
    And kullanici username bilgilerini girer
    And kullanici password bilgilerini girer
    And kullanici username ve password ile giris icin login butonuna tiklar
    And kullanici acilan sayfada sag ust taraftaki <Menu> yazisina tiklar
    And kullanici 1 saniye bekler
    And kullanici ekranin sol kisminda acilan pencereden <Meet Management> yazisina tiklar
    And kullanici toplanti listesi icin Meet List yazisini gorur
    And kullanici 1 saniye bekler
    And kullanici Meet List tabosundaki Students'ın altında ogrenci ismini gorur
    And kullanici Meet List tabosundaki Date'in altında tarih gorur
    And kullanici 1 saniye bekler
    And kullanici Meet List tabosundaki Start Time'ın altında toplanti baslama saatini gorur
    And kullanici 1 saniye bekler
    And kullanici guncellemek istedigi toplanti ait ogrencinin sirasindaki Edit butonuta tiklar
    And kullanici edit penceresinin açıldığını gorur
    And kullanici yeni bir ogrenci ekler
    And kullanici onaylamak icin Submit butonuna tiklar
    And kullanici ekranin ust kisminda Meet updated successfully mesajini gorur
    And kullanici Edit Meet penceresinde Date Of Meet kısmındaki tarih kısmına tıklar ve yeni tarih girer
    And kullanici onaylamak icin Submit butonuna tiklar
    And kullanici 3 saniye bekler
    And kullanici ekranin ust kisminda Meet updated successfully mesajini gorur
    And kullanici 3 saniye bekler
    And kullanici Start Time kısmına toplanti baslama saatini girer
    And kullanici 2 saniye bekler
    And kullanici onaylamak icin Submit butonuna tiklar
    And kullanici güncelleme yapılmadiğina dair hata mesajini gorur
    And kullanici 3 saniye bekler
    And kullanici Stop Time kısmına toplanti bitis saatini girer
    And kullanici 2 saniye bekler
    And kullanici onaylamak icin Submit butonuna tiklar
    And kullanici güncelleme yapılmadiğina dair hata mesajini gorur
    And kullanici 3 saniye bekler
    And kullanici Time verileri eski halini almasi icin Edit penceresini kapatir ve yeniden acar
    And kullanici Description kismina açiklamayi siler ve yeni açiklama girer
    And kullanici onaylamak icin Submit butonuna tiklar
    And kullanici ekranin ust kisminda Meet updated successfully mesajini gorur
    And kullanici 2 saniye bekler
    And kullanici Edit Meet penceresini kapatir
    And kullanici Meet List eklenen meet'i silmek için taploda sağ tarafta bulunan kırmızı çöp kutusuna tıklar ve siler
    And kullanici ekranin ust kisminda Meet deleted succesfully yazisini gorur
    And kullanici sayfayi kapatir














