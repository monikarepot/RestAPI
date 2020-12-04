
import org.testng.annotations.Test;

import io.restassured.mapper.ObjectMapper;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetPokemon3 {

	@Test
	public void Get() {
		
		

	    given().
		when().
		get("https://pokeapi.co/api/v2/pokemon/1").
		then().extract();
//		assertThat().
//		statusCode(200).and().
//		body("abilities.ability.name[0]", containsString("overgrow")).
//		body("abilities.ability.url[0]", containsString ("https://pokeapi.co/api/v2/ability/65/"));

	}

}
