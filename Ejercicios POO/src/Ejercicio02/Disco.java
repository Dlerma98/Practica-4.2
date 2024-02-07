package Ejercicio02;
public class Disco {
	private double precio;
	private String tipo_disco;
	private int stock;
	private String genero;
	private String nombre_artista;
	private String nombre_cancion;
	
	public Disco() {
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo_disco() {
		return tipo_disco;
	}

	public void setTipo_disco(String tipo_disco) {
		this.tipo_disco = tipo_disco;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre_artista() {
		return nombre_artista;
	}

	public void setNombre_artista(String nombre_artista) {
		this.nombre_artista = nombre_artista;
	}

	public String getNombre_cancion() {
		return nombre_cancion;
	}

	public void setNombre_cancion(String nombre_cancion) {
		this.nombre_cancion = nombre_cancion;
	}

	public Disco(double precio, String tipo_disco, int stock, String genero, String nombre_artista,
			String nombre_cancion) {
		this.precio = precio;
		this.tipo_disco = tipo_disco;
		this.stock = stock;
		this.genero = genero;
		this.nombre_artista = nombre_artista;
		this.nombre_cancion = nombre_cancion;
	}
	
}