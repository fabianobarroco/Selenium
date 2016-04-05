package TestsCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.ConstantsUtil;
import Util.WebDriverUtil;

public class TestesSenai {

	ConstantsUtil constants = new ConstantsUtil();
	String resultExecucao = "";
	String url = "http://estudante.sc.senai.br/";
	WebElement user, password, but, banner, sair, esqSenha, link, tag, userLogado;
	WebDriver driver = WebDriverUtil.getInstance(url, ConstantsUtil.FIREFOX);

	public String validarLoginSenai() {

		try {

			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			user = driver.findElement(By.id("edit-name"));
			user.sendKeys("fabiano_barroco");

			password = driver.findElement(By.name("pass"));
			password.sendKeys("RUIJ7317");

			but = driver.findElement(By.id("edit-submit"));
			but.click();

		} catch (Exception e) {

			return resultExecucao += "ValidarLoginSenai " + ConstantsUtil.NAOPASSOU;
		}

		// System.out.println(resultExecucao);
		return resultExecucao += "ValidarLoginSenai " + ConstantsUtil.PASSOU;

	};

	public String fecharBannerSenai() {
		try {

			banner = driver.findElement(By.className("banner--popup__close"));
			banner.click();

		} catch (Exception e) {

			return resultExecucao += "FecharBannerSenai " + ConstantsUtil.NAOPASSOU;
		}

		// System.out.println(resultExecucao);
		return resultExecucao +=  "FecharBannerSenai " + ConstantsUtil.PASSOU;

	}

	public void name() {
		sair = driver.findElement(By.cssSelector("a[href$='logout']"));
		sair.click();

		/*
		 * Equals (=) Starts with (^=) Ends with ($=) Contains (*=) Contains in
		 * a list (~=)
		 */

		// esqSenha = driver.findElement(By.partialLinkText(" sua senha?"));
		esqSenha = driver.findElement(By.linkText("Esqueceu sua senha?"));
		esqSenha.click();

		// <input id="cpf" type="text" name="cpf" value="" style="width:
		// 280px;">
		tag = driver.findElement(By.id("cpf"));
		tag.sendKeys("93339643393");

		// <a title="Espaço do Estudante" target="_blank"
		// href="http://www.sc.senai.br/estudante/?_ga=1.181507682.431792142.1435323860">ESPAÇO
		// DO ESTUDANTE</a>
		// link = driver.findElement(By.cssSelector(".gb_P"));
		// link.click();
	}

}
