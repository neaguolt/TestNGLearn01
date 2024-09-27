package stepsDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static utility.PayLoad.*;



public class TestApiSteps {
    private static final Logger logger = LoggerFactory.getLogger(TestApiSteps.class);
    private Response response;
    private RequestSpecification request;

    @Given("the user has address for sending data to API")
    public void the_user_has_address_sending_data_to_API() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        logger.info("**baseURI set** {} \n", RestAssured.baseURI);
        request = given().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(addPlace());
        logger.info("**Body** {}\n",addPlace());
    }
    @When("the user sends new data to API")
    public void the_user_sends_new_data_to_API() {
        response = request.when().post("maps/api/place/add/json");
    }
    @Then("the response should be ok from API")
    public void the_response_should_be_ok_from_API() {
        response.then().log().all()
                .assertThat().statusCode(200)
                .body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)");
    }
}
