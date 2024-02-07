package Ejemplos;

public class Ejemplo2 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");

		char caracteres[] = { 'M', 'u', 'n', 'd', 'o', ' ', 'J', 'a', 'v', 'a' };

		int inicio = 6;
		int cantidad = caracteres.length - inicio;
		// De esta forma se imprimira desde la posicion 6 todo el contenido que tenga
		// ese array
		String s = new String(caracteres, inicio, cantidad);

		System.out.println(s);

	}
}