package gerson4;

public class PrecoFinal {
	
	private double desc;
	private double valorProduto;
	
	private Produto produto;
	

	public PrecoFinal(Produto produto) {
		this.produto = produto;
	}
	public PrecoFinal() {
		// TODO Auto-generated constructor stub
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
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double valorTotal() {
		return valorProduto - desc;
	}
}
