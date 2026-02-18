package andreas.wassmer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class BookResourceTest {
    @Test
    void testBooksEndpoint() {
        given()
          .when().get("/books")
          .then()
             .statusCode(200);
             // .body(is("Hello from Quarkus REST"));
    }

}