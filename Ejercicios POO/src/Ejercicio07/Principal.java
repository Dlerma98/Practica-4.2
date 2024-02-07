package Ejercicio07; 
public class Principal {
	public static void main(String[] args) {
	
		Punto coordenada1 = new Punto();
		Punto coordenada2 = new Punto();
		Punto coordenada3 = new Punto();
		Punto coordenada4 = new Punto();
		Punto coordenada5 = new Punto();
		Punto coordenada6 = new Punto();
		Punto coordenada7 = new Punto();
		Punto coordenada8 = new Punto();
		Punto coordenada9 = new Punto();
		Punto cuadrante1 = new Punto();
		Punto distancia1 = new Punto();
		
		coordenada1.x = 0.0;
		coordenada1.y = 0.0;
		
		coordenada2.x = 5.2;
		coordenada2.y = 1.9;
		
		coordenada3.x = -6.7;
		coordenada3.y = -4.2;
		
		coordenada4.x = -20.8;
		coordenada4.y = 17.4;
		
		coordenada5.x = 4.2;
		coordenada5.y = -1.7;
		
		coordenada6.x = 0.0;
		coordenada6.y = 100.2;
		
		coordenada7.x = 100.2;
		coordenada7.y = 0.0;
		
		coordenada8.x = 0.0;
		coordenada8.y = -100.2;
		
		coordenada9.x = -99.2;
		coordenada9.y = 0.0;
		
		
		
		
		System.out.print("X = " + coordenada1.x + " , " + " Y = " + coordenada1.y + " " + cuadrante1.cuadrante(coordenada1.x, coordenada1.y));
		distancia1.distancia(coordenada1.x, coordenada1.y);
		System.out.println();

		
		System.out.print("X = " + coordenada2.x + " , " + " Y = " + coordenada2.y + " " + cuadrante1.cuadrante(coordenada2.x, coordenada2.y));
		distancia1.distancia(coordenada2.x, coordenada2.y);
		System.out.println();

		
		System.out.print("X = " + coordenada3.x + " , " + " Y = " + coordenada3.y + " " + cuadrante1.cuadrante(coordenada3.x, coordenada3.y));
		distancia1.distancia(coordenada3.x, coordenada3.y);
		System.out.println();

		
		System.out.print("X = " + coordenada4.x + " , " + " Y = " + coordenada4.y + " " + cuadrante1.cuadrante(coordenada4.x, coordenada4.y));
		distancia1.distancia(coordenada4.x, coordenada4.y);
		System.out.println();

		
		System.out.print("X = " + coordenada5.x + " , " + " Y = " + coordenada5.y + " " + cuadrante1.cuadrante(coordenada5.x, coordenada5.y));
		distancia1.distancia(coordenada5.x, coordenada5.y);
		System.out.println();


		System.out.print("X = " + coordenada6.x + " , " + " Y = " + coordenada6.y + " " + cuadrante1.cuadrante(coordenada6.x, coordenada6.y));
		distancia1.distancia(coordenada6.x, coordenada6.y);
		System.out.println();

		
		System.out.print("X = " + coordenada7.x + " , " + " Y = " + coordenada7.y + " " + cuadrante1.cuadrante(coordenada7.x, coordenada7.y));
		distancia1.distancia(coordenada7.x, coordenada7.y);
		System.out.println();

		
		System.out.print("X = " + coordenada8.x + " , " + " Y = " + coordenada8.y + " " + cuadrante1.cuadrante(coordenada8.x, coordenada8.y));
		distancia1.distancia(coordenada8.x, coordenada8.y);
		System.out.println();

		
		System.out.print("X = " + coordenada9.x + " , " + " Y = " + coordenada9.y + " " + cuadrante1.cuadrante(coordenada9.x, coordenada9.y));
		distancia1.distancia(coordenada9.x, coordenada9.y);
		System.out.println();

		
		
		
		System.out.println();
		
		
		coordenada7.x = 0.0;
		coordenada7.y = 10.0;
		
		coordenada8.x = 0.0;
		coordenada8.y = 100.2;
		
		coordenada9.x = 99.2;
		coordenada9.y = 0.0;
		
		System.out.print("X = " + coordenada7.x + " , " + " Y = " + coordenada7.y + " " + cuadrante1.cuadrante(coordenada7.x, coordenada7.y));
		distancia1.distancia(coordenada7.x, coordenada7.y);
		System.out.println();
		
		System.out.print("X = " + coordenada8.x + " , " + " Y = " + coordenada8.y + " " + cuadrante1.cuadrante(coordenada8.x, coordenada8.y));
		distancia1.distancia(coordenada8.x, coordenada8.y);
		System.out.println();
		
		System.out.print("X = " + coordenada9.x + " , " + " Y = " + coordenada9.y + " " + cuadrante1.cuadrante(coordenada9.x, coordenada9.y));
		distancia1.distancia(coordenada9.x, coordenada9.y);
		System.out.println();

	}
}