package Ejemplos;
public class Estatica {
	
	public static int factorial(int num) {
		int aux = 1;
		
		if(num < 0) {
			return -1;
		}
		
		for (int i = 1; i <= num; i++) {
			aux = i * aux;
		}
		
		return aux;
	}
}