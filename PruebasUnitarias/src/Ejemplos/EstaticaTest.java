package Ejemplos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstaticaTest {
	
	@Test
	public void testFactorial() {
		int resultado = Estatica.factorial(5);
		assertEquals(120, resultado);
	}
}