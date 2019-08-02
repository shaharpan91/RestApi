package methods;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

import org.apache.commons.lang3.RandomStringUtils;

public class RestPostMethod {
	
	public static void PerformPostWithParameter(String url) {
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = false;
	    String generatedStringForName = RandomStringUtils.random(length, useLetters, useNumbers);
		String requestBody = "{\"name\":\""+generatedStringForName+"\",\"salary\":\"2324354\",\"age\":\"34\"}";
		
		given().contentType(ContentType.JSON)
				.body(requestBody)
				.post(url).then().assertThat().
				body("name", hasItem(containsString(generatedStringForName))).and().
				statusCode(200);
				
	}
	
}