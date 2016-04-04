package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.Constants;
import Util.WebDriverFactory;

public class TestesSenai {

	
public void testeEntrarSenai(){
		
		// findElement(By.id)//(By.name)//(By.class)
		Constants constants = new Constants();
		
		
		String url ="http://estudante.sc.senai.br/";
			
		WebElement user, password, but, banner, sair, esqSenha,link , tag;
		WebDriver driver = new WebDriverFactory().getInstance(url, constants.FIREFOX);
		
		
		user = driver.findElement(By.id("edit-name"));
		user.sendKeys("fabiano_barroco");
		
		
		password = driver.findElement(By.name("pass"));
		password.sendKeys("RUIJ7317");
		
		but = driver.findElement(By.id("edit-submit"));
		but.click();
		
		banner = driver.findElement(By.className("banner--popup__close"));
		banner.click();
		
		sair = driver.findElement(By.cssSelector("a[href$='logout']"));
		sair.click();

	   /* Equals (=)
	    Starts with (^=)
	    Ends with ($=)
	    Contains (*=)
	    Contains in a list (~=)*/
		
		//esqSenha = driver.findElement(By.partialLinkText(" sua senha?"));
		esqSenha = driver.findElement(By.linkText("Esqueceu sua senha?"));
		esqSenha.click();
		
				
		//<input id="cpf" type="text" name="cpf" value="" style="width: 280px;">
		tag = driver.findElement(By.id("cpf"));
		tag.sendKeys("93339643393");
		
					
		//<a title="Espaço do Estudante" target="_blank" href="http://www.sc.senai.br/estudante/?_ga=1.181507682.431792142.1435323860">ESPAÇO DO ESTUDANTE</a>
		//link = driver.findElement(By.cssSelector(".gb_P"));
		//link.click();
		
	}		
}
