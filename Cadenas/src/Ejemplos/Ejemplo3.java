package Ejemplos;

public class Ejemplo3 {
	public static void main(String[] args) {

		Punto p1 = new Punto(3, 8);

		System.out.println("Punto actual");
		System.out.println(p1);

	}
}

class Punto {
	public int x, y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Punto[" + x + "," + y + "]";
	}
}
