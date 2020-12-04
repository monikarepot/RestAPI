
	import org.testng.annotations.Test;

	import static io.restassured.RestAssured.*;

	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;

	public class PokemonGet2 {

		@Test
		public void Get() {
			

			//given().
			//when().
			//then()
			//assert()
			
			given().
			when().
			      get("https://pokeapi.co/api/v2/pokemon/ditto").
			then().
			     assertThat().
			     statusCode(200).and().
			     body("abilities.ability.name[0]", containsString("limber")).
			     body("abilities.ability.url[0]", containsString ("https://pokeapi.co/api/v2/ability/7/"));
			     
			      
		}

			}
