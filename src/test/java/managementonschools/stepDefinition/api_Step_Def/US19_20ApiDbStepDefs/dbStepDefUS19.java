package managementonschools.stepDefinition.api_Step_Def.US19_20ApiDbStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;

import static managementonschools.stepDefinition.US19_20ApiDbStepDefs.US19ApiStepDefinition.*;

public class dbStepDefUS19 {

    Connection connection;

    Statement statement;

    ResultSet resultSet;
    @Given("Database baglanir")
    public void databaseBaglanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");


    }

    @When("MeetId aracılıgıyla bilgilere ulasilir")
    public void meetıdAracılıgıylaBilgilereUlasilir() throws SQLException {
        statement = connection.createStatement();

        String query = "select * from meet where id = '" + actualData.getObject().getId() + "'";

        resultSet = statement.executeQuery(query);
    }

    @Then("Date,description,start_time,stop_time dogrulanir")
    public void dateDescriptionStart_timeStop_timeDogrulanir() throws SQLException {

        resultSet.next();
        String actualDate = resultSet.getString("date");
        String actualDescription = resultSet.getString("description");
        String actualStartTime = resultSet.getString("start_time");
        String actualStopTime = resultSet.getString("stop_time");

        Assert.assertEquals(date,actualDate);
        Assert.assertEquals(description,actualDescription);
        Assert.assertEquals(startTime+":00",actualStartTime);
        Assert.assertEquals(stopTime+":00",actualStopTime);


    }

    @Then("Bilgilerin güncel olduğunu dogrula")
    public void bilgilerinGuncelOldugunuDogrula() throws SQLException {

        resultSet.next();
        String actualDate = resultSet.getString("date");
        String actualDescription = resultSet.getString("description");
        String actualStartTime = resultSet.getString("start_time");
        String actualStopTime = resultSet.getString("stop_time");

        Assert.assertEquals(date,actualDate);
        Assert.assertEquals(description,actualDescription);
        Assert.assertEquals(startTime+":00",actualStartTime);
        Assert.assertEquals(stopTime+":00",actualStopTime);

    }

    @Then("Bilgilerin db kısmından silindigini dogrula")
    public void bilgilerinDbKısmındanSilindiginiDogrula() throws SQLException {

        resultSet.next();

        String actualDate = resultSet.getString("date");
        String actualDescription = resultSet.getString("description");
        String actualStartTime = resultSet.getString("start_time");
        String actualStopTime = resultSet.getString("stop_time");

        Assert.assertNotEquals(date,actualDate);
        Assert.assertNotEquals(description,actualDescription);
        Assert.assertNotEquals(startTime+":00",actualStartTime);
        Assert.assertNotEquals(stopTime+":00",actualStopTime);

    }
}
