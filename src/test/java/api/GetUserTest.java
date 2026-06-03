package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest {

    @Test
    public void getUserTest() {

        given()
        .when()
            .get("https://reqres.in/api/users/2")
        .then()
            .statusCode(200)
            .body("data.id", equalTo(2));
    }
}