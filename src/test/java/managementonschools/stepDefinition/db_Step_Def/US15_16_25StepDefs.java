package managementonschools.stepDefinition.db_Step_Def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managementonschools.base_urls.BaseUrl;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US15_16_25StepDefs extends BaseUrl {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("database'e bağlanır")
    public void databaseEBağlanır() throws SQLException {
        setUpViceDean();
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @When("olusturulan ögrenci {string} ile çağırılır")
    public void olusturulanÖgrenciUsernameIleÇağırılır(String name) throws SQLException {
        statement = connection.createStatement();
        String query = "Select * from student where name = '"+ name +"'";
        resultSet = statement.executeQuery(query);
    }

    @Then("Girdigimiz student bilgilerinin advisorTeacherId {string},birthDay {string},birthPlace {string},email {string},fatherName {string},motherName{string},gender{string},name{string},surname{string},phoneNumber{string},ssn{string},username{string},password{string} içerdiği dogrulanir")
    public void girdigimizStudentBilgilerininAdvisorTeacherIdBirthDayBirthPlaceEmailFatherNameMotherNameGenderNameSurnamePhoneNumberSsnUsernamePasswordIçerdiğiDogrulanir(String advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String motherName, String gender, String name, String surname, String phoneNumber, String ssn, String username,String password) throws SQLException {
        resultSet.next();

        String actualAdvisorTeacherId = resultSet.getString("advisor_teacher_id");
        String actualBirthday = resultSet.getString("birth_day");
        String actualBirthPlace = resultSet.getString("birth_place");
        String actualEmail = resultSet.getString("email");
        String actualFatherName = resultSet.getString("father_name");
        String actualMotherName = resultSet.getString("mother_name");
        String actualGender = resultSet.getString("gender");
        String actualName = resultSet.getString("name");
        String actualSurname = resultSet.getString("surname");
        String actualPhoneNumber = resultSet.getString("phone_number");
        String actualSsn = resultSet.getString("ssn");
        String actualUsername = resultSet.getString("username");
        String actualPassword = resultSet.getString("password");

        assertEquals(advisorTeacherId,actualAdvisorTeacherId);
        assertEquals(birthDay,actualBirthday);
        assertEquals(birthPlace,actualBirthPlace);
        assertEquals(email,actualEmail);
        assertEquals(fatherName,actualFatherName);
        assertEquals(motherName,actualMotherName);
        assertEquals(gender,actualGender);
        assertEquals(name,actualName);
        assertEquals(surname,actualSurname);
        assertEquals(phoneNumber,actualPhoneNumber);
        assertEquals(ssn,actualSsn);
        assertEquals(username,actualUsername);
        assertEquals(password,actualPassword);

    }

    @When("ogrenciler {string} ile cagirilir")
    public void ogrencilerEmailIleCagirilir(String email) throws SQLException {
        statement = connection.createStatement();
        String query1= "select * from contact_message where email = '"+email +"'";
        resultSet = statement.executeQuery(query1);
    }

    @Then("message {string}, name {string}, email {string}, date {string}, subject {string} bilgilerinin goruntulendigi dogrulanir DB")
    public void messageNameEmailDateSubjectBilgilerininGoruntulendigiDogrulanirDB(String message, String name, String email, String date, String subject) throws SQLException {
        resultSet.next();
        String actualMessage = resultSet.getString("message");
        String actualName = resultSet.getString("name");
        String actualEmail = resultSet.getString("email");
        String actualDate = resultSet.getString("date");
        String actualSubject = resultSet.getString("subject");

        assertEquals(message,actualMessage);
        assertEquals(name,actualName);
        assertEquals(email,actualEmail);
        assertEquals(date,actualDate);
        assertEquals(subject,actualSubject);

    }


}
