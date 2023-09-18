package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.ElementClickInterceptedException;

public class ManagementOnSchoolsPageUs03_04 {




    public ManagementOnSchoolsPageUs03_04() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/a[5]")
    public WebElement contactbutton;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement yourName;


    @FindBy(xpath = "//*[@placeholder='Email']")
    public WebElement yourEmail;

    @FindBy(xpath = "//*[@placeholder='Subject']")
    public WebElement Subject;

    @FindBy(xpath = "//*[@placeholder='Message']")
    public WebElement Message;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement sendMessage;

    @FindBy(css = ".Toastify__toast-body")
    public WebElement assertName;

    @FindBy(css = "div[class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement assertEmail;
    //@FindBy(css = "span[class='wcicon-status-completed']")

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement assertSubject;


    @FindBy(css = "//div[text()='Your subject should be at least 4 characters']")
    public WebElement assertMessage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div/nav/button")
    public WebElement menuButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[7]")//
    public WebElement deanEnter;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement enter;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameEnter;

    @FindBy(xpath= "(//*[@type='radio'])[1]")
    public WebElement femaleGender;

    @FindBy(xpath= "(//*[@type='radio'])[2]")
    public WebElement maleGender;

    @FindBy(xpath= "(//*[@id='birthDay'])")
    public WebElement birthDayselect;

    @FindBy(xpath= "//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath= "//*[@id='ssn']")
    public WebElement ssnNumber;

    @FindBy(xpath= "//*[@id='username']")
    public WebElement UserName;

    @FindBy(xpath= "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath= "//*[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath= "//*[@id='surname']")
    public WebElement surname;

    @FindBy(xpath= "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;








}

