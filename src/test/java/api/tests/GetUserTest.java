package api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;

public class GetUserTest {

    @Test
    public void getUser() {

        given()

        .when()
                .get(UserEndpoints.USERS + "/2")

        .then()
                .statusCode(200);
    }
}