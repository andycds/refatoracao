package br.usjt.refatoracao.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Cliente {
	@Getter
	private String nome;
	private List<Locacao> locacoes = new ArrayList<>();
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public void adicionarAluguel(Locacao arg){
		this.locacoes.add(arg);
	}
	
	public String cupom() {
		double valorTotal = 0.0;
		int totalPontosFidelidade = 0;
		StringBuilder resultado = new StringBuilder();
		resultado.append(cupomCabecalho());
		for (Locacao locacao : locacoes) {
			double valor = locacao.cobrar();
			totalPontosFidelidade += locacao.calcularPontosFidelidade();			
			resultado.append("\t").append(locacao.getFilme().getTitulo())
					.append("\t").append(valor).append("\n");
			valorTotal += valor;

		}
		//adiciona o rodapé
		resultado.append(cupomRodape(valorTotal, totalPontosFidelidade));
		return resultado.toString();
	}
	
	private String cupomCabecalho() {
		return "Cupom de Locação para " + getNome() + "\n";
	}
	
	private String cupomRodape(double valorTotal, int pontosFidelidadeTotal) {
		return "O total devido é " + valorTotal + "\n" +
				"Você juntou mais " + pontosFidelidadeTotal + " pontos de cliente fidelidade";
	}
}
