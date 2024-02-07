package Ejemplos;
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
    
    public boolean espar(int num) {
        if(num%2 == 0) {
        	return true;
        }
        return false;
    }
    
    public boolean esimpar(int num) {
    	if(num%2 == 1) {
        	return true;
        }
        return false;
    }
}