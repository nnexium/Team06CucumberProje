@US21
Scenario: Students, choose lesson, grades and announcement girebilmeli
Given kullanici ana sayfaya gider
Then kullanici login butonuna tiklar
And kullanici username bilgilerini girer
And kullanici password bilgilerini girer
And kullanici username ve password ile giris icin login butonuna tiklar
And kullanici ders secebilmeli
And submit butonuna tiklamali



Scenario: admin bilgilerini girebilmeli

And kullanici login butonuna tiklar
And kullanici username bilgilerini girer
And kullanici password bilgilerini girer
And kullanici username ve password ile giris icin login butonuna tiklar
And Name girilmelidir. Boş bırakılamaz.
And Surname girilmelidir. Boş bırakılamaz.
And Birth Place girilmelidir. Boş bırakılamaz.
And Cinsiyet seçilmelidir. Boş bırakılamaz.
And Doğum tarihi girilmelidir. Boş bırakılamaz.
And Telefon numarası girilmelidir. Boş bırakılamaz.
And SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
And Password girilmelidir. Password en az 8 karakterden oluşmalıdır.



