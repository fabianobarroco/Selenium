package TestsCases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Config.Constants;
import Config.WebDriverSetup;

public class TestesFile {

	Constants constants = new Constants();
	String resultExecucao = "";
	String file = "file:///F:/eclipse/workspace/index.html";
	WebElement link, tag, userLogado, combo, searchbox;
	WebDriver driver;// = WebDriverUtil.getInstance(url, ConstantsUtil.FIREFOX);

	public void planilha() {

		driver = WebDriverSetup.getInstance(file, Constants.FIREFOX);
		searchbox = driver.findElement(By.name("email"));

		try {

			// carrega arquivo com planilha
			FileInputStream  excelFileToRead = new FileInputStream(new File("C:\\plan.xlsx"));
			XSSFWorkbook xss = new XSSFWorkbook(excelFileToRead);
			
			System.out.println("Antes de recuperar os valores");
		
			
			// recupera primeira planilha (aba)
			//XSSFSheet sheet = workbook.getSheetAt(0);
			// pega o valor da primeira célula (A1)
		//	String simcard = sheet.getRow(0).getCell(0).getStringCellValue();
			
			//System.out.println(simcard);
			// fecha planilha e arquivo (não precisa fechar os dois)
			 //workbook.close();

			// envia o valor da célula para o campo
	//		searchbox.sendKeys(simcard);

			// envia o formulário (precisa ser um form normal, se a tela usar
			// JavaScript pode não funcionar)
			// searchbox.submit();

			// aguarda 10 segundos (esperar carregar os dados, talvez)
//			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		//System.out.println(searchbox);
		//return searchbox.getText();

	}

	public String lerArquivo() {

		driver = WebDriverSetup.getInstance(file, Constants.FIREFOX);
		tag = driver.findElement(By.name("email"));
		tag.sendKeys("TESTE");
		String elemento = tag.getTagName();

		System.out.println(elemento);

		return "lerArquivo";
	}
}
