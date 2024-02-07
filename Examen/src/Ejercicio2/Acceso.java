package Ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Ejercicio1.Usuario;

public class Acceso {
	public static final String PATH_FILE = "./archivos";
	public static final String FILE = "/textos.txt";

	public static void leer() {
		try {
			File myObj = new File(PATH_FILE + FILE);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				System.out.println(data);

			}

			myReader.close();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}

	}

	public static void insertar() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		try {
			FileWriter myWriter = new FileWriter(PATH_FILE + FILE, true);
			myWriter.write("\n" + texto);
			myWriter.close();
			System.out.println("Insertado correctamente!!");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
	}
}
