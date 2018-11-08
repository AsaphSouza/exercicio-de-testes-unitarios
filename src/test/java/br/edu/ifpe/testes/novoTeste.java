package br.edu.ifpe.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static java.time.Duration.ofSeconds;
import org.junit.jupiter.api.Test;

import br.edu.ifpe.source.*;
import br.edu.ifpe.source.Cachorro;

class novoTeste {
	
	private float a = 10;
	private float b = 20;

	@Test
	void testaIgualdade() {
		assertEquals(a, b);
	}
	@Test
	void testeDiferenca() {
		assertNotEquals(a,b);
	}
	@Test
	void TestarSeObjetosSaoIguais() {
		Cachorro c1 = new Cachorro("Totó");
		Cachorro c2 = new Cachorro("Totó");
		
		assertEquals(c1, c2);
	}
	
	/* Teste da classe Calculadora*/
	Calculadora c = new Calculadora();
	@Test
	void testSomar() {
		assertEquals(10, c.somar(3, 7));
		assertNotEquals(10, c.somar(5, 6));
	}
	@Test
	void testDividir() {
		assertEquals(0, c.dividir(20, 0));
		assertNotEquals(10, c.dividir(5, 6));
	}
	@Test
	void testSubtrair() {
		assertEquals(0, c.subtrair(20, 0));
		assertNotEquals(10, c.subtrair(5, 6));
	}
	@Test
	void testMultiplicar() {
		assertEquals(0, c.multiplicar(20, 0));
		assertNotEquals(10, c.multiplicar(5, 6));
	}
	
	/*TESTAR SE SÃO O MESMO OBJETO*/
	@Test
	void verificarMesmoObjeto () {
		Cachorro cachorro = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		
		assertSame(cachorro, cachorro2);
		
	}
	@Test
	void verificarNaoIgualdade() {
		Cachorro cachorro = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		assertNotSame(cachorro, cachorro2);
	}
	/*TESTE NULL E NOT NULL*/
	@Test
	void verificaNulo () {
		Cachorro cachorro = null;
		assertNull(cachorro);
	}
	@Test
	void verificaNaoNulo () {
		Cachorro cachorro = null;
		assertNotNull(cachorro);
	}
	@Test
	void testarVerdadeiro() {
		assertTrue(a > b);
	}
	@Test
	void testarFalso () {
		assertFalse(a > b);
	}
	// TESTE DE TIME 
	@Test
	void testarDemora () {
		assertTimeout(ofSeconds(3),
				() -> {
					Thread.sleep(5000);
					System.out.println("deu pau.");
				});
		
	}
}
