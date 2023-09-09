package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagamentOnSchoolsPageUs07_08_09 {
    public ManagamentOnSchoolsPageUs07_08_09(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement HiMesaji;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement Menu;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement contactGetAll;

    @FindBy(xpath = "//th[text()='Message']")
    public WebElement message;

    @FindBy(xpath ="//th[text()='Subject']" )
    public WebElement konu;

    @FindBy(xpath ="//th[text()='Date']" )
    public WebElement tarih;

    @FindBy(xpath ="//th[text()='Email']" )
    public WebElement email;

    @FindBy(xpath ="//th[text()='Name']" )
    public WebElement isim;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessons;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonNameKutusu;

    @FindBy (xpath = "//input[@id='compulsory']")
    public WebElement compulsoryButonu;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreKutusu;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement submitButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement lessonCreatedMesaji;

    @FindBy(xpath = "//h3[text()='Lesson Management']")
    public WebElement lessonManagementYazisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement lessonNameResquiredMesaji;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement creditScoreRequiredMesaji;

    @FindBy(xpath = "(//h5[@class='fw-bold p-3 card-header'])[1]")
    public WebElement lessonList;

    @FindBy(xpath = "(//a[@class='page-link'])[8]")
    public WebElement listeSonuButonu;

    @FindBy(xpath = "//th[text()='Lesson Name']")
    public WebElement lessonName;

    @FindBy(xpath = "//th[text()='Compulsory']")
    public WebElement compulsory;

    @FindBy(xpath = "//th[text()='Credit Score']")
    public WebElement creditScore;

    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[15]")
    public WebElement deleteButonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement lessonDeletedMesaji;




}
