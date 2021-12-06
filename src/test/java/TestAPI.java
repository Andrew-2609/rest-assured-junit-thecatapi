import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {

    @Test
    public void signUpTest() {
        String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
        String body = "{\"email\": \"restassure@email.com\", \"appDescription\": \"Testing The Cat API with REST Assured and JUnit\"}";

        given()
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(body)
                .when()
                .post(url)
                .then()
                .statusCode(200)
                .body("message", equalTo("SUCCESS"))
        ;
    }

}
