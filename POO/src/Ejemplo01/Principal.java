package Ejemplo01;

public class Principal {
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		
		p1.nombre = "David"; 
		p1.apellidos = "Lerma";
		
		Persona p2 = new Persona();
		
		p2.nombre = "Pepito";
		p2.apellidos = "Grillo";
		
		System.out.println(p1.nombre + " " + p1.apellidos);
		
		System.out.println(p2.nombre + " " + p2.apellidos);
		
		
	}
}