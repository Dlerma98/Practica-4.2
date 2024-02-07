package ParteA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {

	private String id;
	private String nombre;
	private String curso;
	private String horas;
	private String profesor;
	
	Alumno[] alumnos = obtenerAlumnos();
	
	
	public Modulo(String id, String nombre, String curso, String horas, String profesor) {
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
	}
	
	public static Alumno[] obtenerAlumnos() {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		 try {
		      File myObj = new File("./Files/alumnos.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	 
		        String data = myReader.nextLine();
		        String[] dividir = data.split("&");
		        String id = dividir[0];
		        String nombre = dividir[1];
		        String apellidos = dividir[2];
		        String dni = dividir[3];
		        String email = dividir[4];
		        String direccion = dividir[5];
		        String telefono = dividir[6];
		        Alumno alumnos = new Alumno(id, nombre, apellidos, dni, email, direccion, telefono);
			       
			       lista.add(alumnos);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 Alumno[] mod = new Alumno[lista.size()];
		 for(int i = 0; i < lista.size(); i++) {
			 mod[i] = lista.get(i);
		 }
		 return mod;
	}


	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getCurso() {
		return curso;
	}




	public void setCurso(String curso) {
		this.curso = curso;
	}




	public String getHoras() {
		return horas;
	}




	public void setHoras(String horas) {
		this.horas = horas;
	}




	public String getProfesor() {
		return profesor;
	}




	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	//public String toString() {
		//  this.nombre  + this.curso  + this.horas + this.profesor;
	//}

	
}