package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesGoogle {

			public void testesGoogle() {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com.br/");
			
			WebElement testeCss;
			
		
		//<a title="Espaço do Estudante" target="_blank" href="http://www.sc.senai.br/estudante/?_ga=1.181507682.431792142.1435323860">ESPAÇO DO ESTUDANTE</a>
			testeCss = driver.findElement(By.cssSelector(".gb_P"));
			testeCss.click();
		}
	}

	

