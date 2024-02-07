package Ejemplos;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora;
	
    @Before
    public void preparacion() {
    	System.out.println("Preparacion");
    	this.calculadora = new Calculadora();
    }
    
    @Test
    public void testSumar() {
    	System.out.println("Test Sumar");
        //Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
    	System.out.println("Test restar");
    	//Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }
    
    @Test
    public void testImpar() {
    	System.out.println("Test es impar");
    	//Calculadora calculadora = new Calculadora();
        boolean resultado = calculadora.esimpar(5);
        assertEquals(true, resultado);
    }
    @Test
    public void testPar() {
    	System.out.println("Test es par");
    	// Calculadora calculadora = new Calculadora();
        boolean resultado = calculadora.espar(4);
        assertEquals(true, resultado);
    }
}

