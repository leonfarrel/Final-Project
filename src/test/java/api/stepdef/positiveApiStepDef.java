package api.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class positiveApiStepDef extends base {

    private Response response;

    @Given("API is available")
    public void apiAvailable() {
        RestAssured.baseURI = BASE_URL;
    }

    @When("request user id {string}")
    public void getUserById(String userId){
        response = getRequest()
                .when()
                .get("/user/"+userId);

        System.out.println("Response Body: "+ response.getBody().asPrettyString());
    }
    @When("request all user")
    public void getAllUser(){
        response = getRequest()
                .when()
                .get("/user");

        System.out.println("Response Body: "+ response.getBody().asPrettyString());
    }
    @When("put user with id {string} firstname {string} lastname {string} email {string}")
    public void putUser(String userId, String firstname, String lastname, String email) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "John");
        requestBody.put("lastName", "Joestar");
        requestBody.put("email", "jojo102@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .put("/user/" + userId);

        System.out.println("Update Response: " + response.getBody().asPrettyString());
    }


    @When("create a new user with firstname {string} lastname {string} email {string}")
    public void createUser(String firstname, String lastname, String email){
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "Leon");
        requestBody.put("lastName", "Farrel");
        requestBody.put("email", "leon111@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .post("/user/create");

        System.out.println("Response Body: " + response.getBody().asPrettyString());
    }

    @When("patch user with id {string} firstname {string} lastname {string} email {string}")
    public void patchUser(String userId, String firstname, String lastname, String email) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "Rick");
        requestBody.put("lastName", "Morty");
        requestBody.put("email", "ricky01@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .put("/user/" + userId);

        System.out.println("Update Response: " + response.getBody().asPrettyString());
    }

    @When("delete user with id {string}")
    public void deleteUser(String userId){
        response = getRequest()
                .when()
                .delete("/user/"+userId);

        System.out.println("Response Body: "+ response.getBody().asPrettyString());
    }

    @Then("response code should be {int}")
    public void statusCode(int statusCode){
        assertEquals(statusCode, response.statusCode());
    }

}
