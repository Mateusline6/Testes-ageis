package Metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	// lição implementar como atributo do metodo chrome e fireFox

	WebDriver driver;

	public void OpenNav(String url, String description) {

		try {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			// tempo de carregamento do site
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Iniciando");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Falha no passo" + description);
		}

	}
	// implementar evidencia de erro

	public void digitar(By elemento, String texto, String description) {

		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Falha no passo " + description);
		}

	}

	// aguarda ate o elemento ser clicavel
	public void aguardarClick(By elemento, String description) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Falha no passo " + description);
		}
	}
	//Aguarda ate o elemento ser visivel 
	public void aguardar(By elemento) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elemento));

	}
	// Pausa a aplicação
	public void sleep(int tempo) throws InterruptedException {
		
		Thread.sleep(tempo);
		
		
	}

}
