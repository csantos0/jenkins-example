package br.com.synchro.jenkins;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.synchro.jenkins.Imposto;
import br.com.synchro.jenkins.Orcamento;

public class ImpostoTest {

	@Test
	public void deveCalcularImpostoDeDezPorCento() {
		Orcamento orcamento = new Orcamento(100.0);
		Imposto imposto = new Imposto();
		assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
	}
}
