package Ejercicio1;

import java.util.Scanner;

//Como me ha dado tiempo he aplicado un bucle para introducir los numeros correspondientes a los indices  de los usuarios que muestra el menu y solo finalizar al pulsar 0
public class Supuesto4_1 {
	public static final int CANTIDAD = 3;

	public static void main(String[] args) {
		int opcion = 0;
		System.out.println("Inicio del programa");
		Usuario[] array = pedirUsuarios(CANTIDAD);
		listadoUsuarios(array);
		do {
			mostrarUsuarios(array);
			opcion = pedirInt();
			mostrarUsuario(array, opcion);
		} while (opcion != 0);

		System.out.println("Fin del programa");

	}

	public static Usuario[] pedirUsuarios(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Usuario[] array = new Usuario[cantidad];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "º Usuario\n----------------------\n" + "Introduce nombre: ");
			String nombre = teclado.nextLine();

			System.out.print("Introduce apellidos: ");
			String apellidos = teclado.nextLine();

			System.out.print("Introduce Email: ");
			String email = teclado.nextLine();

			array[i] = new Usuario(nombre, apellidos, email);
		}

		Usuario[] array2 = ordenarUsuarios(array);
		return array2;

	}

	public static Usuario[] ordenarUsuarios(Usuario[] array) {
		Usuario aux = new Usuario("", "", "");
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j].getApellidos().compareTo(array[j + 1].getApellidos()) > 0) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}

		}
		return array;
	}

	public static void mostrarUsuarios(Usuario[] array2) {
		for (int i = 0; i < array2.length; i++) {
			System.out.println((1 + i) + " - " + array2[i].getApellidos() + ", " + array2[i].getNombre());

		}
		System.out.println("0 - para finalizar");
		System.out.println("Selecciona una opcion: ");

	}

	public static void listadoUsuarios(Usuario[] array2) {
		System.out.println("Usuarios\n-----------------\n");
		for (int i = 0; i < array2.length; i++) {
			System.out.println((i + 1) + "º Usuario\n----------------------\n" + "Nombre: " + array2[i].getNombre());
			System.out.println("Apellidos: " + array2[i].getApellidos());
			System.out.println("Email: " + array2[i].getEmail());
			System.out.println();
		}
	}

	public static int pedirInt() {
		Scanner teclado = new Scanner(System.in);
		boolean continuar = false;
		int opcion = 0;
		do {
			try {
				opcion = Integer.parseInt(teclado.nextLine().trim());
				continuar = true;
			} catch (Exception e) {
				System.out.println("Parametro introducido no valido");
			}
		} while (continuar == false);

		return opcion;
	}

	public static void mostrarUsuario(Usuario[] array, int opcion) {
		if (opcion - 1 < 0 || opcion - 1 >= array.length) {
			return;
		}
		System.out.println("USUARIO\n----------\n" + "Nombre: " + array[opcion - 1].getNombre() + "\nApellidos: "
				+ array[opcion - 1].getApellidos() + "\nEmail: " + array[opcion - 1].getEmail());
		System.out.println("\n");
	}
}
