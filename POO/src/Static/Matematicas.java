package Static;

public class Matematicas {
	public static final double pi = 3.1415926535897;
	
	public static double potencia(int base, int exponente) {
		double acumulado = base;
		for(int i = 1; i < exponente; i++) {
			acumulado *= base;
		}
		
		return acumulado;
	}

}
