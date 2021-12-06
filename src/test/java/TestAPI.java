import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class TestAPI {

    @Test
    public void signUpTest() {
        String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";
        String body = "{\"email\": \"amonteiro@email.com\", \"appDescription\": \"Testing The Cat API with REST Assured and JUnit\"}";

        given()
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(body)
                .when()
                .post(url)
                .then()
                .statusCode(200)
        ;
    }

}
