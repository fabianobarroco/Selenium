package Config;

public class Constants {

	/* Browsers constants */
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String OPERA = "opera";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String PASSOU = "Passou" + "\n";
	public final static String NAOPASSOU = "Não Passou" + "\n";
	public static final String PLAYCHANNEL = "PlayChannel";
	public static final String PLAYOUT = "PlayOut";
	public static final String LOG_GERADO = "Arquivo de Log gerado com sucesso!";
	public static final String LOG_ATUALIZADO = "Arquivo de Log atualizado com sucesso!";
	public static final String LOG_ERRO = "Não foi possível gerar/atualizar Arquivo de Log!";
	
	public static String getLogGerado() {
		return LOG_GERADO;
	}
	public static String getLogAtualizado() {
		return LOG_ATUALIZADO;
	}
	public static String getLogErro() {
		return LOG_ERRO;
	}
	public static String getPlaychannel() {
		return PLAYCHANNEL;
	}
	public static String getPlayout() {
		return PLAYOUT;
	}
	public static String getPassou() {
		return PASSOU;
	}
	public static String getNaopassou() {
		return NAOPASSOU;
	}
	public static String getChrome() {
		return CHROME;
	}
	public static String getFirefox() {
		return FIREFOX;
	}
	public static String getOpera() {
		return OPERA;
	}
	public static String getInternetExplorer() {
		return INTERNET_EXPLORER;
	}

	
}
