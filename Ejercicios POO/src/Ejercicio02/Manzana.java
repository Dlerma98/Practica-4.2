package Ejercicio02;
public class Manzana {
	private String tipo;
	private double precio;
	private double peso;
	private String fecha_recoleccion;
	private String color;
	
	public Manzana() {
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getFecha_recoleccion() {
		return fecha_recoleccion;
	}
	public void setFecha_recoleccion(String fecha_recoleccion) {
		this.fecha_recoleccion = fecha_recoleccion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Manzana(String tipo, double precio, double peso, String fecha_recoleccion, String color) {
		this.tipo = tipo;
		this.precio = precio;
		this.peso = peso;
		this.fecha_recoleccion = fecha_recoleccion;
		this.color = color;
	}
	
}