package restASSUREDpack;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restASSUREDclass {
	//@Test (description="get method ")
	public void  restAssured() { 
	
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// specify the method type (GET) and the parameters if any. 
		//In this case the request does not take any parameters 
		Response response = httpRequest.request(Method.GET, "");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Status code  received => " + response.statusCode()); 

		System.out.println("Response=>" + response.prettyPrint());
    }
	@Test(description="get method 1")
	
 	public void getMeth() {
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

		// Get the RequestSpecification of the request that is to be sent
		// to the server.
		RequestSpecification httpRequest = RestAssured.given();

		// Call RequestSpecification.get() method to get the response.
		// Make sure you specify the resource name.
		Response response = httpRequest.get("");

		// Response.asString method will directly return the content of the body
		// as String.
		System.out.println("Response Body is =>  " + response.asString());
		System.out.println("status code and \n" +response.statusCode() +"\nstatus codeline \n" +response.statusLine());
	}
}


