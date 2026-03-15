package restASUUREDMethods;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getMethod {
	 @Test
	    public void testGetStatusCodeAndBody() {
	        // Specify the base URI
	        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

	        // Send the GET request and store the response
	        Response response = RestAssured.given().when().get();

	        // Print the status line
	        System.out.println("Status received => " + response.getStatusLine());

	        // Print the response body in a readable format
	        System.out.println("Response body => " + response.prettyPrint());
	    }
	}

