package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.ConstantsUtil;
import Util.WebDriverUtil;

public class TestesDigilab {

	ConstantsUtil constants = new ConstantsUtil();
	String resultExecucao = "";
	String url = "http://www.digilab.com.br/";
	WebElement link, tag, userLogado;
	WebDriver driver = WebDriverUtil.getInstance(url,ConstantsUtil.FIREFOX);

	public String aEmpresa() {

		try {

			// <a href="http://www.digilab.com.br/a-empresa/">A Empresa</a>
			// link = driver.findElement(By.linkText("A Empresa"));
			link = driver.findElement(By.cssSelector("#menu-item-3852>a"));
			link.click();

		} catch (Exception e) {

			return resultExecucao += "A Empresa " + ConstantsUtil.NAOPASSOU;
		}

		//System.out.println(resultExecucao);
		return resultExecucao = resultExecucao + "A Empresa " + ConstantsUtil.PASSOU;

	}

}
