package Ejercicio01;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		
		
		Coordenada[] lista = obtenerCoordenadas();
		
		
		calcularDistancias(lista);
		
		System.out.println("Fin del programa");
		
	}
	public static Coordenada[] obtenerCoordenadas() {
		ArrayList<Coordenada> lista = new ArrayList<Coordenada>();	
		 try {
		      File myObj = new File("./src/Ejercicio01/coordenadas.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] campos = data.split(",");
		        double x = Double.parseDouble(campos[0]);
		        double y = Double.parseDouble(campos[1]);
		        Coordenada array = new Coordenada(x,y);
		        lista.add(array);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 Coordenada[] adios = new Coordenada[lista.size()];
		 
		 for(int i = 0; i < lista.size(); i++) {
			 adios[i] = lista.get(i);
		 }
		 return adios;
		  }
	public static void calcularDistancias(Coordenada[] lista) {
		double distanciaTotal = 0;
		System.out.println("\nDistancia entre puntos\n");
		
		for(int i = 0; i < lista.length - 1; i++) {
			double distancia = lista[i].distancia(lista[i+1]);
			distanciaTotal += distancia;
			System.out.println((i+1) + "º: " + lista[i] + " -- > " + lista[i+1] + " Distancia: " + distancia);
		}
		System.out.println("\nDISTANCIA TOTAL: " + distanciaTotal);
		
	}
	
}