package api.stepdef;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class base {
    protected static final String BASE_URL = "https://dummyapi.io/data/v1";
    protected static final String APP_ID = "63a804408eb0cb069b57e43a";

    protected RequestSpecification getRequest() {
        return RestAssured.given()
                .baseUri(BASE_URL)
                .header("app-id", APP_ID)
                .header("Content-Type", "application/json");
    }


}
