import org.testng.annotations.Test;

import Deserialization.ListUsers;
import io.restassured.RestAssured;

public class Desearialization {

	@Test
	public void DeTest() {
	
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		//ListUsers pojo = new ListUsers();
		
	
	ListUsers pojo=	RestAssured.given().when().get().as(ListUsers.class);
		
	System.out.println(pojo.getPage());
	System.out.println(pojo.getTotal());
	System.out.println(pojo.getSupport());
	System.out.println(pojo.getData().get(0));
	
	}
}
