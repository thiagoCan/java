package gerson;

import gerson1.TipoVeiculo;

public class ContaEstacionamento {
	
	private double precoPorDia;
	private double precoPorMes;
	
	TipoVeiculo tipoVeiculo;

	public ContaEstacionamento(double precoPorDia, double precoPorMes, TipoVeiculo tipoVeiculo) {
		this.precoPorDia = precoPorDia;
		this.precoPorMes = precoPorMes;
		this.tipoVeiculo = tipoVeiculo;
	}
	
	

	public void CalcularValor(Veiculo veiculo) {
		
		long t1 = veiculo.getInicio().getTime();
		long t2 = veiculo.getFim().getTime();
		
		double hora = (double) (t2 - t1)/1000/60/60;
		double dia = (double) hora/24;
		double mes = (double) diffMes(t1, t2);
		
		double valor;
		if (hora <= 12) {
			valor = Math.ceil(hora) * 2;
		}
		else if (hora > 12 && dia <= 15) {
			valor = Math.ceil(dia) * precoPorDia;
		}
		else {
			valor = Math.ceil(mes) * precoPorMes;
		}
		
		veiculo.setValor(valor);
		veiculo.setAlteracao(tipoVeiculo.valorConta(valor));
	}

	private static double diffMes (long t1, long t2) {
		
		double faixa = 2678400000.0;
		
		return (t2 - t1) / faixa;
	}
}