package Ejemplos2;

import java.util.Scanner;

public class Ejemplo01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Inicio del programa");

		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		
		System.out.println("Texto a buscar:  ");
		String buscar = teclado.nextLine().trim();
		
		System.out.println("Texto a reemplazar ");
		String reemplazar = teclado.nextLine().trim();



		String resultado1 = reemplazarTextoV1(texto);

		System.out.println("El nuevo texto procesado es:\n" + resultado1);
		
		
		String resultado2 = reemplazarTextoV2( texto,  buscar,  reemplazar);
		
		System.out.println("El nuevo texto procesado es:\n" + resultado2);

		System.out.println("Fin del programa");
	}

	public static String reemplazarTextoV1(String texto) {

		String buscar = "David";
		String reemplazar = "Pepe";
		texto = texto.replaceAll(buscar, reemplazar);

		return texto;

	}

	public static String reemplazarTextoV2(String texto, String buscar, String reemplazar) {

		
		
		texto = texto.replaceAll(buscar, reemplazar);

		return texto;
	}
}