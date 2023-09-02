package managementonschools.pages;

import managementonschools.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementOnSchoolsPageUs03_04 {
    public ManagementOnSchoolsPageUs03_04(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='header_link me-2']")
    public WebElement register;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement studentName;

}
