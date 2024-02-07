package Ejemplo3;

public class Persona {
	public String nombre;
	public String apellidos;
	/*
	* Esto son atributos de la clase que representan el ESTADO del objeto
	* que se cree a partir de la clase 
	* */
	
	public Persona() {
		System.out.println("Persona creada!");
		nombre = "Sin nombre";
		apellidos = "Sin apellidos";
	}
	
	public Persona(String name, String surname) {
		System.out.println("Persona creada!");
		nombre = name;
		apellidos = surname;
	}
		
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	public String apellidosNombre() {
		return apellidos + ", " + nombre;
	}
}