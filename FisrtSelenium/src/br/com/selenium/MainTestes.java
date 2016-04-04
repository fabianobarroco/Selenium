package br.com.selenium;

import br.com.selenium.testCases.TestesGoogle;
import br.com.selenium.testCases.TestesSenai;

public class MainTestes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comentário testes
		
		TestesSenai teste1 = new TestesSenai();
		TestesGoogle teste2 = new TestesGoogle();
		
		
		teste1.testeEntrarSenai();
		teste2.testesGoogle();
		
	}

}
