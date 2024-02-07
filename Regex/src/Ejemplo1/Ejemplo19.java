package Ejemplo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo19 {
	public static void main(String[] args) {
		//Comprueba si la cadena contiene al menos un grupo de caracteres numéricos.

		String texto = "01 a2a 223";
		String regex = "\\d+";

		coincidencias(texto, regex);

		boolean resultado = texto.matches(regex);

		System.out.println("Validado? " + resultado);
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
