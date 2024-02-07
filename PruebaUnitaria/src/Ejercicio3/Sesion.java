package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sesion {

	
	//En este metodo recibimos tanto el usuario y contraseña
	//y comprobaremos en el fichero tanto el usuario ignorando mayusculas y la contraseña
	// en caso de que coincidan ambos el booleano cambiara a true y nos indicara un mensaje de exito
	public static boolean login(String usuario, String contraseña) {
		boolean resultado = false;
		try {
			File myObj = new File("./assets/files/usuarios.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] space = data.split("#");
				if (usuario.equalsIgnoreCase(space[0]) == true && contraseña.equals(space[1]) == true) {
					resultado = true;

				}
			}
			if (resultado == true) {
				System.out.println("Inicio de sesion correcto");
			} else if (resultado == false) {
				System.out.println("Nombre de usuario y/os contraseña erroneo");
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}
		return resultado;

	}
}