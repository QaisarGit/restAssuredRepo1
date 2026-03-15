package restAssuredBDDstyle;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class bddSTYLE {

	// @Test
	    public void testGetRequest() {
		 given()
	            // Request setup (headers, parameters, body, etc.)
	        .when()
	            .get("https://github.com/QaisarGit/restAssuredRepo1") // The HTTP method and endpoint
	        .then()
	            .statusCode(200);
	        // Validation of status code
	          //  .body("data.id", equalTo(2)); // Validation of response body content
	    }
	 @Test(description="response")
	 public void bddResponse() {
		 Response response = given()
				    .baseUri("https://github.com/QaisarGit/") 
				    .when()
				    .get("/restAssuredRepo1")
				    .then() 
				    .statusCode(200)
				    .extract()
				    .response();
		 
		 System.out.println("success =========");
		  
		 
	 }
	 
}