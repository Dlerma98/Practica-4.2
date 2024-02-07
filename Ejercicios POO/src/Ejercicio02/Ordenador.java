package Ejercicio02;
public class Ordenador {
	
	private String marca;
	private String modelo;
	private String sistema_operativo;
	private String estado;
	
	
	
	public Ordenador() {
		
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



	public String getSistema_operativo() {
		return sistema_operativo;
	}



	public void setSistema_operativo(String sistema_operativo) {
		this.sistema_operativo = sistema_operativo;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Ordenador(String marca, String modelo, String sistema_operativo, String estado) {
		this.marca = marca;
		this.modelo = modelo;
		this.sistema_operativo = sistema_operativo;
		this.estado = estado;
	}
	
}