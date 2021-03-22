package gerson4;

public class PrecoFinal {
	
	private String nome;
	private double desc;
	private double valorProduto;

	public PrecoFinal() {
		
	}
	
	public PrecoFinal(String nome) {
		this.nome = nome;
	}

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double valorTotal() {
		return valorProduto - desc;
	}
}
