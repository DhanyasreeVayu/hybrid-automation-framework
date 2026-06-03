package api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payloads.UserPayload;
import api.specifications.RequestSpec;

public class UpdateUserTest {

    @Test
    public void updateUser() {

        String body =
                UserPayload.createUserPayload(
                        "Dhanyasree",
                        "Senior QA");

        given()
                .spec(RequestSpec.getRequestSpec())
                .body(body)

        .when()
                .put(UserEndpoints.USERS + "/2")

        .then()
                .statusCode(200);
    }
}