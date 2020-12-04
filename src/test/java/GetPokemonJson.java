import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
 
public class GetPokemonJson {
	
	@Test
	void Test_02_post() {

		JSONObject request = new JSONObject();

		request.put("name", "Raghav123");

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
	public void getJson() {
		
		Response res = given()
				.get("https://reqres.in/api/users");
		assertEquals(200,res.getStatusCode());
		String json =res.asString();
		JsonPath jp =new JsonPath(json);
		assertEquals("Raghav123", jp.get("name"));
		//assertEquals("Teache12" , jp.get("job"));
	}

	
	}