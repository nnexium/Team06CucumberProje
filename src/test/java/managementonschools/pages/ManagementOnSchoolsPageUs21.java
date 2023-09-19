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

public class ManagementOnSchoolsPageUs21 extends ReusableMethods {



    public ManagementOnSchoolsPageUs21(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public static WebElement loginButon;

    @FindBy(xpath = "//*[@id='username']")
    public static WebElement userNameKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public static WebElement passwordKutusu;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public static WebElement loginButonuUsernameVePassword;



    @FindBy(xpath = "//*[@id='lessonProgramId'][1]")
    public static WebElement dersSec;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public static WebElement submitButton1;

















}







