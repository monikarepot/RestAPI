import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PokemonGet1 {

	@Test
	 public void Get() {
		

		//given().
		//when().
		//then()
		//assert()
		
		given().
		when().
		      get("https://pokeapi.co/api/v2/ability/4").
		then().
		     assertThat().
		     statusCode(200).and().
		     body("effect_entries.language.name[0]", containsString("de")).
		     body("effect_entries.language.url[0]", containsString ("https://pokeapi.co/api/v2/language/6/"));
		     
		      
	}

		}