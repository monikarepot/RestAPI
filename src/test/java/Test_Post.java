import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_Post {

	@Test
	void Test_02_post() {

		JSONObject request = new JSONObject();

		request.put("name", "Raghav123");
		request.put("job", "Teache123r");

		System.out.println(request);
		System.out.println(request.toJSONString());

	Response res =	given().
		  header("Content-Type", "application/json").
		  contentType(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  put("https://reqres.in/api/users").
		then().extract().response();
	System.out.println(res.asString());
		
			
		}
	
	@Test
	void Test_03_patch() {
		
		JSONObject request = new JSONObject();

		request.put("name", "Raghav");
		request.put("job", "Teacher");

		System.out.println(request);
		System.out.println(request.toJSONString());

		given().
		  header("Content-Type", "application/json").
		  contentType(ContentType.JSON).
		  body(request.toJSONString()).
		when().
		  patch("https://reqres.in/api/users/2").
		then().
		  statusCode(200);

	}
	
	@Test
	
	public void test_04_delete()
	{
	
	when().
	  delete("https://reqres.in/api/users/2").
	 then().
	  statusCode(204).
	  log().all();
	
	}


}
