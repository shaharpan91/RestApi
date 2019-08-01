package Base;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PostStepDefination {

	@Test
	public void Registration() {

		baseURI = "http://dummy.restapiexample.com/api/v1";
		String requestBody = "{\"name\":\"Adi\",\"salary\":\"23244\",\"age\":\"23\"}";
		
		Response response = null;
		try {
			response = given().contentType(ContentType.JSON)
					.body(requestBody)
					.post("/create");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(200, response.getStatusCode());
		
		System.out.println("The status code recieved: " + response.getStatusCode());
		System.out.println("Response body: " + response.asString());
		System.out.println("Response body: " + response.asString().contains("Adi"));

	}

}
