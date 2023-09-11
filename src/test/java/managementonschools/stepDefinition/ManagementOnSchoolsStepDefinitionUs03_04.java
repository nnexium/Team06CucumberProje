package managementonschools.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagementOnSchoolsPageUs03_04;

import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.apache.poi.ss.formula.functions.T;
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
        ReusableMethods.bekle(2);
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

    @Then("Admin User Name  ve Admin password bilgilerini gir")
    public void adminUserNameVeAdminPasswordBilgileriniGir() {

    }
    @Then("Sol tarafta açılan {string} kısmına tıklar")
    public void solTaraftaAcılanKısmınaTıklar(String arg0) {
        managementOnSchools.menuButton.click();
        managementOnSchools.adminManagement.click();
    }

    @Given(": Kullanıcı Name {string} kısmına bilgileri yazar")
    public void kullanıcıNameKısmınaBilgileriYazar(String arg0) {
    }

    @Then(": Kullanıcı Surname {string} kısmına bilgileri yazar")
    public void kullanıcıSurnameKısmınaBilgileriYazar(String arg0) {
    }

    @Then(": Kullanıcı BirthPlace kısmına bilgileri yazar")
    public void kullanıcıBirthPlaceKısmınaBilgileriYazar() {
    }

    @Then(": Gender kısmında cinsiyet seçili olmadığını gör")
    public void genderKısmındaCinsiyetSeciliOlmadıgınıGor() {
    }

    @Then(": Gender Kısmında cinsiyet seçimini yap")
    public void genderKısmındaCinsiyetSeciminiYap() {
    }

    @Then(": Kullanıcı Doğum Tarihi seçer")
    public void kullanıcıDogumTarihiSecer() {
    }

    @Then(": Kullanıcı Phone {string} bilglerini yazar")
    public void kullanıcıPhoneBilgleriniYazar(String arg0) {
    }

    @Then(": Kullanıcı SSN no {string} bilgilerini yazar")
    public void kullanıcıSSNNoBilgileriniYazar(String arg0) {
    }

    @Then(": Kullanıcı User Name {string} bilgilerini yazar")
    public void kullanıcıUserNameBilgileriniYazar(String arg0) {
    }

    @Then(": Kullanıcı Password {string} bilgilerini yazar")
    public void kullanıcıPasswordBilgileriniYazar(String arg0) {
    }

    @Then(": Kullanıcı Submit Buttonuna tıklar")
    public void kullanıcıSubmitButtonunaTıklar() {
    }

    @Then(": Kullanıcı Başarı ile Dean kayıt edildiği mesajınının görüldüğünü doğrula")
    public void kullanıcıBasarıIleDeanKayıtEdildigiMesajınınınGoruldugunuDogrula() {
    }

    @Then(": Kullanıcı Phone {string} bilglerini rakamlar arasında {string} işareti olmadan yazar")
    public void kullanıcıPhoneBilgleriniRakamlarArasındaIsaretiOlmadanYazar(String arg0) {
    }

    @Then(": Kullanıcı SSN no {string} bilglerini rakamlar arasında {string} işareti olmadan yazar")
    public void kullanıcıSSNNoBilgleriniRakamlarArasındaIsaretiOlmadanYazar(String arg0) {
    }

    @Then(": Kullanıcı çıkan hata mesajının göründüğünü doğrula")
    public void kullanıcıCıkanHataMesajınınGorundugunuDogrula() {
    }

    @Then("us gir pas gir")
    public void usGirPasGir() {
        managementOnSchools.username.sendKeys("AdminBatch151 ", Keys.TAB, "Batch151+");
        ReusableMethods.bekle(2);
    }


}
