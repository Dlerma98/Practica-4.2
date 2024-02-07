package Ejemplo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo24 {
	public static void main(String[] args) {
		// Comprueba si en la cadena hay patrones formados por un mínimo de 5 letras
		// mayúsculas o minúsculas y un máximo de 10

		String texto = "abc dfdgfdg asdrabcty";
		String regex = "[a-zA-Z]{5,10}";

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
