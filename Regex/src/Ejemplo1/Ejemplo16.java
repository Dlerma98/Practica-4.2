package Ejemplo1;

import java.util.regex.*;

//Comprueba si la cadena contiene uno o varios grupos formados por caracteres que no sean @

public class Ejemplo16 {
	public static void main(String[] args) {
		String texto = "pepe@gmail.com";
		String regex = "([^@])+";

		coincidencias(texto, regex);

		boolean resultado = texto.matches(regex);

		System.out.println("Valiudado? " + resultado);
		// Devuelve false, porque esta expresion regular solo valida un texto formado
		// por un solo caracter

	}

	public static void coincidencias(String texto, String regex) {
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);

		System.out.println("\nCoincidencias: ");
		while (coincidencias.find()) {
			System.out
					.println("INDICE: " + coincidencias.start() + " " + ("FRAGMENTO: ") + coincidencias.group() + ")");

		}

	}
}
