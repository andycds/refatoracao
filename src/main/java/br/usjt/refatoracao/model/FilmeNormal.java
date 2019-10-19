package br.usjt.refatoracao.model;

public class FilmeNormal extends Filme {

	public FilmeNormal(String titulo) {
		super(titulo);
	}

	@Override
	double getTaxaDiaria() {
		return 1.5;
	}

	@Override
	int getMinimoDias() {
		return 2;
	}

	@Override
	double getValorMinimoLocacao() {
		return 2;
	}

}
