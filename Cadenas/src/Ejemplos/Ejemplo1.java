package Ejemplos;

public class Ejemplo1 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");

		char caracteres[] = { 'M', 'u', 'n', 'd', 'o', ' ', 'J', 'a', 'v', 'a' };

		// en el primer numero
		// Indicamos desde que caracter empieza y la cantidad de elementos que quieres
		// desde ese punto

		String s = new String(caracteres, 6, 4);

		System.out.println(s);

	}
}