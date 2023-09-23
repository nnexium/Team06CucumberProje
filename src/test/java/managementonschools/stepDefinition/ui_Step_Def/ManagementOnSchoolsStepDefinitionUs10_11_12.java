package managementonschools.stepDefinition.ui_Step_Def;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import managementonschools.pages.ManagementOnSchoolsPageUs10_11_12;
import managementonschools.pojos.us_10_11_12.US12_e2e_Test.US12e2eResponsePojo;
import managementonschools.utilities.ConfigReader;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.specViceDean;
import static org.junit.Assert.assertEquals;

public class ManagementOnSchoolsStepDefinitionUs10_11_12 {

    ManagementOnSchoolsPageUs10_11_12 managementOnSchoolsPage = new ManagementOnSchoolsPageUs10_11_12();

    FileInputStream fis = new FileInputStream("C:/Users/Erdem/IdeaProjects/Team06CucumberProje/src/test/resources/features/e2e_testler/files/ids.xlsx");
    Workbook workbook = WorkbookFactory.create(fis);

    US12e2eResponsePojo actualData;

    public ManagementOnSchoolsStepDefinitionUs10_11_12() throws IOException {
    }

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
    public void eKullanciDersGunBaslamaSaatiBitisSaatiGereksinimleriniDoldurur() throws IOException {
        String java = "JavaScript";
        String cucumber = "TheCucumber";

        managementOnSchoolsPage.chooseLesson.click();
        ReusableMethods.bekle(1);
        managementOnSchoolsPage.chooseLessonddm.sendKeys(java, Keys.ENTER, cucumber, Keys.ENTER);
        ddmSelectByIndex(managementOnSchoolsPage.chooseEducationTeamddm, 1);
        ddmSelectByIndex(managementOnSchoolsPage.chooseDayddm, 5);

        String timeHour = timeHourGenerator(12);
        String timeMinuteStr = timeMinuteGenerator(0);
        String timeMinutePlus = timeMinuteGenerator(1);

        String startTime = timeHour + "." + timeMinuteStr;
        String stopTime = timeHour + "." + timeMinutePlus;

        managementOnSchoolsPage.chooseStartTime.sendKeys(startTime, "a");
        managementOnSchoolsPage.chooseStopTime.sendKeys(stopTime, "a");

        String startTime0 = timeHour + ":" + timeMinuteStr + ":00";
        String stopTime0 = timeHour + ":" + timeMinutePlus + ":00";

        workbook.getSheet("Sheet1").getRow(0).createCell(0).setCellValue(startTime0);
        workbook.getSheet("Sheet1").getRow(0).createCell(1).setCellValue(stopTime0);
        workbook.getSheet("Sheet1").getRow(0).createCell(2).setCellValue(java);
        workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue(cucumber);

        FileOutputStream fos = new FileOutputStream("C:/Users/Erdem/IdeaProjects/Team06CucumberProje/src/test/resources/features/e2e_testler/files/ids.xlsx");
        workbook.write(fos);
        fos.close();
        workbook.close();


    }

    @Then("e kullanici Submit butonuna tiklar")
    public void eKullaniciSubmitButonunaTiklar() {
        managementOnSchoolsPage.submitLesson.click();
    }

    public void ddmSelectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    @Then("e kullanici {int} saniye bekler")
    public void eKullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("e kullanici bir alttaki Lesson Program Assignment bolumunden ogretmene vermek istedigi derselri secer")
    public void eKullaniciBirAlttakiLessonProgramAssignmentBolumundenOgretmeneVermekIstedigiDerselriSecer() {
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
        action.sendKeys(Keys.END, Keys.PAGE_UP);
        action.perform();
    }

    @Then("e kullanici istedigi ogretmeni secer")
    public void eKullaniciIstedigiOgretmeniSecer() {
        Random random = new Random();
        int min = 1;
        int max = 350;
        int randomNumber = random.nextInt(max - min + 1) + min;
        ddmSelectByIndex(managementOnSchoolsPage.teacher, randomNumber);
    }

    @Then("e kullanici ogretmeni atamak icin submit butonuna tiklar")
    public void eKullaniciOgretmeniAtamakIcinSubmitButonunaTiklar() {
        managementOnSchoolsPage.submitTeacher.click();
    }

    @Then("tester kullanicinin siteden girdigi bilgiler database e gidip gitmedigini kontrol eder")
    public void testerKullanicininSitedenGirdigiBilgilerDatabaseEGidipGitmediginiKontrolEder() {


        String startTime0 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        String stopTime0 = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();
        String java = workbook.getSheet("Sheet1").getRow(0).getCell(2).toString();
        String cucumber = workbook.getSheet("Sheet1").getRow(0).getCell(3).toString();

        workbook.getSheet("Sheet1").getRow(0).createCell(0).setCellValue(startTime0);
        workbook.getSheet("Sheet1").getRow(0).createCell(1).setCellValue(stopTime0);
        workbook.getSheet("Sheet1").getRow(0).createCell(2).setCellValue(java);
        workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue(cucumber);

        specViceDean.pathParams("first", "lessonPrograms", "second", "getAll");

        Response response = given(specViceDean).when().get("{first}/{second}");

        JsonPath jsonPath = response.jsonPath();
        List<Integer> lessons = jsonPath.getList("findAll {it.startTime == '" + startTime0 + "' && it.stopTime == '" + stopTime0 + "' && it.lessonName.any { lesson -> lesson.lessonName == '" + cucumber + "' }&& it.lessonName.any { lesson -> lesson.lessonName == '" + java + "' }}.lessonProgramId");

        System.out.println(lessons.toString());

        Integer lessonProgramId = lessons.get(0);

        specViceDean.pathParams("first", "lessonPrograms", "second", "getById", "third", lessonProgramId);

        response = given(specViceDean).when().get("{first}/{second}/{third}");

        String jsonResponse = response.prettyPrint();  // Your JSON response here
        response.prettyPrint();

        ObjectMapper mapper = new ObjectMapper();
        try {
            actualData = mapper.readValue(jsonResponse, US12e2eResponsePojo.class);
            // Now you can use 'data' as an instance of YourDataClass
        } catch (IOException e) {
            e.printStackTrace();
        }


        assertEquals(startTime0, actualData.getStartTime());
        assertEquals(stopTime0, actualData.getStopTime());
        assertEquals("FRIDAY", actualData.getDay());
        assert (actualData.getLessonName().contains(cucumber));
        assert (actualData.getLessonName().contains(java));


    }

    public static String timeHourGenerator(int timeOption) {
        LocalDateTime time = LocalDateTime.now();
        String timeHour;
        int timeHourInt = time.getHour();

        if (timeOption == 12) {
            if (timeHourInt > 12) {
                timeHourInt = timeHourInt - 12;

                timeHour = Integer.toString(timeHourInt);
                if (timeHourInt < 10) {
                    return timeHour = "0" + timeHour;
                }

            } else {
                return timeHour = Integer.toString(timeHourInt);

            }
        } else {
            return timeHour = Integer.toString(timeHourInt);
        }
        return timeHour;
    }

    public static String timeMinuteGenerator(int startStop) {

        LocalDateTime time = LocalDateTime.now();
        int timeMinute = time.getMinute();

        String timeMinuteStr = Integer.toString(timeMinute);
        String timeMinuteStrPlus = Integer.toString(timeMinute + 1);

        String returnedMinute;

        if (timeMinute <= 9) {
            if (timeMinute == 9) {
                timeMinuteStr = "0" + timeMinuteStr;
            } else {
                timeMinuteStr = "0" + timeMinuteStr;
                timeMinuteStrPlus = "0" + timeMinuteStrPlus;
            }
        }
        if (startStop == 0) {
            return returnedMinute = timeMinuteStr;
        } else {
            return returnedMinute = timeMinuteStrPlus;
        }


    }
}

