package Steps;

import Metodos.metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidarGetUser {

	metodos metodo = new metodos();

	@Given("que acesse api do github")
	public void que_acesse_api_do_github() {
		metodo.acessarApi();
	}

	@When("enviar uma requisicao do tipo get")
	public void enviar_uma_requisicao_do_tipo_get() {
		metodo.imprimirGet();
	}

	@When("valido o username {string}, id {string}, name {string}, blog {string}, location {string} do usuario")
	public void valido_o_username_id_name_blog_location_do_usuario(String username, String id, String name, 
			String blog,String location) {
		metodo.body(username);
		metodo.body(id);
		metodo.body(name);
		metodo.body(blog);
		metodo.body(location);
		metodo.imprimirBodyResponse();
		
	}

	@Then("valido status code")
	public void valido_status_code() {
		metodo.statusCode(200);

	}
}
