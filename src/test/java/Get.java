import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class Get {
	
	@Test
	void testGet() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	
}
	@Test
	void testPost() {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200);
		
	}
	
	}
	
	
