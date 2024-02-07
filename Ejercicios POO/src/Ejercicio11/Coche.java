package Ejercicio11;
public class Coche {
	 String marca;
	 String modelo;
	 String color;
	 String combustible;
	 String kilometraje;
	 
	 
	 
	public Coche(String marca, String modelo, String color, String combustible, String kilometraje) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.combustible = combustible;
		this.kilometraje = kilometraje;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}
	 
}