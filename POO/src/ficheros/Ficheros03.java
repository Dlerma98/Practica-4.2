package ficheros;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros03 {
	public static final String PATH = "./files/";
	public static final String FILE = "articulos.txt";
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		
		ArrayList<Articulo> lista = obtenerArticulos();
		System.out.println("Lista de articulos\n--------------");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nombre: " + lista.get(i).getNombre());
			System.out.println("Precio: " + lista.get(i).getPrecio());
			System.out.println("Descripcion: " + lista.get(i).getDescripcion());
		}
		
		
		
		System.out.println("Fin del programa");
	}
	
	public static ArrayList<Articulo> obtenerArticulos() {
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		    try {
		      File myObj = new File(PATH + FILE);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] campos = data.split("@");
		        Articulo actual = new Articulo();
		        actual.setNombre(campos[0]);
		        actual.setPrecio(campos[1]);
		        actual.setDescripcion(campos[2]);
		        lista.add(actual);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    return lista;
		  }
		
}

class Articulo {
	public String nombre;
	public String precio;
	public String descripcion;
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return this.precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
