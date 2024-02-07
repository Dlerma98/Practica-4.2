package Ejercicio02;
public class Poligono {
	private int lados;
	private int vertices;
	private int diagonales;
	private double angulo_interior;
	private double angulo_exterior;
	
	public Poligono () {
		
	}
	
	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public int getDiagonales() {
		return diagonales;
	}

	public void setDiagonales(int diagonales) {
		this.diagonales = diagonales;
	}

	public double getAngulo_interior() {
		return angulo_interior;
	}

	public void setAngulo_interior(double angulo_interior) {
		this.angulo_interior = angulo_interior;
	}

	public double getAngulo_exterior() {
		return angulo_exterior;
	}

	public void setAngulo_exterior(double angulo_exterior) {
		this.angulo_exterior = angulo_exterior;
	}

	public Poligono(int lados, int vertices, int diagonales, double angulo_interior, double angulo_exterior) {
		this.lados = lados;
		this.vertices = vertices;
		this.diagonales = diagonales;
		this.angulo_interior = angulo_interior;
		this.angulo_exterior = angulo_exterior;
	}

	
}