package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	//Acessar Class Do Selenium WebDriver e Coloca-lo em uma Variavel E fazer o Import da 
	
	WebDriver driver;
	
	
			/**
			 * Metodo para abrir o navegador especifico
			 * @author mateus
			 * @param url
			 * @param browser
			 */
	
	public void abrirNavegador(String url, String browser){
		
		
			if(browser  == "CHROME") {
				
				//Fazer o Setup do navegador, pegando os exe. da pasta Driver
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				
				//abrir navegador
				driver = new ChromeDriver();
				
				//acessar o site
				driver.get(url);
				
				driver.manage().window().maximize();
				
				
			}else if(browser == "FIREFOX") {

				//Fazer o Setup do navegador, pegando os exe. da pasta Driver
				System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
				
				//abrir navegador
				driver = new FirefoxDriver();
				
				//acessar o site
				driver.get(url);
				
			}else {
				
				System.out.println("Por favor digite CHROME ou FIREFOX");
				
			}
		
		
	}
	
	
	/**
	 * Metodo para digitar um texto em algum campo.
	 * @author mateus
	 * @param elemento
	 * @param texto
	 */

	public void digitar(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	
	/**
	 * Metodo tempo de carregamento/ metodo esperar
	 * @author mateus
	 * @param tempo
	 * @throws InterruptedException 
	 */
	
	public void esperar(int tempo) throws InterruptedException {
		
		
		Thread.sleep(tempo);
		
	}
	
	
	/**
	 * Fechar todas as Abas
	 * Para fechar aba especifica utilizar o close(); .
	 */
	
	public void fechar(){
		
		driver.quit();
		System.out.println("Finalizando o teste");
		
	}
	
	
	
	/**
	 * Metodo para clicar em algum elemento
	 * @param elemento
	 */
	public void Clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}
	
	
	
	
	
}
