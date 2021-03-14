package Test;

import Element.Element;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {

	Metodos m = new Metodos();
	Element el = new Element();
	
	
	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {
	   m.OpenNav(site, "Acessando google");
	}

	@When("pesquisa nome {string}")
	public void pesquisa_nome(String string) {
	    
	}

	@Then("Valido nome {string} da pesquisa")
	public void valido_nome_da_pesquisa(String string) {
	  
	}

	
	
	
	
	
	
	@When("pesquisar nome {string}")
	public void pesquisar_nome(String string) {
	 
	}

	@Then("validar nome {string} da pesquisa")
	public void validar_nome_da_pesquisa(String string) {
	    
	}

	
	
	
}
