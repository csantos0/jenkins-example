/**
 * 
 */
package br.com.synchro.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author cvs
 * @create Jan 13, 2015
 */
public class Imposto2Test {

    @Test
    public void deveCalcularDezPorcentoDeImpostoSobreQuinhentos() {
	System.out.println("testeee2.....");
	final Orcamento orcamento = new Orcamento(500.0);
	final Imposto imposto = new Imposto();
	assertEquals(50.0, imposto.calcula(orcamento), Double.MIN_VALUE);
    }

}
