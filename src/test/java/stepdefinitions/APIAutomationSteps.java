package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class APIAutomationSteps {

    private Response response;

    @Given("I set base URI as {string}")
    public void setBaseURI(String uri) {

        RestAssured.baseURI = uri;
    }

    @When("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {

        response = RestAssured.get(endpoint);
    }

    @Then("I receive status code {int}")
    public void verifyStatusCode(int expectedStatusCode) {

        assertEquals(expectedStatusCode, response.getStatusCode());
    }
}
