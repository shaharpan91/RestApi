package Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import methods.RestGetMethods;
import methods.RestPostMethod;

import static io.restassured.RestAssured.*;

public class StepDefination {

	@Given("^Api is running for \"([^\"]*)\"$")
	public void api_is_running_for(String url) throws Throwable {
		given().contentType(ContentType.JSON);
	}
	
	@And("^I perform GET method for the user id \"([^\"]*)\"$")
	public void i_perform_GET_method_for_the_user_id(String id) throws Throwable {
		RestGetMethods.simpleGetMethod(id);
	}

	@Then("^I should see the title as \"([^\"]*)\"$")
	public void i_should_see_the_title_as(String title) throws Throwable {
	}

	@And("^Status code Should be (\\d+)$")
	public void status_code_Should_be(int statusCode) throws Throwable {
	}
	
	@Given("^I perform post operation for \"([^\"]*)\"$")
	public void i_perform_post_operation_for(String url) throws Throwable {
		RestPostMethod.PerformPostWithParameter(url);
	}
}
