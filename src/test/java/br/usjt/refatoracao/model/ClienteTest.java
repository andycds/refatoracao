package br.usjt.refatoracao.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	Cliente cliente;
	Filme infantil, normal, lancamento;
	Locacao locacao1, locacao2, locacao3;

	@Before
	public void setUp() throws Exception {
		infantil = new FilmeInfantil("Minions");
		normal = new FilmeNormal("Vingadores");
		lancamento = new FilmeLancamento("Batman vs Superman");
		locacao1 = new Locacao(infantil, 4);
		locacao2 = new Locacao(normal, 5);
		locacao3 = new Locacao(lancamento, 2);
		cliente = new Cliente("Lucas Jorge");
		cliente.adicionarAluguel(locacao1);
		cliente.adicionarAluguel(locacao2);
		cliente.adicionarAluguel(locacao3);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testCupom() {
		String esperado = "Cupom de Locação para Lucas Jorge\n"
				+ "\tMinions\t3.0\n"
				+ "\tVingadores\t6.5\n"
				+ "\tBatman vs Superman\t6.0\n"
				+ "O total devido é 15.5"
				+ "\nVocê juntou mais 4 pontos de cliente fidelidade";
		Assert.assertEquals("cupom ", esperado, cliente.cupom());
	}

	@Test
	public void testCalcularValor() {
		Assert.assertEquals("Minions 3.0", 3.0, locacao1.cobrar(), 0.001);
		Assert.assertEquals("Vingadores 6.5", 6.5, locacao2.cobrar(), 0.001);
		Assert.assertEquals("Batman 6.0", 6.0, locacao3.cobrar(), 0.001);
	}
	
	@Test
	public void testeCalcularPontosFidelidade() {
		Assert.assertEquals("Minions 3.0", 1, locacao1.calcularPontosFidelidade());
		Assert.assertEquals("Vingadores 6.5", 1, locacao2.calcularPontosFidelidade());
		Assert.assertEquals("Batman 6.0", 2, locacao3.calcularPontosFidelidade());
	}


}





































