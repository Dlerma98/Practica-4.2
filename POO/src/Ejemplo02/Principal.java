package Ejemplo02;

public class Principal {
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		
		p1.nombre = "David"; 
		p1.apellidos = "Lerma";
		
		Persona p2 = new Persona();
		
		p2.nombre = "Pepito";
		p2.apellidos = "Grillo";
		
		System.out.println(p1.apellidosNombre());
		
		System.out.println(p2.apellidosNombre());
		
		
	}
}