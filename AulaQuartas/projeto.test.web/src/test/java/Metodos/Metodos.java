package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Elementos.Elementos;

public class Metodos {

	WebDriver driver;

	Elementos elemento = new Elementos();

	public void abrirNavegador(String url, String browser) {

		// switch(browser){
		// case "CHROME"
		// System.setPropety("","");
		// driver = new ChromeDriver();
		// driver.get(url);
		// driver.manage.window().maximaze();
		// break;
		// case "FIREFOX"
		// System.setPropety("","");
		// driver = new FirefoxDriver();
		// driver.get(url);
		// driver.manage.window().maximaze();
		// break;
		// default:
		// System.out.println("Digite um navegador CHROME ou FIREFOX")
		// break;
//	}

		if (browser == "CHROME") {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else if (browser == "FIREFOX") {

			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();

		} else {

			System.out.println("Digite CHROME ou FIREFOX");

		}

	}

	public void digitar(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void sair() {

		driver.quit();
		System.out.println("Finalizando teste");

	}
	
	public void validar(String texto, By elemento) {
		
		String txt = driver.findElement(elemento).getText();
		assertEquals(txt, texto);
		
	}
	
	
	

}
