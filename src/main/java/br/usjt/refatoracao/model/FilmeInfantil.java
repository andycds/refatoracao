package br.usjt.refatoracao.model;

public class FilmeInfantil extends Filme {

	public FilmeInfantil(String titulo) {
		super(titulo);
	}

	@Override
	double getTaxaDiaria() {
		return 1.5;
	}

	@Override
	int getMinimoDias() {
		return 3;
	}

	@Override
	double getValorMinimoLocacao() {
		return 1.5;
	}

}
