package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagamentOnSchoolsPageUs07_08_09;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;

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
        ReusableMethods.tumSayfaResmi("managementonschoolsUrl");

    }

    @And("Kullanici Lessons butonunu tiklar")
    public void kullaniciLessonsButonunuTiklar() {

        managamentOnSchoolsPageUs070809.lessons.click();
    }

    @And("Kullanici Lesson Name kutusuna {string} yazar")
    public void kullaniciLessonNameKutusunaYazar(String arg0) {
        Faker faker = new Faker();
       // String lessonName = faker.name().toString();
        managamentOnSchoolsPageUs070809.lessonNameKutusu.sendKeys(faker.name().firstName());
    }


    @And("Kullanici Compulsory butonunu isaretler")
    public void kullaniciCompulsoryButonunuIsaretler() {
        managamentOnSchoolsPageUs070809.compulsoryButonu.click();
    }

    @And("Kullanici Credit Score butonuna {string} yazar")
    public void kullaniciCreditScoreButonunaYazar(String arg0) {
        Random random = new Random();
        int min = 1;
        int max = 20;
        String creditScore = String.valueOf(random.nextInt(max - min + 1) + min);
        managamentOnSchoolsPageUs070809.creditScoreKutusu.sendKeys(creditScore);
    }


    @And("Kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        managamentOnSchoolsPageUs070809.submitButonu.click();

    }

    @But("Kullanici {int}sn bekler")
    public void kullaniciSnBekler(int arg0) {
        ReusableMethods.bekle(2);
    }

    @And("Kullanici {string} yazisini görür")
    public void kullaniciYazisiniGörür(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonCreatedMesaji.isDisplayed());
    }


    @And("Kullanici {string} yazisini gorur")
    public void kullaniciYazisiniGorur(String arg0) {
        Assert.assertTrue(managamentOnSchoolsPageUs070809.lessonManagementYazisi.isDisplayed());

    }

    @And("Kullanici Lesson Name kutusunu bos birakir")
    public void kullaniciLessonNameKutusunuBosBirakir() {
        managamentOnSchoolsPageUs070809.lessonNameKutusu.sendKeys(null);
    }

    @And("Kullanici Compulsory butonunu bos birakir")
    public void kullaniciCompulsoryButonunuBosBirakir() {
        managamentOnSchoolsPageUs070809.compulsoryButonu.sendKeys(null);
    }

    @And("Kullanici Lesson Name kutusunun altindaki {string} yazisini gorur")
    public void kullaniciLessonNameKutusununAltindakiYazisiniGorur(String arg0) {
    }
}
