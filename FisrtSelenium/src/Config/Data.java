package Config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

	public String dataAtual(){
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataAtual = hoje.format(formatador).toString(); 
		return dataAtual;
	}
	
	
}
