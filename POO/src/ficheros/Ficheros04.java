package ficheros;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Ficheros04 {
	public static final String PATH = "./files/";
	public static final String FILE = "juegos.txt";
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		Scanner teclado = new Scanner(System.in);
		

		Juegos game = new Juegos();
		
		System.out.print("Nombre del juego: ");
		game.nombre = teclado.nextLine().trim();
		System.out.print("Precio del juego: ");
		game.precio = teclado.nextLine().trim();
		System.out.print("Descripcion del juego: ");
		game.descripcion = teclado.nextLine().trim();
		
		String nuevaLinea = "" + game.nombre + "$" + game.precio + "$" + game.descripcion; 
		
		boolean resultado = insertar(nuevaLinea);
		
		if(resultado == true) {
			System.out.println("Insertado exitosamente");
		}else if(resultado == false) {
			System.out.println("Error al insertar");
		}
		
		System.out.println("Fin del programa");
	}
	public static boolean insertar(String linea) {
		try {
		      FileWriter myWriter = new FileWriter(PATH + FILE, true);
		      myWriter.write("\n" + linea);
		      myWriter.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		      return false;
		    }
		return true;
		  }
		
	}
	class Juegos {
		public String nombre;
		public String precio;
		public String descripcion;
		
	}

