package gerson1;

public class Passeio implements TipoVeiculo {

	@Override
	public double valorConta(double alteracao) {
		return alteracao * 0.05;
	}

}
