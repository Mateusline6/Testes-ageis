package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// Junit executa o cucumber 
@RunWith(Cucumber.class) 
@CucumberOptions(
//caminho das features
		features = "./src/test/resources/feature",
		
		// mostrar o nome do pacote com os meus testes
		glue = "Test",
		
		// Indicar qual tag deve ser executada 
		
		tags =  "@chucknorris and not @test2",
		
		// melhorar a formatação do console | criar um report em html
		plugin = {"pretty","html:target/report.html"},
		
		
		//limpar console
		monochrome = true
		
		)

public class Execute {

}
