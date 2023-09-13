package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs19_20 {
    public ManagementOnSchoolsPageUs19_20(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButon;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginButonuUsernameVePassword;


    @FindBy(xpath = "//*[@id='root']/div/header/div[1]/div/div/div/nav/button")
    public WebElement menu;

    @FindBy(xpath = "(//*[@id='offcanvasNavbar-expand-lg']/div[2]/div/a[2])[2]")
    public WebElement meetManagement;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseStudents;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement date;
    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement description;
    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div/div/form/div/div[6]/div/button")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div")
    public WebElement hataUyarisi;

    @FindBy(css = "div[class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement onayMesaji;

    @FindBy(xpath = "(//h5)[2]")
    public WebElement meetListYazisi;

    @FindBy(xpath = "(//td)[1]")
    public WebElement ogrenciIsmi;

    @FindBy(xpath = "(//td)[2]")
    public WebElement dateTablodaki;

    @FindBy(xpath = "(//td)[3]")
    public WebElement baslamaSaati;

    @FindBy(xpath = "(//td)[4]")
    public WebElement bitisSaati;

    @FindBy(xpath = "(//td)[5]")
    public WebElement descriptionTablo;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[7]/span/button/i")
    public WebElement deleteButonu;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div")
    public WebElement editMeetYazisi;
    @FindBy(xpath = "(//button)[6]")
    public WebElement editButonu;


    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[1]/div/div/div[1]/div[2]")
    public WebElement yeniOgrenciEkleme;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement onayIcinEditSubmit;
    @FindBy(xpath = "(//*[@id='date'])[2]")
    public WebElement dateEdit;

    @FindBy(xpath = "(//*[@id='startTime'])[2]")
    public WebElement startTimeEdit;

    @FindBy(xpath = "(//*[@id='stopTime'])[2]")
    public WebElement stopTimeEdit;

    @FindBy(xpath = "//div[contains(@class,'ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning')]//input[@id='description']")
    public WebElement descriptionEdit;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/button")
    public WebElement cikisEdit;

    @FindBy(xpath = "(//button)[7]")
    public WebElement silmeButonu;















}
