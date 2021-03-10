package Singleton;

public class Teste {
	
	private String informacao;
	private static Teste unico;

	public static Teste getTeste() {
		
		if(unico == null) {
			unico = new Teste();
		}
		return unico;
	}
	
	private Teste() {
	}
	
	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	
	
}
