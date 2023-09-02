package managementonschools.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagementOnSchoolsPageUs01_02;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;

public class ManagementOnSchoolsStepDefinitionUs01_02 {

    ManagementOnSchoolsPageUs01_02 managementOnSchoolsPage = new ManagementOnSchoolsPageUs01_02();
    @Given("kullanici ana sayfaya gider")
    public void kullanicianasayfayagider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @Then("kullanici register butonuna tiklar")
    public void kullaniciregisterbutonunatiklar() {
        managementOnSchoolsPage.register.click();
    }


    @And("kullanici name girer")
    public void kullanicinamegirer() {
        managementOnSchoolsPage.studentName.sendKeys("fatih");
    }

    

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
       Driver.closeDriver();
    }
}
