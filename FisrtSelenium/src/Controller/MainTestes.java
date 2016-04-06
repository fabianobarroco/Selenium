package Controller;

import TestsCases.TestesDigilab;
//import TestsCases.TestesGoogle;
import TestsCases.TestesSenai;
import Util.EmailUtil;

public class MainTestes {

	static String LOG = "";

	public static void main(String[] args) {

		//TestesSenai case1 = new TestesSenai();
		TestesDigilab case3 = new TestesDigilab();
		// TestesGoogle case2 = new TestesGoogle();

		//LOG += case1.validarLoginSenai();
		//LOG += case1.fecharBannerSenai();
		LOG += case3.aEmpresa();
		// case2.testesGoogle();

		//EmailUtil mail = new EmailUtil();
		//mail.envioEmail(LOG);

		System.out.println(LOG);
	}

}
