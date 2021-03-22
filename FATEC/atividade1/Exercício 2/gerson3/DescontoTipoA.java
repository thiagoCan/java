package gerson3;

public class DescontoTipoA implements Desconto {

	@Override
	public double contarDesconto(double quantia) {
		return quantia * 0.05;
	}

}
