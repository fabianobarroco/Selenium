package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Util.ConstantsUtil;
import Util.WebDriverUtil;

public class TestesDigilab {

	ConstantsUtil constants = new ConstantsUtil();
	String resultExecucao = "";
	String url = "http://www.digilab.com.br/";
	String file = "file:///F:/eclipse/workspace/index.html";
	WebElement link, tag, userLogado, combo;
	WebDriver driver;// = WebDriverUtil.getInstance(url, ConstantsUtil.FIREFOX);

	public String lerArquivo() {
		
		driver = WebDriverUtil.getInstance(file, ConstantsUtil.FIREFOX);
		tag = driver.findElement(By.name("email"));
		tag.sendKeys("TESTE");
		String elemento = tag.getTagName();
		
		System.out.println(elemento);
		
		return "lerArquivo";
	}

	public String aEmpresa() {

		try {

			String titulo = driver.getTitle();
			System.out.println(titulo);
			// <a href="http://www.digilab.com.br/a-empresa/">A Empresa</a>
			// link = driver.findElement(By.linkText("A Empresa"));

			// final Select selectbox = (Select) new
			// Select(driver.findElement(By.className("has-sub-menu"))).getFirstSelectedOption();
			// Foco no elemento
			new Actions(driver).moveToElement(driver.findElement(By.id("menu-item-3783"))).perform();
			link = driver.findElement(By.cssSelector("#menu-item-3881>a"));
			link.click();
			Select selectbox = (Select) new Select(driver.findElement(By.name("Segmento")));
			selectbox.selectByValue("Operadora");

		} catch (Exception e) {
			return resultExecucao += "A Empresa " + ConstantsUtil.NAOPASSOU;
		}

		return resultExecucao += "A Empresa " + ConstantsUtil.PASSOU;

	}

}
