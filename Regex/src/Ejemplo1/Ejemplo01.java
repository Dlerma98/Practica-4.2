package Ejemplo1;

import java.util.regex.*;

//Comprueba si la cadena contiene exactamente el patrón "asd"

public class Ejemplo01 {
	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd";
		String regex = "asd";
		
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		
		System.out.println("\nCoincidencias: ");
		while(coincidencias.find()) {
			System.out.println("INDICE: " + coincidencias.start() + " " + ("FRAGMENTO: ") + coincidencias.group() + ")");
			
		}
	}

}
