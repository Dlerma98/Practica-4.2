package ficheros;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class Ficheros01 {
	public static final String PATH = "./files/";
	public static final String FILE = "alumnos.txt";
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		
		leerFichero();
		
		
		
		
		System.out.println("Fin del programa");
	}
	
	public static void leerFichero() {
		    try {
		      File myObj = new File(PATH + FILE);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		
}


