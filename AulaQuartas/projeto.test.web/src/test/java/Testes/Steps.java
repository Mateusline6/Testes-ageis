package Testes;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que eu esteja no google {string}")
	public void que_eu_esteja_no_google(String url) {
		metodo.abrirNavegador(url, "CHROME");
	}

	@When("pesquisar {string}")
	public void pesquisar(String string) {
		metodo.digitar(elemento.pesquisa, string);
		
	}

	@Then("valido o texto {string}")
	public void valido_o_texto(String string) {
		
	}

}
