package aula90;

public class Aluguel {
	String estudante;
	String email;
	int quarto;
	
	public Aluguel(String estudante, String email, int quarto) {
		this.estudante = estudante;
		this.email = email;
		this.quarto = quarto;
	}
	
	public String toString() {
		return quarto
			   + ": "
			   + estudante
			   + ", "
			   + email;
	}
	
}
