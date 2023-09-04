package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement assertEmail;

    @FindBy(xpath = "//*[@id=\"27\"]")
    public WebElement assertSubject;

    @FindBy(css = ".Toastify__toast-body")//class
    public WebElement assertMessage;





}

