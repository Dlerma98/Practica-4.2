package Ejercicio03; 
public class Principal {
	public static void main(String[] args) {
	
		Punto coordenada1 = new Punto();
		Punto coordenada2 = new Punto();
		Punto coordenada3 = new Punto();
		
		coordenada1.x = 11.2;
		coordenada1.y = 25.2;
		
		coordenada2.x = 5.2;
		coordenada2.y = 1.9;
		
		coordenada3.x = 6.7;
		coordenada3.y = 4.2;
		
		
		System.out.println("X = " + coordenada1.x + " , " + " Y = " + coordenada1.y);
		
		
		System.out.println("X = " + coordenada2.x + " , " + " Y = " + coordenada2.y);
		
		
		System.out.println("X = " + coordenada3.x + " , " + " Y = " + coordenada3.y);
		
		
		coordenada1.x = 20.8;
		coordenada1.y = 17.4;
		
		coordenada2.x = 4.2;
		coordenada2.y = 1.7;
		
		coordenada3.x = 100.2;
		coordenada3.y = 100.2;
		
		
		
		
		System.out.println("X = " + coordenada1.x + " , " + " Y = " + coordenada1.y);
		
		System.out.println("X = " + coordenada2.x + " , " + " Y = " + coordenada2.y);
		
		System.out.println("X = " + coordenada3.x + " , " + " Y = " + coordenada3.y);

	}
}