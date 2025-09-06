package api.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertTrue;

public class negativeApiStepDef extends base {

    private Response response;

    @When("request non existing user id {string}")
    public void getUserById(String userId){
        response = getRequest()
                .when()
                .get("/user/"+userId);

        System.out.println("Response Body: "+ response.getBody().asPrettyString());
    }

    @Then("response body should show {string}")
    public void invalidResponse(String expectedMessage){
        String body = response.getBody().asString();
        System.out.println("Asserting body contains: " + expectedMessage);
        assertTrue(body.contains(expectedMessage));
    }

    @When("create a new user with existing data firstname {string} lastname {string} email {string}")
    public void createInvalidUser(String firstname, String lastname, String email){
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "Leon");
        requestBody.put("lastName", "Farrel");
        requestBody.put("email", "leon@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .post("/user/create");

        System.out.println("Response Body: " + response.getBody().asPrettyString());
    }

    @When("put data for invalid user with id {string} firstname {string} lastname {string} email {string}")
    public void putInvalidUser(String userId, String firstname, String lastname, String email) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "Leon");
        requestBody.put("lastName", "farrel");
        requestBody.put("email", "leon@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .put("/user/" + userId);

        System.out.println("Update Response: " + response.getBody().asPrettyString());
    }

    @When("patch data for invalid user with id {string} firstname {string} lastname {string} email {string}")
    public void patchInvalidUser(String userId, String firstname, String lastname, String email) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("firstName", "Leon");
        requestBody.put("lastName", "farrel");
        requestBody.put("email", "leon@test.com");

        response = getRequest()
                .body(requestBody)
                .when()
                .put("/user/" + userId);

        System.out.println("Update Response: " + response.getBody().asPrettyString());
    }

    @When("delete invalid user with id {string}")
    public void deleteInvalid(String userId){
        response = getRequest()
                .when()
                .delete("/user/" + userId);
    }


}
