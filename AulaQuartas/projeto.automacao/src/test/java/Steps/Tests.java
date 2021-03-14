package Steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elemento;
import metodos.Metodos;

public class Tests {

	Metodos metodo = new Metodos();
	Elemento elemento = new Elemento();
	
	@Before
	public void setUp() throws Exception {
		
		metodo.abrirNavegador("https://www.original.com.br", "CHROME");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		metodo.esperar(3000);
		metodo.Clicar(elemento.bntabrir);
		metodo.digitar(elemento.Nome,"Lucas Souza Lima");
		metodo.digitar(elemento.Celular, "(11) 95566-5656");
		metodo.digitar(elemento.Email, "lucassilva3552@gmail.com");
		metodo.digitar(elemento.Cpf, "777.818.770-12");
		metodo.Clicar(elemento.btnEnviar);

	}

}
