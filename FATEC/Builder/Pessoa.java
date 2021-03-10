package Builder;

public class Pessoa {
	
	private String nome;
	private String naturalidade;
	private int idade;
	
	public Pessoa() {
	}

	public Pessoa comNome(String nome) {
		this.nome = nome;
		//retorna o próprio nome.
		return this;
	}
	
	public Pessoa comNaturalidade (String naturalidade) {
		this.naturalidade = naturalidade;
		//retorna a própria naturalidade.
		return this;
	}
	
	public Pessoa comIdade(int idade) {
		this.idade = idade;
		
		return this;
	}	
	
	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	@Override
	public String toString() {
		
		return "Nome: " +
				getNome() +
				"\nNaturalidade: " +
				getNaturalidade() +
				"\nIdade: " +
				getIdade();
	}
}
