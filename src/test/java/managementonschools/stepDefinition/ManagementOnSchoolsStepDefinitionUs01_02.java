package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managementonschools.pages.ManagementOnSchoolsPageUs01_02;
import managementonschools.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ManagementOnSchoolsStepDefinitionUs01_02 {
    Faker faker = new Faker();
    ManagementOnSchoolsPageUs01_02 pages = new ManagementOnSchoolsPageUs01_02();
    @Given("Kullanici {string} sayfasina gider.")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Given("Kullanici Register Butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        pages.homePageRegisterButton.click();

    }

    

    @When("Girer name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void girerNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String assn , String username, String password) {


    }

    @Then("Register Butonuna tiklar")
    public void registerButonunaTiklar() {
    }




    @And("{string} yazisinin göründüğünü doğrula.")
    public void yazisininGorundugunuDogrula(String arg0) {
    }
}
