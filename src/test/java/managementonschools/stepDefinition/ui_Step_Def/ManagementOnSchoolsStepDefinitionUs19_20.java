package managementonschools.stepDefinition.ui_Step_Def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagementOnSchoolsPageUs19_20;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


 public class ManagementOnSchoolsStepDefinitionUs19_20 extends ReusableMethods {

    ManagementOnSchoolsPageUs19_20 managementOnSchoolsPageUS19_20 = new ManagementOnSchoolsPageUs19_20();

  // @Given("kullanici ana sayfaya gider")
  // public void kullaniciAnaSayfayaGider() {
  //     Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

  // }


    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        managementOnSchoolsPageUS19_20.loginButon.click();
    }

    @Then("kullanici username bilgilerini girer")
    public void kullaniciUsernameBilgileriniGirer() {
        managementOnSchoolsPageUS19_20.userNameKutusu.sendKeys(ConfigReader.getProperty("teacherUsername"));

    }

    @And("kullanici password bilgilerini girer")
    public void kullaniciPasswordBilgileriniGirer() {
        managementOnSchoolsPageUS19_20.passwordKutusu.sendKeys(ConfigReader.getProperty("teacherPassword"));
    }


    @And("kullanici username ve password ile giris icin login butonuna tiklar")
    public void kullaniciUsernameVePasswordIleGirisIcinLoginButonunaTiklar() {
        managementOnSchoolsPageUS19_20.loginButonuUsernameVePassword.click();
    }


    @And("kullanici acilan sayfada sag ust taraftaki <Menu> yazisina tiklar")
    public void kullaniciAcilanSayfadaSagUstTaraftakiMenuYazisinaTiklar() {
        managementOnSchoolsPageUS19_20.menu.click();
    }


    @And("kullanici ekranin sol kisminda acilan pencereden <Meet Management> yazisina tiklar")
    public void kullaniciEkraninSolKismindaAcilanPenceredenMeetManagementYazisinaTiklar() {
        managementOnSchoolsPageUS19_20.meetManagement.click();
    }

    @And("kullanici ogrenci secmek icin Choose Students yazisinin altindaki Select Student yazisina tiklar")
    public void kullaniciOgrenciSecmekIcinChooseStudentsYazisininAltindakiSelectStudentYazisinaTiklar() {
         managementOnSchoolsPageUS19_20.chooseStudents.click();
         Actions action = new Actions(Driver.getDriver());
         action.sendKeys("Ece Dağ",Keys.ENTER).perform();


    }


     @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int i) {
        ReusableMethods.bekle(2);
    }





    @And("kullanici <Date of Meet> kismina bugunden once bir tarih girer")
    public void kullaniciDateOfMeetKisminaBugundenOnceBirTarihGirer() {
        managementOnSchoolsPageUS19_20.date.sendKeys("12","10","2022");

    }

    @And("kullanici <Start Time> yazisinin altindaki kutucuğa toplanti baslama saatini girer")
    public void kullaniciStartTimeYazisininAltindakiKutucuğaToplantiBaslamaSaatiniGirer() {
        managementOnSchoolsPageUS19_20.startTime.sendKeys("10","00");

    }

    @And("kullanici <Stop Time> yazisinin altindaki kutucuğa toplanti bitis saatini girer")
    public void kullaniciStopTimeYazisininAltindakiKutucuğaToplantiBitisSaatiniGirer() {
        managementOnSchoolsPageUS19_20.stopTime.sendKeys("15","00");

    }
    @And("kullanici <Description> kismina açiklama girer")
    public void kullaniciDescriptionKisminaAçiklamaGirer() {
        managementOnSchoolsPageUS19_20.description.sendKeys("MuhammetDeneme");
    }


    @And("kullanici Submit butonuna tiklar")
    public void KullaniciSubmitButonunaTiklar() {
        managementOnSchoolsPageUS19_20.submit.click();
    }

    @And("kullanici ekranın üst kisminda hata uyarisi gorur")
    public void kullaniciEkranınÜstKismindaHataUyarisiGorur() {
        Assert.assertTrue(managementOnSchoolsPageUS19_20.hataUyarisi.isDisplayed());

    }


    @And("kullanici <Date of Meet> kismina bugunden sonra olacak sekilde gecerli bir tarih girer")
    public void kullaniciDateOfMeetKisminaBugundenSonraOlacakSekildeGecerliBirTarihGirer() {
        managementOnSchoolsPageUS19_20.date.sendKeys("10","02","2025");
    }

    @And("kullanici ekranin ust kisminda Meet saved successfully onay mesajini gorur")
    public void kullaniciEkraninUstKismindaMeetSavedSuccessfullyOnayMesajiniGorur() {
        Assert.assertTrue(managementOnSchoolsPageUS19_20.onayMesaji.isDisplayed());
    }
    // US20 başlar
    @And("kullanici toplanti listesi icin Meet List yazisini gorur")
    public void kullaniciToplantiListesiIcinMeetListYazisiniGorur() {

       //ReusableMethods.scroll(managementOnSchoolsPageUS19_20.meetListYazisi);
       // Actions actions = new Actions(Driver.getDriver());
       // actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN);
        Assert.assertTrue(managementOnSchoolsPageUS19_20.meetListYazisi.isDisplayed());

    }


    @And("kullanici Meet List tabosundaki Students'ın altında ogrenci ismini gorur")
    public void kullaniciMeetListTabosundakiStudentsInAltındaOgrenciIsminiGorur() {
        Assert.assertTrue(managementOnSchoolsPageUS19_20.ogrenciIsmi.isDisplayed());


    }

    @And("kullanici Meet List tabosundaki Date'in altında tarih gorur")
    public void kullaniciMeetListTabosundakiDateInAltındaTarihGorur() {
        Assert.assertTrue(managementOnSchoolsPageUS19_20.dateTablodaki.isDisplayed());
    }

    @And("kullanici Meet List tabosundaki Start Time'ın altında toplanti baslama saatini gorur")
    public void kullaniciMeetListTabosundakiStartTimeInAltındaToplantiBaslamaSaatiniGorur() {
        Assert.assertTrue(managementOnSchoolsPageUS19_20.baslamaSaati.isDisplayed());
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN);

    }

    @And("kullanici guncellemek istedigi toplanti ait ogrencinin sirasindaki Edit butonuta tiklar")
    public void kullaniciGuncellemekIstedigiToplantiAitOgrencininSirasindakiEditButonutaTiklar() {
        managementOnSchoolsPageUS19_20.editButonu.sendKeys(Keys.ENTER);

    }


    @And("kullanici edit penceresinin açıldığını gorur")
    public void kullaniciEditPenceresininAçıldığınıGorur() {
        assert managementOnSchoolsPageUS19_20.editMeetYazisi.isDisplayed();
    }


    @And("kullanici yeni bir ogrenci ekler")
    public void kullaniciYeniBirOgrenciEkler() {
        managementOnSchoolsPageUS19_20.yeniOgrenciEkleme.click();
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys("Ali Aydin",Keys.ENTER).perform();
    }

    @And("kullanici onaylamak icin Submit butonuna tiklar")
    public void kullaniciOnaylamakIcinSubmitButonunaTiklar() {
        managementOnSchoolsPageUS19_20.onayIcinEditSubmit.sendKeys(Keys.ENTER);
    }

    @And("kullanici ekranin ust kisminda Meet updated successfully mesajini gorur")
    public void kullaniciEkraninUstKismindaMeetUpdatedSuccessfullyMesajiniGorur() {
        assert Driver.getDriver().switchTo().alert().getText().contains("Meet Updated Successfully");
    }

    @And("kullanici Edit Meet penceresinde Date Of Meet kısmındaki tarih kısmına tıklar ve yeni tarih girer")
    public void kullaniciEditMeetPenceresindeDateOfMeetKısmındakiTarihKısmınaTıklarveYeniTarihGirer() {
        managementOnSchoolsPageUS19_20.dateEdit.sendKeys("16","11","2023");

    }

    @And("kullanici Start Time kısmına toplanti baslama saatini girer")
    public void kullaniciStartTimeKısmınaToplantiBaslamaSaatiniGirer() {
        managementOnSchoolsPageUS19_20.startTimeEdit.sendKeys("17","00");
    }


    @And("kullanici Stop Time kısmına toplanti bitis saatini girer")
    public void kullaniciStopTimeKısmınaToplantiBitisSaatiniGirer() {
        managementOnSchoolsPageUS19_20.stopTimeEdit.sendKeys("19","00");
    }


    @And("kullanici güncelleme yapılmadiğina dair hata mesajini gorur")
    public void kullaniciGuncellemeYapılmadiginaDairHataMesajiniGorur() {
        assert Driver.getDriver().switchTo().alert().getText().contains("JSON parse error: Cannot deserialize value of type");
    }

    @And("kullanici Description kismina açiklamayi siler ve yeni açiklama girer")
    public void kullaniciDescriptionKisminaAciklamayiSilerveYeniAçiklamaGirer() {
        managementOnSchoolsPageUS19_20.descriptionEdit.clear();
        ReusableMethods.bekle(1);
        managementOnSchoolsPageUS19_20.descriptionEdit.sendKeys("EditDes");
    }


    @And("kullanici Time verileri eski halini almasi icin Edit penceresini kapatir ve yeniden acar")
    public void kullaniciTimeVerileriEskiHaliniAlmasiIcinEditPenceresiniKapatirVeYenidenAcar() {
        managementOnSchoolsPageUS19_20.cikisEdit.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(2);
        managementOnSchoolsPageUS19_20.editButonu.sendKeys(Keys.ENTER);

    }

    @And("kullanici Edit Meet penceresini kapatir")
    public void kullaniciEditMeetPenceresiniKapatir() {
        managementOnSchoolsPageUS19_20.cikisEdit.sendKeys(Keys.ENTER);
    }

    @And("kullanici Meet List eklenen meet'i silmek için taploda sağ tarafta bulunan kırmızı çöp kutusuna tıklar ve siler")
    public void kullaniciMeetListEklenenMeetISilmekIcinTaplodaSagTaraftaBulunanKırmızıCopKutusunaTıklarVeSiler() {
        managementOnSchoolsPageUS19_20.silmeButonu.click();
    }

    @And("kullanici ekranin ust kisminda Meet deleted succesfully yazisini gorur")
    public void kullaniciEkraninUstKismindaMeetDeletedSuccesfullyYazisiniGorur() {
        assert Driver.getDriver().switchTo().alert().getText().contains("Meet deleted succesfully");

    }

   @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

}



