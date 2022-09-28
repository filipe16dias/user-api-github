package Metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class metodos {

	Response response;
	String url = "https://api.github.com/users/mojombo";

	public Response acessarApi(){
		response = RestAssured.get(url);
		return response;		
	}
	
	public void imprimirGet() {
		System.out.println(" >>>> Requisição GET: " + url);
	}

	public void body(String texto) {
		String bodyResponse = response.asPrettyString();
		assertTrue(bodyResponse.contains(bodyResponse));
	}

	public void imprimirBodyResponse() {
		String bodyResponse = response.asPrettyString();
		System.out.println(" >>>> USUÁRIO VALIDADO: " + bodyResponse);
		System.out.println("");
	}

	public void statusCode(int status) {
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
		System.out.println(" >>>> STATUS CODE: " + statusCode);
		System.out.println("");
	}
}
