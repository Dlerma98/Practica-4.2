package Ejercicio02;
public class Recta {
	private Punto a;
	private Punto b;
	
	public Recta() {
		
	}
	public Punto getA() {
		return a;
	}
	public void setA(Punto a) {
		this.a = a;
	}
	public Punto getB() {
		return b;
	}
	public void setB(Punto b) {
		this.b = b;
	}
	public Recta(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
}