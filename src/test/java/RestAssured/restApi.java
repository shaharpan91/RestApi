package RestAssured;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restApi {

	@Test
	public void test_numberOfDriver() {

		given().when().get("http://ergast.com/api/f1/2017/drivers.json").then().assertThat()
				.body("MRData.DriverTable.Drivers.driverId", hasSize(25));
		
		
	}

}
