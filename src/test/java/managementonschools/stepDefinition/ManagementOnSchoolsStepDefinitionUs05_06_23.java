package managementonschools.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managementonschools.pages.ManagementOnSchoolsPageUs03_04;
import managementonschools.pages.ManagementOnSchoolsPageUs05_06_23;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ManagementOnSchoolsStepDefinitionUs05_06_23 {
    ManagementOnSchoolsPageUs05_06_23 pageUs05_06_23 = new ManagementOnSchoolsPageUs05_06_23();

    @Given("kullanici anasayfaya giderr")
    public void kullaniciAnasayfayaGiderr() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
        ReusableMethods.bekle(3);
    }

    @When("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        pageUs05_06_23.login.click();
        ReusableMethods.bekle(3);
    }

    @And("kullanici admin olarak giris yapar")
    public void kullaniciAdminOlarakGirisYapar() {
        pageUs05_06_23.username.sendKeys("Team06Admin", Keys.TAB, "Team06Admin", Keys.TAB, Keys.ENTER);
    }

  // @And("kullanici {int} saniye bekler")
  // public void kullaniciSaniyeBekler(int arg0) {
  //     ReusableMethods.bekle(2);

  // }

    @And("kullanici sayfadaki Menu butonuna tiklar")
    public void kullaniciSayfadakiMenuButonunaTiklar() {
        pageUs05_06_23.menu.click();

    }

    @And("kullanici Main Menu alanından Dean Management Basligina tıklar")
    public void kullaniciMainMenuAlanındanDeanManagementBasliginaTıklar() {
        pageUs05_06_23.deanmanagement.click();

    }

    @And("kullanici Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görünür oldugunu dogrular")
    public void kullaniciDeanLerinNameGenderPhoneNumberSSNUserNameBilgileriniGörünürOldugunuDogrular() {
        Assert.assertTrue(pageUs05_06_23.nameGorunurMu.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.genderGorunurMu.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.pnumberGorunurMu.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.ssnGorunurMu.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.usernameGorunurMu.isDisplayed());
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {  Driver.closeDriver();
    }

    //***********************************************************************************

    @And("kullanici dean olarak giris yapar")
    public void kullaniciDeanOlarakGirisYapar() {
        pageUs05_06_23.username.sendKeys("DeanTeam06", Keys.TAB, "Team0612", Keys.TAB, Keys.ENTER);
    }


    @And("kullanici {string},{string},{string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String name, String surname, String birthPlaace) {
        pageUs05_06_23.nameKutusu.sendKeys("ahgka", Keys.TAB, "veghka", Keys.TAB, "kggs", Keys.TAB);
    }

    @And("kullanici {string} seçer")
    public void kullaniciSeçer(String arg0) {
        pageUs05_06_23.female.click();
    }

    @And("kullanici {string},{string},{string},{string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String birthday, String phoneNumber, String ssnValue, String username) {
        pageUs05_06_23.birthdayy.sendKeys("01.02.1987", Keys.TAB, "185-154-1449", Keys.TAB, "786-55-1275", Keys.TAB, "axgh", Keys.TAB, "123456As.");
    }

    @And("kullanici {string} tiklar")
    public void kullaniciTiklar(String arg0) {
        pageUs05_06_23.submit.click();
    }

    @And("kullanici Vice Dean saved\" mesajının görüldüğünü doğrular")
    public void kullaniciViceDeanSavedMesajınınGörüldüğünüDoğrular() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        Assert.assertTrue(pageUs05_06_23.viceDeanManagementSaved.isDisplayed());
    }


    //*********************************************************************************************
    @And("kullanici {string},{string},{string},{string},{string},{string},{string},{string} bilgilerini bos birakir")
    public void kullaniciBilgileriniBosBirakir(String name, String surname, String birthPlace, String genderType, String birthday, String phoneNumber, String ssnValue, String username) {
        pageUs05_06_23.nameKutusu.sendKeys("", Keys.TAB, "", Keys.TAB, "", Keys.TAB, "", Keys.TAB, "", Keys.TAB, "",
                Keys.TAB, "",Keys.TAB,"", Keys.TAB);

    }


    @And("kullanici {string} alanina sekiz karakterden az password girer ve submit tiklar")
    public void kullaniciAlaninaSekizKarakterdenAzPasswordGirerVeSubmitTiklar(String password) {
        pageUs05_06_23.password.sendKeys("9874563");
        pageUs05_06_23.submit.click();
    }

    @And("kullanici Vice Dean hesabı oluşturulamadığını doğrular")
    public void kullaniciViceDeanHesabıOluşturulamadığınıDoğrular() {
        Assert.assertTrue(pageUs05_06_23.nameRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.surnameRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.birthpRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.dateRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.phoneRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.ssnRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.usernameRequired.isDisplayed());
        Assert.assertTrue(pageUs05_06_23.Atleast8Characters.isDisplayed());
    }


    //************************************************************************************


    @And("kullanici {string},{string},{string},{string},{string},{string},{string} bilgilerini gir")
    public void kullaniciBilgileriniGir(String name, String surname, String birthPlace, String birthday, String phoneNumber, String ssnValue, String username) {
        pageUs05_06_23.nameKutusu.sendKeys("fxgc", Keys.TAB, "dhfx", Keys.TAB, "cfhgjh",Keys.TAB, Keys.TAB, "01.01.1960", Keys.TAB, "897-545-6875",
                Keys.TAB, "754-66-1235",Keys.TAB,"asdfgf", Keys.TAB);

    }

    @And("kullanici {string} seçimi yapar")
    public void kullaniciSeçimiYapar(String arg0) {
        pageUs05_06_23.female.click();
    }
    @And("kullanici {string} alanina sekiz karakterli küçük har içermeyen password girer ve submit tiklar")
    public void kullaniciAlaninaSekizKarakterliKüçükHarIçermeyenPasswordGirerVeSubmitTiklar(String arg0) {
        pageUs05_06_23.password.sendKeys("654789A.");
        pageUs05_06_23.submit.click();
    }

    @And("kullanici Vice Dean hesabı oluşturulamadığını doğrularr")
    public void kullaniciViceDeanHesabıOluşturulamadığınıDoğrularr() {
        pageUs05_06_23.OneLowerrCaseCharacterPassword.isDisplayed();

    }


    @And("kullanici {string} alanina sekiz karakterli büyük harf içermeyen password girer ve submit tiklar")
    public void kullaniciAlaninaSekizKarakterliBüyükHarfIçermeyenPasswordGirerVeSubmitTiklar(String arg0) {
        pageUs05_06_23.password.sendKeys("654789a.");
    }

    @And("kullanici Vice Dean hesabı oluşturulamadığını doğrularrr")
    public void kullaniciViceDeanHesabıOluşturulamadığınıDoğrularrr() {
        pageUs05_06_23.OneUpperCaseCharacterPassword.isDisplayed();
    }

    @And("kullanici Menu alanından Vice Dean Management Basligina tıklar")
    public void kullaniciMenuAlanındanViceDeanManagementBasliginaTıklar() {
        pageUs05_06_23.viceDeanManagement.click();
    }


    //***********************************************************************************
}