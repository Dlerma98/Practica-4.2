package Ejemplos4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Inicio del programa");
		
		String texto = leerFichero();
		
		System.out.println(texto);
		
		String resultado = pedirCensura(texto);
		
		escribirFichero(resultado);

		//llamar a un metodo que abra el fichero y devuelva todo su contenido y recogerlo en un String
		
		//Pedir en bucle al usuario que indique que palabras queremos "censurar" hasta que escribamos "terminar"
		
		//Despues mandamos el texto a un metodo que lo inserte en un fichero que se genere con un nombre compuesto por la fecha y hora actual o los milisegundos de la fecha 
		
		
		System.out.println("Fin del programa");
	}
	public static String leerFichero() {
		 String partes = " ";
		try {
		      File myObj = new File("./input/texto.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		     
		      partes += data + "\n";
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Ha ocurrido un error");
		      e.printStackTrace();
		    }
		
		return partes;
		
	}
	public static String pedirCensura(String texto) {
		Scanner teclado = new Scanner(System.in);
		String palabra = "";
		String texto2 = "";
		
		do {
			System.out.println("Introduce palabra a censurar: ");
			 texto2 = teclado.nextLine();
			palabra = palabra + texto2 + "&";
			
		}while(!texto2.equalsIgnoreCase("terminar"));
		
		String[] partes = palabra.split("&");
		
		for(int i = 0; i < partes.length; i++) {
			texto = texto.replaceAll(partes[i], "***");
		}
		
		return texto;
	}
	public static void escribirFichero(String resultado) {
		String fechahora = new SimpleDateFormat("yyyyMMdd HHmmss").format(Calendar.getInstance().getTime()) + ".txt";
		try {
		      FileWriter myWriter = new FileWriter("./output/"+fechahora,true);
		      myWriter.write(resultado);
		      myWriter.close();
		      System.out.println("Realizado con exito!!!");
		    } catch (IOException e) {
		      System.out.println("Ha ocurrido un error");
		      e.printStackTrace();
		    }
		
	}


}