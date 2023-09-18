package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs13_14_24 {
    public ManagementOnSchoolsPageUs13_14_24(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement maviLoginButonu;

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButonu;

    @FindBy(xpath = "(//*[@class='nav-link'])[9]")
    public WebElement teacherManagementButonu;

    @FindBy(xpath = "(//*[@type='button'])[7]")
    public  WebElement submitButonu;
    @FindBy(xpath = "//*[@class=' css-13cymwt-control']")
    public  WebElement chooseLessons;

    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement cinsiyet;

    @FindBy(xpath = "//*[@id='birthDay']")   //id="birthDay"
    public WebElement dateOfBirth;

    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement ssn;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement teacherSaved;
    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[3]")
    public WebElement teacherList;

    @FindBy(xpath = "(//*[@class='page-item'])[3]")
    public WebElement sayfaSonu;

    @FindBy(xpath = "(//td)[20]")
    public WebElement editButonu;

    @FindBy(xpath = "(//td)[16]")
    public WebElement nameGoruntuleme;

    @FindBy(xpath = "(//td)[17]")
    public WebElement phoneNumberGoruntuleme;

    @FindBy(xpath = "(//td)[18]")
    public WebElement ssnGoruntuleme;

    @FindBy(xpath = "(//td)[19]")
    public WebElement userNameGoruntuleme;
    @FindBy(xpath = "(//*[@id='isAdvisorTeacher'])[2]")
    public WebElement isAdvisor;

    @FindBy(xpath = "(//*[@class='form-check-input'])[6]")
    public WebElement gender;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitGuncellemeButonu;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakerMail;

    @FindBy(xpath = "(//*[@class='nav-link'])[10]")
    public WebElement adminTeacher;

    @FindBy(xpath = "(//*[@class=' css-13cymwt-control'])[2]")
    public WebElement editChooseLesson;

    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement editDate;

    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement editUserName;

    @FindBy(xpath = "//*[@class='form-control is-invalid']")
    public WebElement editSsn;

    @FindBy(xpath = "//*[@id='3']")
    public WebElement teacherGuncelleme;








}
