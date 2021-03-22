package gerson;

import java.util.Date;

import gerson.throwable.exception.DomainException;

public class Veiculo {
	
	private Date inicio;
	private Date fim;
	
	private double valor;
	private double alteracao;

	public Veiculo(Date inicio, Date fim) throws DomainException {
		
		if(fim.before(inicio)) {
			throw new DomainException("Error: Data de fim deve ser maior que data de início.");
		}
		
		this.inicio = inicio;
		this.fim = fim;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public Double getAlteracao() {
		return alteracao;
	}

	public void setAlteracao(Double alteracao) {
		this.alteracao = alteracao;
	}
	
	public double valorTotal () {
		return valor + alteracao;
	}
	
}
