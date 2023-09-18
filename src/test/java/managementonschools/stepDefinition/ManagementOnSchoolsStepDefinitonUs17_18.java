package managementonschools.stepDefinition;

import io.cucumber.java.en.*;
import managementonschools.pages.ManagementOnSchoolsPageUs17_18;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagementOnSchoolsStepDefinitonUs17_18 {
    ManagementOnSchoolsPageUs17_18 pages1718 = new ManagementOnSchoolsPageUs17_18();
    @Given("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

    }
       @When("kullanici teacher olarak login butonuna tiklar")
    public void kullaniciTeacherOlarakLoginButonunaTiklar() {
        pages1718.login.click();
        ReusableMethods.bekle(3);
    }
    @When("kullanici teacher olarak username ve password ile giris yapar")
    public void kullanici_teacher_olarak_username_ve_password_ile_giris_yapar() {
        pages1718.username.sendKeys("Teacher1",Keys.TAB, "Teacher1");
       ReusableMethods.bekle(1);
    }

    @Then("kullanici giris butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        pages1718.girisButton.click();
    }

    @Given("kullanici choose lesson alanindan ders secer")
    public void kullanici_choose_lesson_alanindan_ders_secer() {

        pages1718.chooseLesson.sendKeys(Keys.ENTER,Keys.END,Keys.ENTER);
      ReusableMethods.bekle(2);
    }

   @Then("kullanici choose student alanindan ogrenci secer")
   public void kullanici_choose_student_alanindan_ogrenci_secer() {

       pages1718.chooseStudent.sendKeys(Keys.ENTER,Keys.END,Keys.ENTER);
     ReusableMethods.bekle(2);
   }
   @Then("kullanici choose education term alanindan dönem secer")
   public void kullanici_choose_education_term_alanindan_dönem_secer() {
       pages1718.chooseTerm.sendKeys(Keys.ENTER,Keys.END,Keys.ENTER);
      ReusableMethods.bekle(2);

   }
   @Then("kullanici absentee midterm final exam info note alanlarina bilgi girer")
   public void kullanici_absentee_midterm_final_exam_info_note_alanlarina_bilgi_girer() {

        pages1718.absentee.sendKeys("15");
       ReusableMethods.bekle(2);

       pages1718.midtermexamnote.sendKeys("55");
     ReusableMethods.bekle(2);

       pages1718.finalexamnote.sendKeys("55");
       ReusableMethods.bekle(2);

       pages1718.infoNote.sendKeys("successfully");
       ReusableMethods.bekle(2);

   }
    @Then("kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        pages1718.submitButton1.click();
       ReusableMethods.bekle(2);


    }
    @Then("kullanici {string} dogrular")
    public void kullanici_dogrular(String string) {

        ReusableMethods.tumSayfaResmi("Ogrenci ekleme basarili");

    }

    @And("kullanici  teacher sayfasini kapatir")
    public void kullaniciTeacherSayfasiniKapatir() {
        Driver.getDriver().quit();
    }


    @Given("kullanici teacher hesabi ile ana sayfaya gider")
    public void kullaniciTeacherHesabiIleAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @Then("kullanici teacher hesabi ile login butonuna tiklar")
    public void kullaniciTeacherHesabiIleLoginButonunaTiklar() {
        pages1718.login.click();
       ReusableMethods.bekle(3);
    }

    @And("kullanici teacher hesabi ile username ve password ile giris yapar")
    public void kullaniciTeacherHesabiIleUsernameVePasswordIleGirisYapar() {
        pages1718.username.sendKeys("Teacher1",Keys.TAB, "Teacher1");
       ReusableMethods.bekle(1);
    }

    @But("kullanici teacher hesabi ile loginn butonuna tiklar")
    public void kullaniciTeacherHesabiIleLoginnButonunaTiklar() {
        pages1718.girisButton.click();
    }

    @Given("kullanici student info listte isim dogrular")
    public void kullaniciStudentInfoListteIsimDogrular() {
        Assert.assertTrue(pages1718.name1.getText().contains("Team04"));
       ReusableMethods.bekle(1);
    }

    @Then("kullanici student info listte ders adi dogrular")
    public void kullaniciStudentInfoListteDersAdiDogrular() {
        Assert.assertTrue(pages1718.lessonName1.getText().contains("English"));
       ReusableMethods.bekle(1);
    }

    @And("kullanici student info listte devamsizlik dogrular")
    public void kullaniciStudentInfoListteDevamsizlikDogrular() {
        Assert.assertTrue(pages1718.absentee1.getText().contains("15"));
        ReusableMethods.bekle(1);
    }

    @But("kullanici student info listte midterm exam dogrular")
    public void kullaniciStudentInfoListteMidtermExamDogrular() {
        Assert.assertTrue(pages1718.midtermExam1.getText().contains("55"));
       ReusableMethods.bekle(1);
    }

    @And("kullanici student info listte final exam dogrular")
    public void kullaniciStudentInfoListteFinalExamDogrular() {
        Assert.assertTrue(pages1718.finalExam1.getText().contains("55"));
      ReusableMethods.bekle(1);
    }

    @Then("kullanici student info listte note dogrular")
    public void kullaniciStudentInfoListteNoteDogrular() {
        Assert.assertTrue(pages1718.note1.getText().contains("DC"));
      ReusableMethods.bekle(1);
    }

    @And("kullanici student info listte info note dogrular")
    public void kullaniciStudentInfoListteInfoNoteDogrular() {
        Assert.assertTrue(pages1718.infoNote1.getText().contains("successfully"));
      ReusableMethods.bekle(1);
    }

    @And("kullanici student info listte info avarage dogrular")
    public void kullaniciStudentInfoListteInfoAvarageDogrular() {
        Assert.assertTrue(pages1718.avarage1.getText().contains("55"));
        ReusableMethods.bekle(2);
        pages1718.avarage1.sendKeys(Keys.TAB,Keys.ENTER);
    }

    @Given("kullanici student info listte edit butonuna tiklar")
    public void kullaniciStudentInfoListteEditButonunaTiklar() {
        pages1718.editButton.click();
        ReusableMethods.bekle(3);
    }

    @Then("kullanici midterm exam alaninda {string} gunceller")
    public void kullaniciMidtermExamAlanindaGunceller(String arg0) {
        pages1718.editMidterm.sendKeys("55");
    }

    @And("kullanici final exam alaninda {string} gunceller")
    public void kullaniciFinalExamAlanindaGunceller(String arg0) {
        pages1718.editFinal.sendKeys("55");
    }

    @Then("kullanici guncelsubmit butonuna tiklar")
    public void kullaniciGuncelsubmitButonunaTiklar() {
        pages1718.editSubmitButton.click();
    }

    @But("kullanici teacher hesabi ile {string} yazisini dogrular")
    public void kullaniciTeacherHesabiIleYazisiniDogrular(String arg0) {
        ReusableMethods.tumSayfaResmi("Ogrenci not guncelleme basarili");
    }

    @And("kullanici Edit student info sayfasinda {string} butonuna tiklar")
    public void kullaniciEditStudentInfoSayfasindaButonunaTiklar(String arg0) {
        pages1718.closeButton1.click();
    }

    @But("kullanici ogrenci bilgisi siler")
    public void kullaniciOgrenciBilgisiSiler() {
        pages1718.deleteButton.click();
    }



}



