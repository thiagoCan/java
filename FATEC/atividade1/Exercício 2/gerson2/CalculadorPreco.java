package gerson2;

import gerson3.Desconto;

public class CalculadorPreco {

	private double quantia;

	private Desconto desconto;

	public CalculadorPreco(double quantia, Desconto desconto) {
		this.quantia = quantia;
		this.desconto = desconto;
	}

	public void ProcessarDesconto(PrecoFinal precoFinal) {

		double v = desconto.contarDesconto(quantia);

		precoFinal.setDesc(v);
		precoFinal.setValorProduto(quantia);

	}
}
