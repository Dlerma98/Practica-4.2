package Ejemplo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo27 {

	public static void main(String[] args) {
		// Comprueba si la cadena contienen los caracteres a ó b..

		String texto = "abc dfdgfdg asdrabcty";
		String regex = "(a|b)+";

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
