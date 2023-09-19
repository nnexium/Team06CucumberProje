
package managementonschools.stepDefinition.ui_Step_Def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managementonschools.pages.ManagementOnSchoolsPageUs21;
import managementonschools.pages.ManagementOnSchoolsPageUs22;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;


public class ManagementOnSchoolsStepDefinitionUs21_22 extends ReusableMethods {

    ManagementOnSchoolsPageUs21 managementOnSchoolsPageUs21 = new ManagementOnSchoolsPageUs21();

    @Given("kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

    }


    @Then("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        managementOnSchoolsPageUs21.loginButon.click();
    }


    @Then("kullanici username bilgilerini girer")
    public void kullaniciUsernameBilgileriniGirer() {
        managementOnSchoolsPageUs21.userNameKutusu.sendKeys(ConfigReader.getProperty("studentusername"));
        ReusableMethods.bekle(3);

    }

    @And("kullanici password bilgilerini girer")
    public void kullaniciPasswordBilgileriniGirer() {
        ManagementOnSchoolsPageUs21 managementOnSchoolsPageUs21 = null;
        managementOnSchoolsPageUs21.passwordKutusu.sendKeys(ConfigReader.getProperty("studentpassword"));
        ReusableMethods.bekle(3);
    }


    @And("kullanici username ve password ile giris icin login butonuna tiklar")
    public void kullaniciUsernameVePasswordIleGirisIcinLoginButonunaTiklar() {
        ManagementOnSchoolsPageUs21 managementOnSchoolsPageUs21 = null;
        managementOnSchoolsPageUs21.loginButonuUsernameVePassword.click();
        ReusableMethods.bekle(3);
    }


    @And("kullanici ders secebilmeli")
    public void chooselessonmenusunetiklar() {
        managementOnSchoolsPageUs21 = new ManagementOnSchoolsPageUs21();
        managementOnSchoolsPageUs21.dersSec.click();
        ReusableMethods.bekle(3);
    }


    @And("submit butonuna tiklamali")
    public void submitbutonunatiklar() {
        managementOnSchoolsPageUs21 = new ManagementOnSchoolsPageUs21();
        managementOnSchoolsPageUs21.submitButton1.click();
        ReusableMethods.bekle(3);
    }


//@Us22 admin olusturma


    ManagementOnSchoolsPageUs22 managementOnSchoolsPageUs22 = new ManagementOnSchoolsPageUs22();

    @Given("kullanici ana sayfaya git")
    public void kullaniciAnaSayfayaGit() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

    }


    @Then("kullanici login butonuna tikla")
    public void kullaniciLoginButonunaTikla() {
        managementOnSchoolsPageUs21.loginButon.click();
    }

    @Then("kullanici username bilgilerini gir")
    public void kullaniciUsernameBilgileriniGir() {
        managementOnSchoolsPageUs21.userNameKutusu.sendKeys(ConfigReader.getProperty("adminusername"));
        ReusableMethods.bekle(3);

    }

    @And("kullanici password bilgilerini gir")
    public void kullaniciPasswordBilgileriniGir() {
        ManagementOnSchoolsPageUs21 managementOnSchoolsPageUs21 = null;
        managementOnSchoolsPageUs21.passwordKutusu.sendKeys(ConfigReader.getProperty("adminpassword"));
        ReusableMethods.bekle(3);
    }


    @And("kullanici username ve password ile giris icin login butonuna tikla")
    public void kullaniciUsernameVePasswordIleGirisIcinLoginButonunaTikla() {
        managementOnSchoolsPageUs21.loginButonuUsernameVePassword.click();
        ReusableMethods.bekle(3);
    }



    @And("Name girilmelidir. Boş bırakılamaz.")
    public void kullaniciNameBilgileriniGirer() {
        managementOnSchoolsPageUs22.adminName.sendKeys("emre");
        ReusableMethods.bekle(2);
    }


    @And("Surname girilmelidir. Boş bırakılamaz.")
    public void kullaniciSurnameBilgileriniGirer() {
        managementOnSchoolsPageUs22.adminSurname.sendKeys("balli");
        ReusableMethods.bekle(2);
    }


    @And("Birth Place girilmelidir. Boş bırakılamaz.")
    public void kullaniciBirthPlaceBilgileriniGirer() {
        managementOnSchoolsPageUs22.birthPlace.sendKeys("turkey");
        ReusableMethods.bekle(2);
    }


    @And("Cinsiyet seçilmelidir. Boş bırakılamaz.")
    public void kullaniciCinsiyetBilgileriniGirer() {
        managementOnSchoolsPageUs22.gender.sendKeys("male");
        ReusableMethods.bekle(2);
    }


    @And("Doğum tarihi girilmelidir. Boş bırakılamaz.")
    public void kullaniciDogumBilgileriniGirer() {
        managementOnSchoolsPageUs22.dogumTarihi.sendKeys("12121212");
        ReusableMethods.bekle(2);
    }


    @And("Telefon numarası girilmelidir. Boş bırakılamaz.")
    public void kullaniciTelefonBilgileriniGirer() {
        managementOnSchoolsPageUs22.phoneNumber.sendKeys("333-333-3333");
        ReusableMethods.bekle(2);
    }


    @And("SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra \"-\" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.")
    public void kullaniciSSNBilgileriniGirer() {
        managementOnSchoolsPageUs22.ssnNumber.sendKeys("333-33-3333");
        ReusableMethods.bekle(2);
    }


    @And("Password girilmelidir. Password en az 8 karakterden oluşmalıdır.")
    public void kullaniciPasswordBilgileriniGire() {
        managementOnSchoolsPageUs21.passwordKutusu.sendKeys(ConfigReader.getProperty("adminpassword"));
        ReusableMethods.bekle(3);


    }

    @And("submit butonuna tikla")
    public void submitbutonunatikla() {
        managementOnSchoolsPageUs21 = new ManagementOnSchoolsPageUs21();
        managementOnSchoolsPageUs22.submit.click();
        ReusableMethods.bekle(3);

    }

    }


