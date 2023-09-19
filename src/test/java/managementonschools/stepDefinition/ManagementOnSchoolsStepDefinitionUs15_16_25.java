package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import managementonschools.pages.ManagementOnSchoolsPageUs15_16_25;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ManagementOnSchoolsStepDefinitionUs15_16_25 {
    ManagementOnSchoolsPageUs15_16_25 page151625 = new ManagementOnSchoolsPageUs15_16_25();
    Faker faker = new Faker();

    @Given("kullanici managementonschools sayfasina gider")
    public void kullaniciManagementonschoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @Then("login'e tikla")
    public void loginETikla() {
        page151625.login.click();
    }

    @Then("username alanina kullanici adi gir")
    public void usernameAlaninaKullaniciAdiGir() {
        page151625.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
    }

    @Then("password alanina sifre gir")
    public void passwordAlaninaSifreGir() {
        page151625.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
    }

    @Then("login butonuna tikla")
    public void loginButonunaTikla() {
        page151625.loginButon.click();
    }

    @Then("menu'ye tikla")
    public void menuYeTikla() {
        page151625.menu.click();
    }

    @Then("studentManagement'a tikla")
    public void studentmanagementATikla() {
        page151625.studentManagement.click();
    }

    @Then("choose teacher ddm'den ogretmen sec")
    public void chooseTeacherDdmDenOgretmenSec() {
        Actions actions = new Actions(Driver.getDriver());
        page151625.chooseTeacherDdm.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        ReusableMethods.bekle(2);
        page151625.advisorTeacher.click();
    }

    @And("name, surname, birthPlace, email, bilgilerini gir")
    public void nameSurnameBirthPlaceEmailBilgileriniGir() {
        page151625.name.sendKeys(faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,faker.nation().capitalCity(),Keys.TAB
        , faker.internet().emailAddress());
        String password = faker.internet().password(8,10,true,true,true);
        System.out.println("password = " + password);
    }

   @But("kullanici {int} saniye bekler")
   public void kullaniciIntSaniyeBekler(int sayi) {
       try {
           Thread.sleep(sayi*1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }

    @And("gender bolumunden cinsiyet sec")
    public void genderBolumundenCinsiyetSec() {
        page151625.gender.click();
    }

    @And("ogrenciPassword gir")
    public void ogrenciPasswordGir() {
        page151625.ogrenciPassword.sendKeys(faker.internet().password(8,9,true,true,true));
    }

    @And("phone number gir")
    public void phoneNumberGir() {
        String phoneNumber = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        page151625.phone.sendKeys(phoneNumber);
    }

    @And("dateOfBirth,ssn,userName,fatherName,motherName bilgilerini gir")
    public void dateofbirthSsnUserNameFatherNameMotherNamePasswordBilgileriniGir() {
        page151625.dateOfBirth.sendKeys("20.06.1998");
        page151625.ssn.sendKeys(faker.idNumber().ssnValid()
                ,Keys.TAB,faker.name().lastName()
                ,Keys.TAB,faker.name().firstName()
                ,Keys.TAB,faker.name().firstName());
    }

    @Then("submit butonuna tikla")
    public void submitButonunaTikla() {
        ReusableMethods.click(page151625.submitButon);
    }

    @And("student saved successfully mesajini gordugunu dogrula")
    public void studentSavedSuccessfullyMesajiniGordugunuDogrula() {
        Assert.assertTrue(page151625.studentSavedSuccessfully.isDisplayed());
        System.out.println("page.studentSavedSuccessfully.getText() = " + page151625.studentSavedSuccessfully.getText());
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }

    //US_15 TC02
    @And("name,surname, birthPlace, email, phone, dateOfBirth, ssn, userName, fatherName, motherName, password alanini bos birak")
    public void nameSurnameBirthPlaceEmailPhoneDateOfBirthSsnUserNameFatherNameMotherNamePasswordAlaniniBosBirak() {

    }

    @And("bos birakilan alanlara required uyarisinin geldigini dogrula")
    public void bosBirakilanAlanlaraRequiredUyarisininGeldiginiDogrula() {
        String name = "requiredUyarisi";
        ReusableMethods.tumSayfaResmi(name);
    }

    // US_16
    @Then("contact get all tikla")
    public void contactGetAllTikla() {
        page151625.contactGetAll.click();
    }

    @And("silme butonunun goruntulendigini dogrula")
    public void silmeButonununGoruntulendiginiDogrula() {
        String name = "silmeButonuYok";
        ReusableMethods.tumSayfaResmi(name);
    }

    @And("message bilgisinin goruntulendigini dogrula")
    public void messageBilgisininGoruntulendiginiDogrula() {
        Assert.assertTrue(page151625.messageBilgisi.isDisplayed());
    }

    @And("name bilgisinin goruntulendigini dogrula")
    public void nameBilgisininGoruntulendiginiDogrula() {
        Assert.assertTrue(page151625.nameBilgisi.isDisplayed());
    }

    @And("email bilgisinin goruntulendigini dogrula")
    public void emailBilgisininGoruntulendiginiDogrula() {
        Assert.assertTrue(page151625.emailBilgisi.isDisplayed());
    }

    @And("date bilgisinin goruntulendigini dogrula")
    public void dateBilgisininGoruntulendiginiDogrula() {
        Assert.assertTrue(page151625.dateBilgisi.isDisplayed());
    }

    @And("subject bilgisinin goruntulendigini dogrula")
    public void subjectBilgisininGoruntulendiginiDogrula() {
        Assert.assertTrue(page151625.subjectBilgisi.isDisplayed());
    }

    @Then("mesajlarin silinebildigini dogrula")
    public void mesajlarinSilinebildiginiDogrula() {
        String name = "mesajlarSilinemiyor";
        ReusableMethods.tumSayfaResmi(name);
    }

    // US_25
    @Then("username alanina admin kullanici adi gir")
    public void usernameAlaninaAdminKullaniciAdiGir() {
        page151625.username.sendKeys(ConfigReader.getProperty("adminUsername"));
    }

    @Then("password alanina admin sifre gir")
    public void passwordAlaninaAdminSifreGir() {
        page151625.password.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
}
