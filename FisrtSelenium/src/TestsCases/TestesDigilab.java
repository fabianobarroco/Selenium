package TestsCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Config.Constants;
import Config.Excecao;
import Config.WebDriverSetup;

public class TestesDigilab {

	String resultExecucao = "";

	public String url = "http://www.digilab.com.br/";
	public WebDriver driver = WebDriverSetup.getInstance(url, Constants.FIREFOX);
	public WebDriver driverUrl;
	public String menuSelecionado, urlPageSelecionada = "";
	public Excecao ex = new Excecao();

	public void open() {
		driver.navigate().to(url);
	}

	public String preecherFormulario() {

		try {

			String titulo = driver.getTitle();
			System.out.println(titulo);
			// Foco no elemento para acessar menu contato
			new Actions(driver).moveToElement(driver.findElement(By.id("menu-item-3783"))).perform();
			driver.findElement(By.cssSelector("#menu-item-3881>a")).click();

		
			WebElement formulario = driver.findElement(By.className("wpcf7-form"));
			 driver.findElement(By.name("your-name")).sendKeys("Fabiano");
			// driver.findElement(By.name("your-email")).sendKeys("fabianoBarroco@gmail.com");
			 driver.findElement(By.name("Empresa")).sendKeys("Digilab");
			 driver.findElement(By.name("Telefone")).sendKeys("4832323232");

			 Select selectbox = new Select(driver.findElement(By.name("Segmento")));
			 selectbox.selectByValue("OUTROS");
			driver.findElement(By.name("your-message")).sendKeys("Testes de preenchimento do formulário!!!");
			
			formulario.submit();
			
			//One or more fields have an error. Please check and try again.
			WebElement resultadoEnvioDoFormulario = driver.findElement(By.xpath(".//*[@id='wpcf7-f4350-p25-o1']/form/div[2]"));
			
			if(!resultadoEnvioDoFormulario.getText()
					.equalsIgnoreCase("Thank you for your message. It has been sent.")){
				
				return Excecao.returnTestCase("preecherFormulario", null, Constants.NAOPASSOU, null);
			}
			
				
		} catch (Exception e) {

			return Excecao.returnTestCase("preecherFormulario", null, Constants.NAOPASSOU, e);
		}

		return Excecao.returnTestCase("preecherFormulario", null, Constants.PASSOU, null);
	}

	public String verificarCamposObrigatorios() {

		// String span =
		// driver.findElement(By.className("wpcf7-not-valid-tip")).getTagName();
		// System.out.println(span);

		try {

			List<WebElement> spans = driver.findElements(By.className("wpcf7-not-valid-tip"));
			System.out.println("Quantidade de Objetos encontrados " + spans.size());

			for (WebElement sp : spans) {
				String campo = spans.getClass().getName();
				System.out.println(campo);

			}

			if (spans.size() == 3) {

				return Excecao.returnTestCase("verificarCamposObrigatorios", null, Constants.PASSOU, null);

			} else {

				return Excecao.returnTestCase("verificarCamposObrigatorios", null, Constants.NAOPASSOU, null);
			}

		} catch (Exception e) {

			return Excecao.returnTestCase("verificarCamposObrigatorios", null, Constants.NAOPASSOU, e);
		}
	}

	public String verificarCamposPreenchidosCorretamente() {

		try {

			driver.findElement(By.name("your-name")).getText().equalsIgnoreCase("Fabiano");
			driver.findElement(By.name("your-name")).getText().equalsIgnoreCase("");

		} catch (Exception e) {

			return Excecao.returnTestCase("verificarCamposPreenchidosCorretamente", null, Constants.NAOPASSOU, e);
		}

		return Excecao.returnTestCase("verificarCamposPreenchidosCorretamente", null, Constants.PASSOU, null);

	}

	public String verificarHintFacebook() {

		try {
			new Actions(driver).moveToElement(driver.findElement(By.className("facebook"))).perform();
			driver.findElement(By.className("cloud"));

		} catch (Exception e) {

			return Excecao.returnTestCase("verificarHintFacebook", null, Constants.NAOPASSOU, e);
		}

		return Excecao.returnTestCase("verificarHintFacebook", null, Constants.PASSOU, null);
	}

	public String navegacaoSiteProdutos(String parameter) {

		switch (parameter) {

		case "PlayChannel":

			menuSelecionado = ".//*[@id='menu-item-3963']/a";
			urlPageSelecionada = "http://www.digilab.com.br/playchannel/";
			break;

		case "PlayOut":
			menuSelecionado = ".//*[@id='menu-item-3962']/a";
			urlPageSelecionada = "http://www.digilab.com.br/playout/";
			break;

		}

		try {

			new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='menu-item-3780']/a"))).perform();
			driver.findElement(By.xpath(menuSelecionado)).click();
			
			
			if (!driver.getCurrentUrl().equalsIgnoreCase(urlPageSelecionada)) {

				return Excecao.returnTestCase("navegacaoSiteProdutos", parameter, Constants.NAOPASSOU, null);

			}

		} catch (Exception e) {

			return Excecao.returnTestCase("navegacaoSiteProdutos", parameter, Constants.NAOPASSOU, e);
		}

		return Excecao.returnTestCase("navegacaoSiteProdutos", parameter, Constants.PASSOU, null);
	}

		
		
}
