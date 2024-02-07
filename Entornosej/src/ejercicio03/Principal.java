package ejercicio03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int numero = 3;
		ejercicio5[] resultado = generarAlumnos(numero);
		System.out.println("Lista de usuarios\n-----------------\n");
		for (int i = 0; i < resultado.length; i++) {

			System.out.println((i + 1) + " Usuario" + " Nombre completo:" + resultado[i].nombre + " "
					+ resultado[i].apellidos + " Email " + resultado[i].email);
		}

	}

	public static ejercicio5[] generarAlumnos(int num) {
		ejercicio5[] usuarios = new ejercicio5[num];
	
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < usuarios.length; i++) {
			
			ejercicio5 usuario = new ejercicio5();
			System.out.println((i + 1) + " Usuario " + "Introduce nombre: ");
			usuario.nombre = teclado.nextLine().trim();

			System.out.println((i + 1) + " Usuario " + "Introduce apellidos: ");
			usuario.apellidos = teclado.nextLine().trim();

			System.out.println((i + 1) + " Usuario " + "Introduce email: ");
			usuario.email = teclado.nextLine().trim();

			usuarios[i] = usuario;
		}
		return usuarios;
	}
}
