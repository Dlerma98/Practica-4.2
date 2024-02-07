package Ejercicio05;
public class Utilidades {
	
	public static String encripta(String frase) {
		char letra = ' ';
		String encriptado = "";
		for(int i = 0; i < frase.length(); i++) {
			
			letra = frase.charAt(i);
			letra += 3;
			encriptado = encriptado + letra;
		}
		return encriptado;
	}
}