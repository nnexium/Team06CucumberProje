package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs01_02 {
    public ManagementOnSchoolsPageUs01_02(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement homePageRegisterButton;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameKutusu;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameKutusu;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceKutusu;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement phoneNumberKutusu;

    @FindBy(xpath = "//label[normalize-space()='Gender']")
    public WebElement genderKutusu;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDayKutusu;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnKutusu;

    @FindBy(xpath = "//input[@id='username']")
   public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    public WebElement registerButonu;

    @FindBy(xpath = "//div[contains(text(),'Guest User registered.')]")
    public WebElement verifyRegister;


    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButtonu;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleButton;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleButton;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginGiris;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButonu;

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUserButonu;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement verifyRequired;



    //@FindBy(xpath = "//a[text()='Guest User']")
   // public WebElement guestUserButonu;

    //th












}
