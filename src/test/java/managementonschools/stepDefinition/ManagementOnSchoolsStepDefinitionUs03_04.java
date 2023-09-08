package managementonschools.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagementOnSchoolsPageUs03_04;

import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.apache.poi.ss.formula.functions.T;t
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagementOnSchoolsStepDefinitionUs03_04 {

    ManagementOnSchoolsPageUs03_04 managementOnSchools = new ManagementOnSchoolsPageUs03_04();

    @Given(": kullanici managementonschool sayfasina gider")
    public void kullaniciManagementonschoolSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
        ReusableMethods.bekle(3);
    }

    @Then("Login butonuna tıklar")
    public void loginButonunaTıklar() {
        managementOnSchools.login.click();
        ReusableMethods.bekle(3);   }
    @Then("Password bilgilerini gir")
    public void passwordBilgileriniGir() {
    }
    @Then("Navbar da bulunan Contact kısmına tıklar")
    public void navbarDaBulunanContactKısmınaTıklar() {
        managementOnSchools.contactbutton.click();
        ReusableMethods.bekle(1);
    }

    @Then("User Name  ve password bilgilerini gir")
    public void userNameVePasswordBilgileriniGir() {
        managementOnSchools.username.sendKeys("DeanTeam06", Keys.TAB, "Team0612");
        ReusableMethods.bekle(1);

    }

    @Then("Login'e tıkla")
    public void loginETıkla() {
        managementOnSchools.loginButton.click();
    }

    @Given(": Kullanıcı Your Name {string} kısmına bilgileri yazar")
    public void kullanıcıYourNameKısmınaBilgileriYazar(String string) {
        managementOnSchools.yourName.sendKeys(string);
        ReusableMethods.bekle(1);
    }

    @Then(": Kullanıcı Your Email {string} kısmına bilgileri yazar")
    public void kullanıcıYourEmailKısmınaBilgileriYazar(String string) {
        managementOnSchools.yourEmail.sendKeys(string);
        ReusableMethods.bekle(2);

    }

    @Then(": Kullanıcı Subject {string} kısmına bilgileri yazar")
    public void kullanıcıSubjectKısmınaBilgileriYazar(String string) {
        managementOnSchools.Subject.sendKeys(string);
        ReusableMethods.bekle(2);
    }

    @Then(": Kullanıcı Mesage {string} kısmına bilgileri yazar")
    public void kullanıcıMesageKısmınaBilgileriYazar(String string) {
        managementOnSchools.Message.sendKeys(string);
        ReusableMethods.bekle(2);
    }

    @Then(": Kullanıcı Send Mesaj Buttonuna tıklar")
    public void kullanıcıSendMesajButtonunaTıklar() {
        ReusableMethods.scroll(managementOnSchools.sendMessage);
        ReusableMethods.click(managementOnSchools.sendMessage);
        ReusableMethods.bekle(2);
    }

    @Then(": {string} yazısının görüldüğünü doğrula.")
    public void yazısınınGoruldugunuDogrula(String string) {
        Assert.assertTrue(managementOnSchools.assertName.getText().contains(string));
        ReusableMethods.bekle(2);

    }

    @And(": Sayfayı kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @Then(": {string} yazısının Your Email kısmı için görüldüğünü doğrula.")
    public void yazısınınYourEmailKısmıIcinGoruldugunuDogrula(String string) {
        Assert.assertTrue(managementOnSchools.assertEmail.isDisplayed());
        ReusableMethods.bekle(2);

    }

    @Then(": {string} yazısının her iki kısım için görüldüğünü doğrula.")
    public void yazısınınHerIkiKısımIcinGoruldugunuDogrula(String string) {
        Assert.assertTrue(managementOnSchools.assertSubject.isDisplayed());
       // ReusableMethods.bekle(2);
       // Assert.assertTrue(managementOnSchools.assertMessage.isDisplayed());
       // ReusableMethods.bekle(2);

    }



}
