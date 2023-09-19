package managementonschools.pages;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managementonschools.utilities.Driver;
import managementonschools.utilities.ReusableMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs22 extends ReusableMethods {
    public ManagementOnSchoolsPageUs22() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='name']")
    public static WebElement adminName;

    @FindBy(xpath = "//*[@id='surname']")
    public static WebElement adminSurname;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public static WebElement birthPlace;

    @FindBy(xpath = "//*[@value='MALE']")
    public static WebElement gender;

    @FindBy(xpath = "//*[@id='birthDay']")
    public static WebElement dogumTarihi;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public static WebElement phoneNumber;
    @FindBy(xpath = "//*[@id='ssn']")
    public static WebElement ssnNumber;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public static WebElement submit;





}