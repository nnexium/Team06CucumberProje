package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs05_06_23 {
    public ManagementOnSchoolsPageUs05_06_23() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginn;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//*[text()='Dean Management']")
    public WebElement deanmanagement;

    @FindBy(xpath = "(//*[text()='Name'])[2]")
    public WebElement nameGorunurMu;
    @FindBy(xpath = "(//*[text()='Gender'])[2]")
    public WebElement genderGorunurMu;

    @FindBy(xpath = "//*[text()='Phone Number']")
    public WebElement pnumberGorunurMu;

    @FindBy(xpath = "//*[text()='Ssn']")
    public WebElement ssnGorunurMu;
    @FindBy(xpath = "(//*[text()='User Name'])[2]")
    public WebElement usernameGorunurMu;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameKutusu;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthdayy;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement submit;


    @FindBy(xpath = "(//*[contains(.,'Vice dean Saved')])[10]")
    public WebElement viceDeanManagementSaved;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body']")
    public WebElement notViceDeanManagementSaved;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement nameRequired;
    @FindBy(xpath = "(//*[text()='Required'])[2]")
    public WebElement surnameRequired;
    @FindBy(xpath = "(//*[text()='Required'])[3]")
    public WebElement birthpRequired;
    @FindBy(xpath = "(//*[text()='Required'])[4]")
    public WebElement dateRequired;

    @FindBy(xpath = "(//*[text()='Required'])[5]")
    public WebElement phoneRequired;
    @FindBy(xpath = "(//*[text()='Required'])[6]")
    public WebElement ssnRequired;
    @FindBy(xpath = "(//*[text()='Required'])[7]")
    public WebElement usernameRequired;

    @FindBy(xpath = "//div[text()='At least 8 characters']")
    public   WebElement Atleast8Characters;

    @FindBy(xpath = "//*[text()='One lowercase character']")
    public   WebElement OneLowerrCaseCharacterPassword;

    @FindBy(xpath = "//*[text()='One uppercase character']")
    public   WebElement OneUpperCaseCharacterPassword;

    @FindBy(xpath = "//*[text()='Vice Dean Management']")
    public WebElement viceDeanManagement;





}
