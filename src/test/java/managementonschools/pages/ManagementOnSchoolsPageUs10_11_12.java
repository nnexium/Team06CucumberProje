package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs10_11_12 {

    public ManagementOnSchoolsPageUs10_11_12(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class=\"header_link ms-2\"]")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@class=\"fw-semibold btn btn-primary\"]")
    public WebElement loginB;

    @FindBy(xpath = "//*[@class=\"fw-semibold text-white bg-primary navbar-toggler collapsed\"]")
    public WebElement menu;

    @FindBy(xpath = "(//*[text()=\"Lesson Management\"])[2]")
    public WebElement lessonManagement;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonProgram\"]")
    public WebElement lessonProgram;

    @FindBy(xpath = "//*[@class=\" css-13cymwt-control\"]")
    public WebElement chooseLesson;

    @FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
    public WebElement chooseLessonddm;

    @FindBy(xpath = "//*[@id=\"educationTermId\"]")
    public WebElement chooseEducationTeamddm;

    @FindBy(xpath = "//*[@id=\"day\"]")
    public WebElement chooseDayddm;

    @FindBy(xpath = "//*[@id=\"startTime\"]")
    public WebElement chooseStartTime;

    @FindBy(xpath = "//*[@id=\"stopTime\"]")
    public WebElement chooseStopTime;

    @FindBy(xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[3]")
    public WebElement submitLesson;

    @FindBy(xpath = "(//*[@id=\"lessonProgramId\"])[1]")
    public WebElement lesson1;

    @FindBy(xpath = "(//*[@id=\"lessonProgramId\"])[2]")
    public WebElement lesson2;

    @FindBy(xpath = "(//*[@id=\"lessonProgramId\"])[3]")
    public WebElement lesson3;

    @FindBy(xpath = "//*[@id=\"teacherId\"]")
    public WebElement teacher;

    @FindBy(xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[4]")
    public WebElement submitTeacher;



}
