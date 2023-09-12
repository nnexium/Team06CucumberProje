package managementonschools.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import managementonschools.pages.ManagementOnSchoolsPageUs10_11_12;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;
import java.util.Random;

public class ManagementOnSchoolsStepDefinitionUs10_11_12 {

    ManagementOnSchoolsPageUs10_11_12 managementOnSchoolsPage = new ManagementOnSchoolsPageUs10_11_12();
    @Given("e kullanici ana sayfaya gider")
    public void kullanicianasayfayagider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }


    @Then("e kullanici login butonuna tiklar")
    public void eKullaniciLoginButonunaTiklar() {

        managementOnSchoolsPage.login.click();
    }

    @Then("e kullanici adini ve sifresini girer")
    public void eKullaniciAdiniVeSifresiniGirer() {
        managementOnSchoolsPage.userName.sendKeys("ViceDeanTeam06");
        managementOnSchoolsPage.password.sendKeys("Team0612");
    }

    @Then("e kullanici giris icin login butonuna tiklar")
    public void eKullaniciGirisIcinLoginButonunaTiklar() {
        managementOnSchoolsPage.loginB.click();
    }

    @Then("e kullanici menu'ye tiklar")
    public void eKullaniciMenuYeTiklar() {
        managementOnSchoolsPage.menu.click();

    }

    @Then("e kullanici Lesson Management'e tiklar")
    public void eKullaniciLessonManagementETiklar() {
        managementOnSchoolsPage.lessonManagement.click();
    }

    @Then("e kullancii Lesson Program'a tiklar")
    public void eKullanciiLessonProgramATiklar() {
        managementOnSchoolsPage.lessonProgram.click();
    }

    @Then("e kullanci ders,gun,baslama saati,bitis saati gereksinimlerini doldurur")
    public void eKullanciDersGunBaslamaSaatiBitisSaatiGereksinimleriniDoldurur() {

        managementOnSchoolsPage.chooseLesson.click();
        ReusableMethods.bekle(1);
        managementOnSchoolsPage.chooseLessonddm.sendKeys("javaScript", Keys.ENTER);
        ddmSelectByIndex(managementOnSchoolsPage.chooseEducationTeamddm,1);
        ddmSelectByIndex(managementOnSchoolsPage.chooseDayddm,5);

        LocalDateTime time = LocalDateTime.now();

        String timeHour = Integer.toString(time.getHour());

        int timeMinute = time.getMinute();
        String timeMinuteStr = Integer.toString(timeMinute);
        String timeMinutePlus = Integer.toString(timeMinute+1);

        managementOnSchoolsPage.chooseStartTime.sendKeys(timeHour+"."+timeMinuteStr);
        managementOnSchoolsPage.chooseStopTime.sendKeys(timeHour+"."+timeMinutePlus);


    }

    @Then("e kullanici Submit butonuna tiklar")
    public void eKullaniciSubmitButonunaTiklar() {
        managementOnSchoolsPage.submitLesson.click();
    }

    public void ddmSelectByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    @Then("e kullanici {int} saniye bekler")
    public void eKullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("e kullanici bir alttaki Lesson Program Assignment bolumunden ogretmene vermek istedigi derselri secer")
    public void eKullaniciBirAlttakiLessonProgramAssignmentBolumundenOgretmeneVermekIstedigiDerselriSecer(){
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN);
        action.perform();
        ReusableMethods.bekle(1);
        action.sendKeys(Keys.PAGE_DOWN);
        action.perform();
        ReusableMethods.bekle(1);
        action.sendKeys(Keys.PAGE_DOWN);
        action.perform();

        managementOnSchoolsPage.lesson1.click();
        managementOnSchoolsPage.lesson2.click();
        managementOnSchoolsPage.lesson3.click();
    }

    @Then("e killanici onunda altindaki Choose Teacher bolumune gelir")
    public void eKillaniciOnundaAltindakiChooseTeacherBolumuneGelir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.END,Keys.PAGE_UP);
        action.perform();
    }

    @Then("e kullanici istedigi ogretmeni secer")
    public void eKullaniciIstedigiOgretmeniSecer() {
        Random random = new Random();
        int min = 1;
        int max = 350;
        int randomNumber = random.nextInt(max - min + 1) + min;
        ddmSelectByIndex(managementOnSchoolsPage.teacher,randomNumber);
    }

    @Then("e kullanici ogretmeni atamak icin submit butonuna tiklar")
    public void eKullaniciOgretmeniAtamakIcinSubmitButonunaTiklar() {
        managementOnSchoolsPage.submitTeacher.click();
    }
    }
