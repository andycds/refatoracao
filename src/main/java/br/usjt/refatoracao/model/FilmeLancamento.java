package br.usjt.refatoracao.model;

public class FilmeLancamento extends Filme {

	public FilmeLancamento(String titulo) {
		super(titulo);
	}

	@Override
	double getTaxaDiaria() {
		return 3;
	}

	@Override
	int getMinimoDias() {
		return 1;
	}

	@Override
	double getValorMinimoLocacao() {
		return 3;
	}

	@Override
	public int calcularPontosFidelidade(int diasLocados) {
		return diasLocados > 1 ? 2 : 1;	
	}

}
