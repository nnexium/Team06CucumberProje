package managementonschools.stepDefinition.ui_Step_Def;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import managementonschools.pages.ManagementOnSchoolsPageUs03_04;

import managementonschools.pojos.us_03_04.us04.DeanPostPojo;
import managementonschools.pojos.us_03_04.us04.ResponsePojo;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ManagementOnSchoolsStepDefinitionUs03_04 {

    DeanPostPojo expectedData;
    Response response;
    ResponsePojo actualData;

    ManagementOnSchoolsPageUs03_04 managementOnSchools = new ManagementOnSchoolsPageUs03_04();

    @Given(": kullanici managementonschool sayfasina gider")
    public void kullaniciManagementonschoolSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
        ReusableMethods.bekle(3);
    }

    @Then("Login butonuna tıklar")
    public void loginButonunaTıklar() {
        managementOnSchools.login.click();
        ReusableMethods.bekle(3);
    }

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
        ReusableMethods.bekle(3);
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
        ReusableMethods.bekle(2);
        // Assert.assertTrue(managementOnSchools.assertMessage.isDisplayed());
        // ReusableMethods.bekle(2);

    }

    @Then("Sol tarafta açılan {string} kısmına tıklar")
    public void solTaraftaAcılanKısmınaTıklar(String arg0) {
        ReusableMethods.scroll(managementOnSchools.deanEnter);
        ReusableMethods.bekle(2);
        ReusableMethods.click(managementOnSchools.deanEnter);
        ReusableMethods.bekle(2);
    }

    @Given(": Kullanıcı Name {string} kısmına bilgileri yazar")
    public void kullanıcıNameKısmınaBilgileriYazar(String string) {
        managementOnSchools.nameEnter.sendKeys(string);
    }


    @Then(": Kullanıcı BirthPlace kısmına bilgileri yazar")
    public void kullanıcıBirthPlaceKısmınaBilgileriYazar() {
        managementOnSchools.birthPlace.sendKeys("San Diego");

    }

    @Then(": Gender kısmında cinsiyet seçili olmadığını gör")
    public void genderKısmındaCinsiyetSeciliOlmadıgınıGor() {
        managementOnSchools.femaleGender.isSelected();
        ReusableMethods.bekle(1);
        managementOnSchools.maleGender.isSelected();
        ReusableMethods.bekle(1);
    }

    @Then(": Gender Kısmında cinsiyet seçimini yap")
    public void genderKısmındaCinsiyetSeciminiYap() {
        managementOnSchools.maleGender.click();
        ReusableMethods.bekle(1);
    }

    @Then(": Kullanıcı Doğum Tarihi seçer")
    public void kullanıcıDogumTarihiSecer() {
        managementOnSchools.birthDayselect.sendKeys("1984-08-05");
        ReusableMethods.bekle(1);
    }

    @Then(": Kullanıcı Phone {string} bilglerini yazar")
    public void kullanıcıPhoneBilgleriniYazar(String Phone) {
        managementOnSchools.phoneNumber.sendKeys(Phone);
        ReusableMethods.bekle(2);
    }

    @Then(": Kullanıcı SSN no {string} bilgilerini yazar")
    public void kullanıcıSSNNoBilgileriniYazar(String SSN_no) {
        managementOnSchools.ssnNumber.sendKeys(SSN_no);
        ReusableMethods.bekle(1);
    }

    @Then(": Kullanıcı User Name {string} bilgilerini yazar")
    public void kullanıcıUserNameBilgileriniYazar(String arg0) {
        managementOnSchools.UserName.sendKeys("Team");
    }

    @Then(": Kullanıcı Password {string} bilgilerini yazar")
    public void kullanıcıPasswordBilgileriniYazar(String arg0) {
        managementOnSchools.password.sendKeys("Team0612");
    }

    @Then(": Kullanıcı Submit Buttonuna tıklar")
    public void kullanıcıSubmitButtonunaTıklar() {
        managementOnSchools.submitButton.click();
        ReusableMethods.bekle(2);
    }

    @Then(": Kullanıcı Başarı ile Dean kayıt edildiği mesajınının görüldüğünü doğrula")
    public void kullanıcıBasarıIleDeanKayıtEdildigiMesajınınınGoruldugunuDogrula() {
        Assert.assertTrue(managementOnSchools.assertEmail.isDisplayed());
    }

    @Then(": Kullanıcı Phone {string} bilglerini rakamlar arasında - işareti olmadan yazar")
    public void kullanıcıPhoneBilgleriniRakamlarArasındaIsaretiOlmadanYazar(String Phone) {
        managementOnSchools.phoneNumber.sendKeys(Phone);
        ReusableMethods.bekle(2);
    }

    @Then(": Kullanıcı SSN no {string} bilglerini rakamlar arasında - işareti olmadan yazar")
    public void kullanıcıSSNNoBilgleriniRakamlarArasındaIsaretiOlmadanYazar(String SSN_no) {

    }

    @Then(": Kullanıcı çıkan hata mesajının göründüğünü doğrula")
    public void kullanıcıCıkanHataMesajınınGorundugunuDogrula() {
        Assert.assertTrue(managementOnSchools.assertEmail.isDisplayed());

    }

    @Then("kullanıcı bilgileri gir")
    public void kullanıcıBilgileriGir() {
        managementOnSchools.enter.sendKeys("Team06Admin", Keys.TAB, "Team06Admin");
    }

    @But("Menu Butonuna Tıkla")
    public void menuButonunaTıkla() {
        ReusableMethods.click(managementOnSchools.menuButton);
        ReusableMethods.bekle(4);
    }

    @Then(": Kullanıcı Surname {string} kısmına bilgileri yazar")
    public void kullanıcıSurnameKısmınaBilgileriYazar(String string) {
        managementOnSchools.surname.sendKeys(string);

    }

    @Then(": Kullanıcı SSN no {string} bilglerini rakamlar arasında - tırnak işareti olmadan yazar")
    public void kullanıcıSSNNoBilgleriniRakamlarArasındaTırnakIsaretiOlmadanYazar(String SSN_no) {
        managementOnSchools.ssnNumber.sendKeys(SSN_no);
    }

}

/*
{
  "1984-08-05","San Diego","MALE","Dean","Team0612","538-528-3284","538-52-3284","Team","DeanTeam0606"
}


 */