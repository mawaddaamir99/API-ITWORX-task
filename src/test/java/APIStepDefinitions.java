import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APIStepDefinitions {
    Response response;

    @When("Call Activity API")
    public void CallAPI() {
        response = given().when().get("https://www.boredapi.com/api/activity");

    }

    @Then("Assert status code is 200")
    public void AssertStatusCode() {
        response.then().assertThat().statusCode(200);
    }

    @Then("Assert the activity is Teach your dog a new trick")
    public void AssertActivity() {
        response.then().assertThat().body("activity", equalTo("Teach your dog a new trick"));
    }
    @And("Assert the Type is relaxation")
    public void AssertActivityType() {
        response.then().assertThat().body("type", equalTo("relaxation"));
    }
}
