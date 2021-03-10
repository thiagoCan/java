package Builder;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa()
				.comNome("Thiago")
				.comNaturalidade("São Paulo")
			    .comIdade(31);
		
		System.out.println(p);

	}

}
