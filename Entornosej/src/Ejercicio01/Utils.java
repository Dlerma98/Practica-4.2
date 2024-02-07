package Ejercicio01;
public class Utils {
	public static String tipoTriangulo(int a, int b, int c) {
		boolean resultado = esTriangulo(a, b, c);
		
		if(resultado == false) {
			return  "ERROR";
		}
		if (a == b && b == c && a == c) {
			return "EQUILATERO";
		}else if (a != b && b != c && a != c) {
			return "ESCALENO";
		}else {
			return "ISOSCELES";
		}
	
	}
	public static boolean esTriangulo(int a, int b, int c) {
		
		if(a + b > c && a + c > b && b + c > a) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int masFrecuenteInt(int[] array) {
		int contador = 0;
		int maximo = 0;
		int indice = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j] ) {
					contador ++;
				}
			}
			if(contador > maximo) {
				maximo = contador;
				indice = array[i];
			}
			contador = 0;
		}
		return indice;
	}
	public static int buscarInt(int[] array, int num) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				return i;
			}
		}
		return -1;
	}
}