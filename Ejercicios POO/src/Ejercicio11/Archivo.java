package Ejercicio11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	
	
	public static Coche[] lista() {
		ArrayList<Coche> lista = new ArrayList<Coche>();
		try {
		      File myObj = new File("./src/Ejercicio11/archivo.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String [] lista2 = data.split(",,");
		        String marca = lista2[0];
		        String modelo = lista2[1];
		        String color = lista2[2];
		        String combustible = lista2[3];
		        String kilometraje = lista2[4];
		       Coche coche1 = new Coche(marca, modelo, color, combustible, kilometraje);
		       
		       lista.add(coche1);
		      
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Coche[] car = new Coche[lista.size()];
		car = lista.toArray(car);

		return car;
	}
}