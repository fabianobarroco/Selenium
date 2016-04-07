package Config;

public class Excecao {

	public static String resultExecucao = "";

	public final static String returnTestCase(String testCase, String parameter, String resultado, Exception e) {

		if (parameter == null && e == null) {

			return resultExecucao = "\n" 
					+ testCase + " - " + resultado + "\n"
					+ "-----------------------------------------------------------";
		}

		if (e == null) {

			return resultExecucao = "\n" + testCase + " - " + "Parametro - " + parameter + " " + resultado + "\n" + "\n"
					+ "-----------------------------------------------------------";

		}

		return resultExecucao = "\n" + testCase + " - " + "Parametro - " + parameter + " " + resultado + "\n"
				+ e.getMessage() + "\n" + "-----------------------------------------------------------";
	}
}