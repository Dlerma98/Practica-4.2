package Ejemplo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo30 {

	public static void main(String[] args) {
		// Comprueba si una contraseña tiene una longitud mínima de 5 caracteres
		// alfanuméricos, incluida la ñ, y los caracteres especiales: $*-+&!?

		String texto = "Prueba9x$";
		String regex = "([\\wñÑ$*-+&!?]){5,}";

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
