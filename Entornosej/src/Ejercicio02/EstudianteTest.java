package Ejercicio02;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {

		 Estudiante estudiante1;
		 Estudiante estudiante2;
		 Estudiante estudiante3;
		
	@Before
	public void crearEstudiantes() {
		estudiante1 = new Estudiante("Alejandro", 22, 9.5);
		estudiante2 = new Estudiante("David", 25, 7.5);
		estudiante3 = new Estudiante("Pepe", 19, 0.5);
	}
	
	@Test
	public void testGetNombre() {
		
		String nombre1 = estudiante1.getNombre();
		assertEquals("Alejandro", nombre1);
		
		String nombre2 = estudiante2.getNombre();
		assertEquals("David", nombre2);
		
		
		String nombre3 = estudiante3.getNombre();
		assertEquals("Pepe", nombre3);
	}
	
	@Test
	public void testGetEdad() {
		int edad1 = estudiante1.getEdad();
		assertEquals(22, edad1);
		
		int edad2 = estudiante2.getEdad();
		assertEquals(25, edad2);
		
		
		int edad3 = estudiante3.getEdad();
		assertEquals(19, edad3);
		
	}
	@Test
	public void testGetNota() {
		double nota1 = estudiante1.getNota();
		assertEquals(9.5, nota1, 0.001);
		
		double nota2 = estudiante2.getNota();
		assertEquals(7.5, nota2, 0.001);
		
		
		double nota3 = estudiante3.getNota();
		assertEquals(0.5, nota3, 0.001);
	}
	@Test
	public void testObtenerEstadoAcademico() {
		String resultado1 = estudiante1.obtenerEstadoAcademico();
		assertEquals("Sobresaliente", resultado1);
		
		String resultado2 = estudiante2.obtenerEstadoAcademico();
		assertEquals("Notable", resultado2);
		
		String resultado3 = estudiante3.obtenerEstadoAcademico();
		assertEquals("Suspenso", resultado3);
	}
}