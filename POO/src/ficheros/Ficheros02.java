package ficheros;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros02 {
	public static final String PATH = "./files/";
	public static final String FILE = "alumnos.txt";
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		
		ArrayList<String> lista = obtenerAlumnos();
		System.out.println("Lista de alumnos\n--------------");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
		System.out.println("Fin del programa");
	}
	
	public static ArrayList<String> obtenerAlumnos() {
		ArrayList<String> lista = new ArrayList<String>();
		    try {
		      File myObj = new File(PATH + FILE);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        //System.out.println(data);
		        lista.add(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    return lista;
		  }
		
}


