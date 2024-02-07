package Ejemplos;
public class Coordenada {
	private double x = 0;
	private double y = 0;
	
	public Coordenada(double x, double y) {
		//Llamar a los setters
		this.setX(x);
		this.setY(y);
	}
	
	//GETTERS
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	//SETTERS
	public void setX(double x) {
		if(x >= -10 && x <= 10) {
		this.x = x;
		}
	}
	
	public void setY(double y) {
		if(y >= -10 && y <= 10) {
		this.y = y;
		}
	}
	public double distanciaAlCentro() {
		return Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2));
			
	}
	public double distancia(Coordenada b) {
		return Math.sqrt(Math.pow(b.getX() - this.x, 2) + Math.pow(b.getY() - this.y, 2));
	}
}
