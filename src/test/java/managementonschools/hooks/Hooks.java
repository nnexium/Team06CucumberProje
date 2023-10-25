package managementonschools.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managementonschools.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static managementonschools.base_urls.BaseUrl.*;

public class Hooks {
    @Before
    public void setUp(){
        setUpAdmin();
        setUpDean();
        setUpViceDean();
        setUpTeacher();
        setUpStudent();
        System.out.println("Scenariolar calismaya basladi");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
            Driver.closeDriver();
        }


    }

}
