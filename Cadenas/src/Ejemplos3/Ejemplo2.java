package Ejemplos3;

import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Inicio del programa");

		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine().trim();


		String resultado = reemplazarTexto(texto);

		System.out.println("El nuevo texto procesado es:\n" + resultado);

		System.out.println("Fin del programa");
	}

	public static String reemplazarTexto(String texto) {
//Reemplazar cada uno de los terminos dentro de "texto" por tres asteriscos "***"
		
		String terminos = "pirata@marketing@amnistía";
		String[] partes = terminos.split("@");
		String reemplazar = "***";
		for(int i = 0; i < partes.length; i++) {
		texto = texto.replaceAll(partes[i], reemplazar);
		}
		return texto;

	}
}