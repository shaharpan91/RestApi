package method;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import io.restassured.http.ContentType;

public class RestGetMethods {
	
	public static void simpleGetMethod (String id) {
		given().contentType(ContentType.JSON).
				when().get(String.format("https://jsonplaceholder.typicode.com/posts/%s", id)).
		then().body("title", containsString("qui est esse")).and().
				header("Content-Type", containsString("application/json")).
				statusCode(200);
		
	}

}
