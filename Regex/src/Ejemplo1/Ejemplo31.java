package Ejemplo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo31 {
	public static void main(String[] args) {
		// Comprueba si una contraseña es robusta asegurando una longitud mínima de 8
		// caracteres entre los cuales se encuentran al menos Una letra mayúscula. Una
		// letra minúscula. Un dígito numérico. Un carácter especial de los
		// especificados: $*-+&!?%

		String texto = "PrueBa89x$";
		String regex = "?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!?%]).{8,16}";

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
