package Ejemplo1;

import java.util.regex.*;

//Comprueba si la cadena tiene espacios en blanco, saltos y tabuladores con el patrón "\s"

public class Ejemplo08 {
	public static void main(String[] args) {
		String texto = "0123 aadd_   d1?f";
		String regex = "\\s";

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
