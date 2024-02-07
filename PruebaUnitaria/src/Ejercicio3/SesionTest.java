package Ejercicio3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SesionTest {
	Sesion usuario1;
	Sesion usuario2;
	Sesion usuario3;
	Sesion usuario4;

	@Before
	public void inicializar() {
		this.usuario1 = new Sesion();
		this.usuario2 = new Sesion();
		this.usuario3 = new Sesion();
		this.usuario4 = new Sesion();
	}

	@Test
	//Realizamos unos inicios con usuario y contraseña existente
	public void testSesionCorrecto() {
		boolean resultado1 = usuario1.login("pepe", "1234");
		assertTrue(resultado1);
		boolean resultado2 = usuario2.login("David", "1234");
		assertTrue(resultado2);

	}

	@Test
	//Realizamos unos inicios con usuarios y/o contraseña incorrecta
	public void testSesionInorrecto() {
		boolean resultado1 = usuario3.login("Fernando", "1234");
		assertFalse(resultado1);
		boolean resultado2 = usuario4.login("David", "4321");
		assertFalse(resultado2);
	}
}