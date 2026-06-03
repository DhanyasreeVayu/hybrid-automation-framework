package api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;

public class DeleteUserTest {

    @Test
    public void deleteUser() {

        given()

        .when()
                .delete(UserEndpoints.USERS + "/2")

        .then()
                .statusCode(204);
    }
}