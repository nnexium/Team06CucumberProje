package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs15_16_25 {

    public ManagementOnSchoolsPageUs15_16_25(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[@class='header_link ms-2']")
    public WebElement login;

    @FindBy (xpath = "(//input)[1]")
    public WebElement username;

    @FindBy (xpath = "(//input)[2]")
    public WebElement password;

    @FindBy (xpath = "(//*[@type='button'])[3]")
    public WebElement loginButon;

    @FindBy (xpath = "//*[.='Menu']")
    public WebElement menu;

    @FindBy (xpath = "//*[.='Student Management']")
    public WebElement studentManagement;

    @FindBy (xpath = "//*[@class='form-select']")
    public WebElement chooseTeacherDdm;

    @FindBy (xpath = "(//option)[12]")
    public WebElement advisorTeacher;

    @FindBy (xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy (xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement ogrenciPassword;

    @FindBy (xpath = "(//*[@name='gender'])[1]")
    public WebElement gender;

    @FindBy (xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButon;

    @FindBy (xpath = "(//div)[83]")
    public WebElement studentSavedSuccessfully;

    @FindBy (xpath = "//*[@id='phoneNumber']")
    public WebElement phone;

    @FindBy (xpath = "//*[.='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy (xpath = "//*[.='Name']")
    public WebElement nameBilgisi;

    @FindBy (xpath = "//*[.='Email']")
    public WebElement emailBilgisi;

    @FindBy (xpath = "//*[.='Date']")
    public WebElement dateBilgisi;

    @FindBy (xpath = "//*[.='Subject']")
    public WebElement subjectBilgisi;

    @FindBy (xpath = "//*[.='Message']")
    public WebElement messageBilgisi;
}
