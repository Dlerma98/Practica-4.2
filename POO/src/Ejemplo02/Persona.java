package Ejemplo02;

public class Persona {
	public String nombre;
	public String apellidos;
	/*
	* Esto son atributos de la clase que representan el ESTADO del objeto
	* que se cree a partir de la clase 
	* */
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	public String apellidosNombre() {
		return apellidos + ", " + nombre;
	}
}