package Ejercicio10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	
	public static String[] mostrarLineas() {
	
		ArrayList<String> prueba = new ArrayList<String>();
	try {
	      File myObj = new File("./src/Ejercicio10/Ejemplo.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	       prueba.add(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		String [] fin = new String [prueba.size()];
		fin = prueba.toArray(fin);
		return fin;
	  }
	
	public static boolean escribirLinea(String texto) {
		boolean continuar = false;
		try {
		      FileWriter myWriter = new FileWriter("./src/Ejercicio10/Ejemplo.txt", true);
		      myWriter.write("\n"+texto);
		      myWriter.close();
		      continuar = true;
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		return continuar;
	}
}