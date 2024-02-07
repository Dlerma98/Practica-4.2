package Ejercicio01; 
public class Principal {
	public static void main(String[] args) {
	
		Punto coordenada = new Punto();
		coordenada.x = 11.2;
		coordenada.y = 25.2;
		
		System.out.println("X = " + coordenada.x + " , " + " Y = " + coordenada.y);
		
		coordenada.x = 2.6;
		coordenada.y = 1.2;
		
		System.out.println("X = " + coordenada.x + " , " + " Y = " + coordenada.y);

	}
}