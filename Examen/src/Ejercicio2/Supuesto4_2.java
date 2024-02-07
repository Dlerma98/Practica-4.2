package Ejercicio2;

import java.util.Scanner;

public class Supuesto4_2 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		int opcion = 0;

		do {
			System.out.println("MENU\n----------\n");
			System.out.println("1 - Ver contenido del archivo");
			System.out.println("2 - Insertar frase");
			System.out.println("0 - Finalizar programa");
			System.out.println("Selecciona una opcion: ");
			opcion = pedirInt();
			if (opcion == 1) {
				Acceso.leer();
			} else if (opcion == 2) {
				Acceso.insertar();
			}
		} while (opcion != 0);

		System.out.println("Fin del programa");
	}

	public static int pedirInt() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		boolean continuar = false;
		do {
			try {
				opcion = Integer.parseInt(teclado.nextLine().trim());
				continuar = true;
			} catch (Exception e) {
				System.out.print(
						"Parametro introducido no valido UNICAMENTE se puede introducir las opciones \n1 - Ver contenido del archivo \n2 - Insertar frase \n0 - Finalizar programa");
				System.out.println("\n");
			}
		} while (continuar == false);
		return opcion;

	}
}
