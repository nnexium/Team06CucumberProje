package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs17_18 {
    public ManagementOnSchoolsPageUs17_18() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement girisButton;

    @FindBy(xpath = "(//*[@class='form-select'])[1]")
    public WebElement chooseLesson;

    @FindBy(xpath = "(//*[@class='form-select'])[2]")
    public WebElement chooseStudent;

    @FindBy(xpath = "(//*[@class='form-select'])[3]")
    public WebElement chooseTerm;

    @FindBy(xpath = "(//*[@class='form-control is-invalid'])[1]")
    public WebElement absentee;

    @FindBy(xpath = "//*[@id='midtermExam']")
    public WebElement midtermexamnote;

    @FindBy(xpath = "//*[@id='finalExam']")
    public WebElement finalexamnote;

    @FindBy(xpath = "//*[@id='infoNote']")
    public WebElement infoNote;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr/td[1]/span")
    public WebElement name1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[2]/span")
    public WebElement lessonName1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[3]/span")
    public WebElement absentee1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[4]/span")
    public WebElement midtermExam1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[5]/span")
    public WebElement finalExam1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[6]/span")
    public WebElement note1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[7]/span")
    public WebElement infoNote1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[8]/span")
    public WebElement avarage1;


    @FindBy(xpath = "//table/tbody/tr[1]/td[9]/span")
    public WebElement editButton;


    @FindBy(xpath = "(//*[@id='midtermExam'])[2]")
    public WebElement editMidterm;

    @FindBy(xpath = "(//*[@id='finalExam'])[2]")
    public WebElement editFinal;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmitButton;

    @FindBy(xpath = " (//*[@class='btn-close'])[3]")
    public WebElement closeButton1;



    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@aria-label='Close'])[3]")
    public WebElement closeButton;



















}
