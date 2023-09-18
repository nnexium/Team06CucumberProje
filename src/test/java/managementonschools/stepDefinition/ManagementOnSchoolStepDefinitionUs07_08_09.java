package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagamentOnSchoolsPageUs07_08_09;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ManagementOnSchoolStepDefinitionUs07_08_09 {
    ManagamentOnSchoolsPageUs07_08_09 managamentOnSchoolsPageUs070809 = new ManagamentOnSchoolsPageUs07_08_09();
    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @Then("Login kutusuna tiklar")
    public void loginKutusunaTiklar() {
      managamentOnSchoolsPageUs070809.login.click();
    }
    @And("UserName kutusuna {string} yazar")
    public void usernameKutusunaYazar(String arg0) {
        if (arg0.equals("deanUserName")) {
            managamentOnSchoolsPageUs070809.userName.sendKeys(ConfigReader.getProperty("deanUserName"));

        } else {

            managamentOnSchoolsPageUs070809.userName.sendKeys(ConfigReader.getProperty("viceDeanUserName"));
        }
    }

    @And("Password kutusuna {string} yazar")
    public void passwordKutusunaYazar(String arg0) {
        if (arg0.equals("deanSifre")) {
            managamentOnSchoolsPageUs070809.password.sendKeys(ConfigReader.getProperty("deanSifre"));
        } else {
            managamentOnSchoolsPageUs070809.password.sendKeys(ConfigReader.getProperty("viceDeanSifre"));
        }
    }

    @And("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        managamentOnSchoolsPageUs070809.loginButton.click();
    }


    @And("Kullanici anasayfada {string} yazisini görür")
    public void kullaniciAnasayfadaYazisiniGörür(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.HiMesaji.isDisplayed());



    }

    @And("Kullanici Menu butonunu tiklar")
    public void kullaniciMenuButonunuTiklar() {
        managamentOnSchoolsPageUs070809.Menu.click();
    }

    @And("Kullanici Contact Get All butonunu tiklar")
    public void kullaniciContactGetAllButonunuTiklar() {
        managamentOnSchoolsPageUs070809.contactGetAll.click();
    }

    @And("Kullanici gönderilen mesajları görür")
    public void kullaniciGönderilenMesajlarıGörür() {

        Assert.assertTrue(managamentOnSchoolsPageUs070809.message.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.konu.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.email.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.tarih.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.isim.isDisplayed());

    }

    @And("Kullanici Silme butonu göremez ve silme işlemini yapamaz")
    public void kullaniciSilmeButonuGöremezVeSilmeIşleminiYapamaz() {
        String name = "Kullanici Silme butonu göremez ve silme işlemini yapamaz";
        ReusableMethods.tumSayfaResmi(name);


    }

    @And("Kullanici Lessons butonunu tiklar")
    public void kullaniciLessonsButonunuTiklar() {
managamentOnSchoolsPageUs070809.lessons.click();
    }

    @And("Kullanici Lesson Name kutusuna {string} yazar")
    public void kullaniciLessonNameKutusunaYazar(String arg0) {
        if (arg0.equals("lessonName")) {
            Faker faker = new Faker();
            managamentOnSchoolsPageUs070809.lessonNameKutusu.sendKeys(faker.name().firstName());
        } else {
            managamentOnSchoolsPageUs070809.lessonNameKutusu.sendKeys("");
        }
    }
    @And("Kullanici Compulsory butonunu {string}")
    public void kullaniciCompulsoryButonunu(String arg0) {
        if (arg0.equals("isaretler")){
            managamentOnSchoolsPageUs070809.compulsoryButonu.click();

        }
        else {

        }
    }


    @And("Kullanici Credit Score butonuna {string} yazar")
    public void kullaniciCreditScoreButonunaYazar(String arg0) {
        if (arg0.equals("creditScore")) {
            Random random = new Random();
            int min = 1;
            int max = 20;
            String creditScore = String.valueOf(random.nextInt(max - min + 1) + min);
            managamentOnSchoolsPageUs070809.creditScoreKutusu.sendKeys(creditScore);
        } else {

            managamentOnSchoolsPageUs070809.creditScoreKutusu.sendKeys("");
        }
    }


    @And("Kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        managamentOnSchoolsPageUs070809.submitButonu.click();

    }

    @And("Kullanici {int}sn bekler")
    public void kullaniciSnBekler(int arg0) {
        ReusableMethods.bekle(2);
    }

    @And("Kullanici {string} yazisini görür")
    public void kullaniciYazisiniGörür(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonCreatedMesaji.isDisplayed());

        String name = "Kullanıcı 'Lesson Created' mesajını görür";
        ReusableMethods.tumSayfaResmi(name);
    }


    @And("Kullanici {string} yazisini gorur")
    public void kullaniciYazisiniGorur(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonManagementYazisi.isDisplayed());

    }


    @And("Kullanici Lesson Name kutusunun altindaki {string} yazisini gorur")
    public void kullaniciLessonNameKutusununAltindakiYazisiniGorur(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonNameResquiredMesaji.isDisplayed());

        String name = "Kullanıcı Lesson Name kutusunu boş bırakamaz";
        ReusableMethods.tumSayfaResmi(name);
    }

    @And("Kullanici Credit Score kutusunun altindaki {string} yazisini gorur")
    public void kullaniciCreditScoreKutusununAltindakiYazisiniGorur(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.creditScoreRequiredMesaji.isDisplayed());

        String name = "Kullanıcı Credit Score kutusunu boş bırakamaz";
        ReusableMethods.tumSayfaResmi(name);

    }

    @And("Kullanici sayfayi assagi kaydirip Lesson List i gorur")
    public void kullaniciSayfayiAssagiKaydiripLessonListIGorur() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,200);
        actions.perform();

      //  Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonList.isDisplayed());



    }
    @And("Kullanici Lesson Name,Credit Score ve Compulsory gorur")
    public void kullaniciLessonNameCreditScoreVeCompulsoryGorur() {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonName.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.compulsory.isDisplayed());
        Assert.assertTrue(managamentOnSchoolsPageUs070809.creditScore.isDisplayed());
    }

    @And("Kullanici sayfayi assagi kaydirip >>butonuna tiklar")
    public void kullaniciSayfayiAssagiKaydiripButonunaTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,1000);
        actions.perform();

        managamentOnSchoolsPageUs070809.listeSonuButonu.click();
    }


        @And("Kullanici Delete butonunu gorur ve tiklar")
    public void kullaniciDeleteButonunuGorurVeTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(managamentOnSchoolsPageUs070809.deleteButonu).perform();
        Assert.assertTrue(managamentOnSchoolsPageUs070809.deleteButonu.isDisplayed());

        managamentOnSchoolsPageUs070809.deleteButonu.click();


    }

    @And("Kullanici {string} mesajini gorur")
    public void kullaniciMesajiniGorur(String arg0) {

        String name = "Kullanıcı 'Lesson Deleted' mesajını görür";
        ReusableMethods.tumSayfaResmi(name);
    }

        @And("Kullanici ders bilgilerini guncelle butonunu goremez ve ders bilgilerini guncelleyemez")
        public void kullaniciDersBilgileriniGuncelleButonunuGoremezVeDersBilgileriniGuncelleyemez () {


            String str = "Kullanici ders bilgilerini guncelle butonunu goremez ve ders bilgilerini guncelleyemez";
            ReusableMethods.tumSayfaResmi(str);
        }
    }


