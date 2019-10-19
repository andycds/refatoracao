package br.usjt.refatoracao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Filme {

	private String titulo;

	abstract double getTaxaDiaria();
	abstract int getMinimoDias();
	abstract double getValorMinimoLocacao();
	
	public int calcularPontosFidelidade(int diasLocados) {
		return 1;	
	}
}