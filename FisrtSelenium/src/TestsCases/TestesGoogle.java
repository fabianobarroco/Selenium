package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.Constants;
import Config.Excecao;
import Config.WebDriverSetup;

public class TestesGoogle {

	public String pesquisaGoogle(String parameter) {
		String url = "https://www.google.com.br/";
		WebDriver driver = WebDriverSetup.getInstance(url, Constants.FIREFOX);
		WebElement x1;

		try {
			

			x1 = driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
			x1.isEnabled();
			WebElement inputPesq = driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
			inputPesq.sendKeys(parameter);
						
			WebElement btPesq = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
			btPesq.click();

		} catch (Exception e) {

			return Excecao.returnTestCase("pesquisaGoogle", parameter, Constants.NAOPASSOU, e);
		}

		return Excecao.returnTestCase("pesquisaGoogle", parameter, Constants.PASSOU, null);

	}
}
