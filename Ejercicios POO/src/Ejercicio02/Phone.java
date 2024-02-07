package Ejercicio02;
public class Phone {

	private double precio;
	private String marca;
	private String fabricante;
	private String modelo;
	private int stock;
	private double peso;
	private double dimensiones;
	private int ram;
	private int memoria;
	
	
	
	
	public Phone() {
		
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getFabricante() {
		return fabricante;
	}




	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getStock() {
		return stock;
	}




	public void setStock(int stock) {
		this.stock = stock;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public double getDimensiones() {
		return dimensiones;
	}




	public void setDimensiones(double dimensiones) {
		this.dimensiones = dimensiones;
	}




	public int getRam() {
		return ram;
	}




	public void setRam(int ram) {
		this.ram = ram;
	}




	public int getMemoria() {
		return memoria;
	}




	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}




	public Phone(double precio, String marca, String fabricante, String modelo, int stock, double peso,
			double dimensiones, int ram, int memoria) {
		this.precio = precio;
		this.marca = marca;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.stock = stock;
		this.peso = peso;
		this.dimensiones = dimensiones;
		this.ram = ram;
		this.memoria = memoria;
	}
	
	
}