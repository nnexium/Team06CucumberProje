package managementonschools.stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import managementonschools.pages.ManagementOnSchoolsPageUs13_14_24;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class ManagementOnSchoolsStepDefinitionUs13_14_24 {

    ManagementOnSchoolsPageUs13_14_24 managementOnSchoolsPage = new ManagementOnSchoolsPageUs13_14_24();
    Actions actions = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    private static String fakeUsername;
    private static String fakeSsn;
    private static String fakePhoneNumber;


    @Given("Ana sayfaya git.")
    public void anaSayfayaGit() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @And("Login Butonuna Tıkla.")
    public void loginButonunaTıkla() {
        managementOnSchoolsPage.login.click();
    }

    @And("Vice Dean User Name Bilgisini Gir.")
    public void viceDeanUserNameBilgisiniGir() {
        managementOnSchoolsPage.userName.sendKeys(ConfigReader.getProperty("userName"));
    }

    @And("Vice Dean Password Bilgisini Gir.")
    public void viceDeanPasswordBilgisiniGir() {
        managementOnSchoolsPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Mavi Login Butonuna Tıkla.")
    public void maviLoginButonunaTıkla() {
        managementOnSchoolsPage.maviLoginButonu.click();
    }

    @And("Menu butonuna tıkla.")
    public void menuButonunaTıkla() {
        managementOnSchoolsPage.menuButonu.click();
        ReusableMethods.bekle(2);
    }

    @And("Teacher Management  butonuna tıkla")
    public void teacherManagementButonunaTıkla() {
        managementOnSchoolsPage.teacherManagementButonu.click();
        ReusableMethods.bekle(2);
    }

    @And("Submit butonu gorunene kadar sayfayi asagiya kaydir")
    public void submitButonuGoruneneKadarSayfayiAsagiyaKaydir() {
        actions.scrollByAmount(0,250).perform();
        ReusableMethods.bekle(2);
    }

    @And("Add Teacher menüsündeki submit butonuna tıkla")
    public void addTeacherMenüsündekiSubmitButonunaTıkla() {
        managementOnSchoolsPage.submitButonu.click();
        ReusableMethods.bekle(2);
    }

    @And("Boş bırakılamaz olan bölümleri doğrula")
    public void boşBırakılamazOlanBölümleriDoğrula() {
        ReusableMethods.tumSayfaResmi("Bos birakilamaz alan uyarilari");
        ReusableMethods.bekle(2);
    }

    @And("Choose Lessons butonuna tıkla ve öğretmenin gireceği dersi seç")
    public void chooseLessonsButonunaTıklaVeÖğretmeninGireceğiDersiSeç() {
        managementOnSchoolsPage.chooseLessons.click();
        ReusableMethods.bekle(3);
        actions.sendKeys("Cypress",Keys.ENTER,Keys.TAB).perform();
        ReusableMethods.bekle(2);
    }

    @And("Öğretmen {string},{string},{string}, {string},{string} gir")
    public void öğretmenGir(String Name, String Surname, String BirthPlace, String email, String PhoneNumber) {
        String managementHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.fakemail.net");
        String fakeEmail = managementOnSchoolsPage.fakerMail.getText();
        Driver.getDriver().switchTo().window(managementHandle);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        actions.sendKeys(Name,Keys.TAB,Surname,Keys.TAB,BirthPlace,Keys.TAB,fakeEmail,Keys.TAB,fakePhoneNumber).perform();
    }

    @And("Öğretmen Cinsiyeti Seç")
    public void öğretmenCinsiyetiSeç() {
        managementOnSchoolsPage.cinsiyet.click();
        actions.sendKeys(Keys.TAB).perform();
    }

    @And("Öğretmen Date of Birth gir.")
    public void öğretmenDateOfBirthGir() {
        managementOnSchoolsPage.dateOfBirth.sendKeys("15","02","1960");
    }

    @And("ogretmen {string},{string},{string} gir")
    public void ogretmenGir(String Ssn, String UserName, String Password) {
        fakeSsn = faker.idNumber().ssnValid();
        fakeUsername = faker.name().username();
        managementOnSchoolsPage.ssn.sendKeys(fakeSsn,Keys.TAB,fakeUsername,Keys.TAB,Password);
    }

    @And("Öğretmen eklendiğini doğrula")
    public void öğretmenEklendiğiniDoğrula() {
        Assert.assertEquals("Teacher saved successfully",managementOnSchoolsPage.teacherSaved.getText());
    }

    @And("Sayfayi asagi kaydir ve Teacher List goruntulendigini dogrula")
    public void sayfayiAsagiKaydirVeTeacherListGoruntulendiginiDogrula() {
        actions.scrollByAmount(0,250).perform();
        ReusableMethods.bekle(2);
        Assert.assertEquals("Teacher List",managementOnSchoolsPage.teacherList.getText());
        ReusableMethods.bekle(2);
        actions.scrollByAmount(0,500).perform();
        ReusableMethods.bekle(2);
        actions.scrollByAmount(0,750).perform();
        ReusableMethods.bekle(2);
    }

    @And("Sayfadaki en son satirin altinda > butonuna tikla")
    public void sayfadakiEnSonSatirinAltindaButonunaTikla() {
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();
        managementOnSchoolsPage.sayfaSonu.click();

    }

    @And("Olusturulan Teacherin Name, Phone Number, SSN, User Name bilgileri görüldugunu dogrula")
    public void olusturulanTeacherinNamePhoneNumberSSNUserNameBilgileriGörüldugunuDogrula() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("olusturulan Teacher dogrulama");

    }
    @And("Ekrana gelen son Teacher Listteki kendi olusturdugun teacherin karsisindaki Edit butonuna tikla")
    public void ekranaGelenSonTeacherListtekiKendiOlusturdugunTeacherinKarsisindakiEditButonunaTikla() {
        ReusableMethods.bekle(2);
        managementOnSchoolsPage.editButonu.click();

    }

    @And("Choose Lessons butonuna tıkla ve öğretmenin gireceği dersi guncelle")
    public void chooseLessonsButonunaTıklaVeÖğretmeninGireceğiDersiGuncelle() {
        ReusableMethods.bekle(2);
        managementOnSchoolsPage.editChooseLesson.click();
        ReusableMethods.bekle(3);
        actions.sendKeys("Java",Keys.ENTER,Keys.TAB).perform();
        ReusableMethods.bekle(2);
    }

    @And("Öğretmen {string},{string},{string},{string},{string}guncelle")
    public void öğretmenGuncelle(String Name, String Surname, String BirthPlace, String email, String PhoneNumber) {
        String managementHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.fakemail.net");
        String fakeEmail = managementOnSchoolsPage.fakerMail.getText();
        Driver.getDriver().switchTo().window(managementHandle);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        actions.sendKeys(Name,Keys.TAB,Surname,Keys.TAB,BirthPlace,Keys.TAB,fakeEmail,Keys.TAB,fakePhoneNumber).perform();
    }


    @And("is Advisor Teacher guncelle")
    public void isAdvisorTeacherGuncelle() {
        managementOnSchoolsPage.isAdvisor.click();
    }

    @And("Gender guncelle")
    public void genderGuncelle() {
        managementOnSchoolsPage.gender.click();
        actions.sendKeys(Keys.TAB);
    }

    @And("Ogretmen {string},{string} guncelle")
    public void guncelle(String UserName, String Password) {
        managementOnSchoolsPage.editUserName.sendKeys(UserName,Keys.TAB,Password);
    }

    @And("Submit butonuna tikla")
    public void submitButonunaTikla() {
        managementOnSchoolsPage.submitGuncellemeButonu.click();
    }

    @And("Sayfayi kapat")
    public void sayfayiKapat() {
        Driver.quitDriver();
    }

    @And("Admin User Name Bilgisini Gir.")
    public void adminUserNameBilgisiniGir() {
        managementOnSchoolsPage.userName.sendKeys(ConfigReader.getProperty("AdminUserName"));
    }

    @And("Admin Password Bilgisini Gir.")
    public void adminPasswordBilgisiniGir() {
        managementOnSchoolsPage.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
    }

    @And("Teacher Management butonuna tıkla")
    public void adminteacherManagementButonunaTıkla() {
        managementOnSchoolsPage.adminTeacher.click();
    }

    @And("Admin Submit butonu gorunene kadar sayfayi asagiya kaydir")
    public void adminSubmitButonuGoruneneKadarSayfayiAsagiyaKaydir() {
        ReusableMethods.bekle(2);
        actions.scrollByAmount(0,350).perform();
        ReusableMethods.bekle(2);
    }

    @And("ogretmen {string} guncelle")
    public void ogretmenGuncelle(String Ssn) {
        fakeSsn = faker.idNumber().ssnValid();
        managementOnSchoolsPage.editSsn.sendKeys(fakeSsn);
    }

    @And("Öğretmen Date of Birth guncelle")
    public void öğretmenDateOfBirthGuncelle() {
        managementOnSchoolsPage.editDate.click();
        managementOnSchoolsPage.editDate.sendKeys("15","02","1960",Keys.TAB);
    }

    @And("Bilgilerin guncellendigini dogrula")
    public void bilgilerinGuncellendiginiDogrula() {
        Assert.assertEquals("Teacher updated Successful",managementOnSchoolsPage.teacherGuncelleme.getText());
    }

}
