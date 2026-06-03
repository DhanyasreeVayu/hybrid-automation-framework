package api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payloads.UserPayload;
import api.specifications.RequestSpec;

public class CreateUserTest {

    @Test
    public void createUser() {

        String body =
                UserPayload.createUserPayload(
                        "Dhanyasree",
                        "QA Engineer");

        given()
                .spec(RequestSpec.getRequestSpec())
                .body(body)

        .when()
                .post(UserEndpoints.USERS)

        .then()
                .statusCode(201);
    }
}