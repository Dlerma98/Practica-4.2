package Ejercicio01;
public class Coordenada {
	private double x;
	private double y;
	
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distancia(Coordenada b) {
		return Math.sqrt(Math.pow(b.getX()-this.x, 2) + Math.pow(b.getY()-this.y, 2) );
	}
	
	public String toString() {
		return "(" + this.x + " , " + this.y + ")";
	}
}