package Ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	
	public static String[] mostrarLineas() {
	
		ArrayList<String> prueba = new ArrayList<String>();
	try {
	      File myObj = new File("./src/Ejercicio09/Ejemplo.txt");
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
}