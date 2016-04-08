package Config;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public String gerarArquivoLog(String parameter) throws IOException {

		try {
		
			FileWriter arq = new FileWriter("c:\\tabuada.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf(parameter);
			arq.close();

			System.out.println(Constants.LOG_GERADO);

		} catch (Exception e) {

			return Constants.LOG_ERRO;
		}

		return Constants.LOG_GERADO;
	}

	/*
	 * public String copiarArquivoLog(String parameter) throws IOException {
	 * 
	 * try {
	 * 
	 * BufferedReader reader = new BufferedReader(new
	 * FileReader("c:\\tabuada.txt"<img
	 * src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">);
	 * BufferedWriter writer = new BufferedWriter(new
	 * FileWriter("c:\\tabuada.txt"<img
	 * src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">);
	 * 
	 * String linha;
	 * 
	 * while((linha = reader.readLine()) != null){ writer.write(linha);
	 * writer.newLine(); } reader.close(); writer.flush(); writer.close();
	 * System.out.println(Constants.LOG_GERADO);
	 * 
	 * } catch (Exception e) {
	 * 
	 * return Constants.LOG_ERRO; }
	 * 
	 * return Constants.LOG_GERADO; }
	 */

}
