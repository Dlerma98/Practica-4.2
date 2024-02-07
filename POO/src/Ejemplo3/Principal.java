package Ejemplo3;

public class Principal {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("David", "Lerma");
		
		
		
		
		Persona p2 = new Persona();
		

		System.out.println(p1.nombreCompleto());
		
		System.out.println(p2.apellidosNombre());
		
		
	}
}