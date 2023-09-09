package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managementonschools.pages.ManagementOnSchoolsPageUs01_02;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ManagementOnSchoolsStepDefinitionUs01_02 {
    Faker faker = new Faker();

    ManagementOnSchoolsPageUs01_02 pages0102 = new ManagementOnSchoolsPageUs01_02();

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanici Register Butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        pages0102.homePageRegisterButton.click();

    }


    @When("Girer name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void girerNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        name = faker.name().firstName();
        surname = faker.name().lastName();
        birth_place = faker.nation().capitalCity();

        gender = faker.dog().gender();
        phone_number = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        birth_day =""+ faker.date();
        ssn = faker.idNumber().ssnValid();
        username = faker.name().username();
        password = faker.internet().password();
        password = password + "@Ak47!?";


        pages0102.nameKutusu.sendKeys(name);
        pages0102.surnameKutusu.sendKeys(surname);
        pages0102.birthPlaceKutusu.sendKeys(birth_place);
        pages0102.phoneNumberKutusu.sendKeys(phone_number);

        if (gender.equalsIgnoreCase("male")) {
            pages0102.maleButton.click();
        } else {
            pages0102.femaleButton.click();
        }

        pages0102.birthDayKutusu.sendKeys(birth_day);
        pages0102.ssnKutusu.sendKeys(ssn);
        pages0102.usernameKutusu.sendKeys(username);
        pages0102.passwordKutusu.sendKeys(password);


    }

    @Then("Register Butonuna tiklar")
    public void registerButonunaTiklar() {
        pages0102.registerButonu.submit();
    }


    @And("'Guest User registired.' yazisinin göründüğünü doğrula")
    public void yazisininGorundugunuDogrula() {
        assert pages0102.verifyRegister.isDisplayed();
    }

    @Given("Admin {string} sayfasina gider")
    public void adminSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @When("Admin Login Butonuna tıklar")
    public void adminLoginButonunaTıklar() {
        pages0102.loginButtonu.click();
    }

    @And("Admin {string} alanına kayıtlı user name girer")
    public void adminAlanınaKayıtlıUserNameGirer(String username) {
        pages0102.loginUserName.sendKeys(ConfigReader.getProperty(username));
    }

    @And("Admin {string} alanına kayıtlı passwordünü girer")
    public void adminAlanınaKayıtlıPasswordunuGirer(String password) {
        pages0102.loginPassword.sendKeys(ConfigReader.getProperty(password));

    }

    @And("Admin login butonuna tıklar")
    public void adminButonunaTıklar() {
        pages0102.loginGiris.click();
    }

    @And("Admin açılan pencerede menu butonuna tıklar")
    public void adminAcılanPenceredeButonunaTıklar() {
        pages0102.menuButonu.click();

    }

    @And("Admin Guest User'a tiklar")
    public void adminITıklar() {
        pages0102.guestUserButonu.click();
    }

    @Then("Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görünür olduğunu doğrular")
    public void adminGuestUserListNamePhoneNumberSSNUserNameBilgileriniGorunurOldugunuDogrular() {


    }

    @And("Admin silme işlemi için, Guest User List de, Name, Phone Number, SSN, User Name in olduğu tabloda {string} işaretini tıklar")
    public void adminSilmeIslemiIcinGuestUserListDeNamePhoneNumberSSNUserNameInOlduguTablodaIsaretiniTıklar(String arg0) {
    }

    @Then("Admin {string} yazısının görünür olduğunu doğrular")
    public void adminYazısınınGorunurOldugunuDogrular(String arg0) {
    }


    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }


    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("Name alaninda 'Required' yazisinin göründügünü doğrula")
    public void nameAlanindaYazisininGorundugunuDogrula() {
        assert pages0102.verifyRequired.isDisplayed();

    }

    @And("Surname alaninda 'Required' yazisinin göründügünü doğrula")
    public void surnameAlanindaRequiredYazisininGorundugunuDogrula() {
        assert pages0102.verifyRequired.isDisplayed();
    }

    @And("Birth place alaninda 'Required' yazisinin göründügünü doğrula")
    public void birthPlaceAlanindaRequiredYazisininGorundugunuDogrula() {
        assert pages0102.verifyRequired.isDisplayed();
    }


    @When("Name alani boş kalir , name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void nameAlaniBosKalirNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        //name = faker.name().firstName();
        surname = faker.name().lastName();
        birth_place = faker.nation().capitalCity();

        gender = faker.dog().gender();
        phone_number = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        birth_day =""+ faker.date();
        ssn = faker.idNumber().ssnValid();
        username = faker.name().username();
        password = faker.internet().password();
        password = password + "@Ak47!?";


        pages0102.nameKutusu.sendKeys(" ");
        pages0102.surnameKutusu.sendKeys(surname);
        pages0102.birthPlaceKutusu.sendKeys(birth_place);
        pages0102.phoneNumberKutusu.sendKeys(phone_number);

        if (gender.equalsIgnoreCase("male")) {
            pages0102.maleButton.click();
        } else {
            pages0102.femaleButton.click();
        }

        pages0102.birthDayKutusu.sendKeys(birth_day);
        pages0102.ssnKutusu.sendKeys(ssn);
        pages0102.usernameKutusu.sendKeys(username);
        pages0102.passwordKutusu.sendKeys(password);}
}
