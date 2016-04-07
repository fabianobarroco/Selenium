package Controller;

import java.io.IOException;

import Config.Constants;
import Config.Email;
import TestsCases.TestesDigilab;

public class MainTestes{

	static String LOG = "";

	public static void main(String[] args){

		
		TestesDigilab formulario = new TestesDigilab();
		//TestesSenai loginSenai = new TestesSenai();
	    //TestesGoogle google = new TestesGoogle();
		//TestesFile file = new TestesFile();
		//LOG += file.lerArquivo();
	    //file.planilha();
		//LOG += loginSenai.validarLoginSenai();
		//LOG += loginSenai.fecharBannerSenai();
		//LOG += google.pesquisaGoogle("Terra");
		//formulario.open();
		//LOG += formulario.preecherFormulario();
		//LOG += formulario.verificarCamposObrigatorios();
		//LOG += formulario.verificarHintFacebook();
		LOG += formulario.navegacaoSiteProdutos(Constants.PLAYCHANNEL);
		LOG += formulario.navegacaoSiteProdutos(Constants.PLAYOUT);
		
		System.out.println(LOG);
		
		Email mail = new Email();
		mail.envioEmail(LOG);

		
	}
	// http://pt.slideshare.net/vandersonsilva9615/02-treinamentodbehaveweb  demoiselle
	// http://pt.stackoverflow.com/questions/62934/c%C3%B3digo-selenium-webdriver-para-de-executar-ap%C3%B3s-ler-planilha-com-apache-poi/62958#62958 Ler valores em Planilha
	//http://www.guj.com.br/t/validar-um-cadastro-utilizando-selenium-webdriver/280617 formulário
	//http://blog.caelum.com.br/organizacao-de-testes-de-aceitacao-com-pageobjects/ //Refactorando 
	//http://pythonclub.com.br/selenium-parte-4.html#actionschains-operacoes-avancadas
	//http://www.qualister.com.br/blog/introducao-ao-selenium-ide
	//https://www.youtube.com/watch?v=0bHk7HCbcDQ
	//https://github.com/demoiselle/behave/blob/master/impl/runner/webdriver/src/main/java/br/gov/frameworkdemoiselle/behave/runner/webdriver/ui/WebBase.java
}
