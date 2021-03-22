package gerson4;

public class DescontoTipoB implements Desconto {

	@Override
	public double contarDesconto(double quantia) {
		return quantia * 0.25;
	}

}
