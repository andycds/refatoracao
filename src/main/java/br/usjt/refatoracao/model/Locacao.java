package br.usjt.refatoracao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Locacao {
	private Filme filme;
	private int diasLocados;
	
	public double cobrar() {
		double totalLocacao = filme.getValorMinimoLocacao();
		if (getDiasLocados() > filme.getMinimoDias()) {
			totalLocacao += (getDiasLocados() - filme.getMinimoDias()) * filme.getTaxaDiaria();
		}
		return totalLocacao;
	}

	public int calcularPontosFidelidade() {
		return filme.calcularPontosFidelidade(diasLocados);
	}

}




























