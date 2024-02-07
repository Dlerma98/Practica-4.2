package Static;

import java.util.Scanner;

public class Entrada {
	private static Scanner teclado = new Scanner(System.in);


	public static int pedirInt() {
		int num = 0;
		System.out.print("Introduce un numero");
		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Debes introducir un numero entero");
		}

		return num;
	}
	public static int pedirInt(String enunciado) {
		int num = 0;
		System.out.print(enunciado);
		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Debes introducir un numero entero");
		}
		return num;
	}

	public static int pedirInt(String enunciado, boolean repetir) {
		boolean continuar = false;
		int num = 0;
		do {
			System.out.print(enunciado);
			try {
				num = Integer.parseInt(teclado.nextLine().trim());
				continuar = true;
			}catch(Exception e) {
				System.out.println("Debes introducir un numero entero");
				if(!repetir) {
					return num;
				}
			}
		}while(continuar == false);
		return num;
	}
	public static String pedirString() {
		return teclado.nextLine().trim();
	}
	
	public static String pedirString(String enunciado) {
		System.out.print(enunciado);
		return teclado.nextLine().trim();
	}
}
