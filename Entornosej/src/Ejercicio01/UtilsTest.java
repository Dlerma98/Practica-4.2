package Ejercicio01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest {
	
	@Test
	public void testEsEquilatero() {
		//En esta prueba unitaria comprobamos que nos devuelve un triangulo equilatero pasandole 3 valores identicos
		String resultado = Utils.tipoTriangulo(4, 4, 4);
		assertEquals("EQUILATERO", resultado);
		
	}
	@Test
	public void testEsEscaleno() {
		String resultado = Utils.tipoTriangulo(4, 5, 6);
		assertEquals("ESCALENO", resultado);
		
	}
	
	@Test
	public void testEsIsosceles() {
		String resultado = Utils.tipoTriangulo(4, 4, 6);
		assertEquals("ISOSCELES", resultado);
		
	}
	
	@Test
	public void testError() {
		//En esta prueba unitaria comprobamos el mensaje de error enviando 3 valores que la suma de 2 de ellos no es mayor que el 3º por lo que no cumple la regla de los triangulos
		String resultado = Utils.tipoTriangulo(1, 1, 4);
		assertEquals("ERROR", resultado);
	}
	
	@Test
	public void testEsTRUE() {
		//Aqui comprobamos que las reglas son correctas y detecta que es un triangulo
		boolean resultado = Utils.esTriangulo(4, 4, 4);
		assertEquals(true, resultado);
	}
	
	@Test
	public void testEsFALSE() {
		//Aqui comprobamos que las reglas son correctas y detecta que no es un triangulo
		boolean resultado = Utils.esTriangulo(1, 1, 4);
		assertEquals(false, resultado);
	}
	@Test
	public void TestmasFrecuenteint() {
		//Aqui compruebo que nos devuelve el valor del primer elemento mas frecuente con 2 array diferentes
		int[] array1 = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int resultado1 = Utils.masFrecuenteInt(array1);
		assertEquals(4, resultado1);
		
		//Tal y como puede verse aqui nos devuelve el 3 y no el 4 ya que se repiten el mismo numero de veces pero el 3 es el primero
		int[] array2 = {1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};
		int resultado2 = Utils.masFrecuenteInt(array2);
		assertEquals(3, resultado2);
	}
	
	@Test
	public void TestbuscarInt() {
		//Aqui comprobamos que nos devuelva el indice del valor introducido
		int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int resultado = Utils.buscarInt(array, 2);
		assertEquals(4, resultado);
		
	}
	
	@Test
	public void TestnoencuentraInt() {
		//Aqui comprobamos que al introducir un valor que no esta en el array nos devuelve -1
		int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int resultado = Utils.buscarInt(array, 10);
		assertEquals(-1, resultado);
		
	}
	
}