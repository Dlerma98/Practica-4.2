package Ejemplo1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int opcion = 0;

		Alumnos[] alumnos1 = pedirInt("Introduce una cantidad de alumnos: ");

		Alumnos[] alumnos2 = completarAlumnos(alumnos1);

		mostrarAlumnos(alumnos2);
		
		do {
		menuAlumnos(alumnos2);

		 opcion = pedirInt();
		
		mostrarAlumno(alumnos2, opcion);
		
		}while(opcion != 0);
		
		System.out.println("Fin del programa");

	}

	public static Alumnos[] pedirInt(String enunciado) {
		boolean continuar = false;
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				System.out.println(enunciado);
				num = Integer.parseInt(teclado.nextLine().trim());
				continuar = true;
			} catch (Exception e) {
				System.out.println("Parametro introducido no valido");
			}
		} while (continuar == false);

		Alumnos[] array = new Alumnos[num];

		return array;
	}

	public static Alumnos[] completarAlumnos(Alumnos[] array) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "º Alumno " + "Introduce nombre: ");
			String nombre = teclado.nextLine();

			System.out.println((i + 1) + "º Alumno " + "Introduce apellidos: ");
			String apellidos = teclado.nextLine();

			System.out.println((i + 1) + "º Alumno " + "Introduce NRE: ");
			String nre = teclado.nextLine();

			System.out.println((i + 1) + "º Alumno " + "Introduce Email: ");
			String email = teclado.nextLine();

			System.out.println((i + 1) + "º Alumno " + "Introduce Direccion: ");
			String direccion = teclado.nextLine();

			array[i] = new Alumnos(nombre, apellidos, nre, email, direccion);
		}
		return array;
	}

	public static void mostrarAlumnos(Alumnos[] alumnos2) {

		for (int i = 0; i < alumnos2.length; i++) {
			System.out.println((i + 1) + "º Alumno\n---------------\n");
			System.out.println(alumnos2[i].info());
		}
		System.out.println("\n");
	}

	public static void menuAlumnos(Alumnos[] alumnos2) {
		for (int i = 0; i < alumnos2.length; i++) {
			System.out.println((i + 1) + " - " + alumnos2[i].getNombre() + " " + alumnos2[i].getApellidos());
		}
		System.out.println("0 - Para finalizar");
		System.out.print("Seleccione una opcion: ");
	}
	public static int pedirInt() {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		return opcion;
	}
	public static void mostrarAlumno(Alumnos[] alumnos2, int opcion) {
		if(opcion == 0) {
			return;
		}
		if(opcion-1 < 0 || opcion-1 >= alumnos2.length) {
			return;
		}
		for(int i = 0; i < alumnos2.length; i++) {
			System.out.println(alumnos2[opcion-1].info());
		}
	}
}
