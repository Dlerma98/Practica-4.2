package Ejercicio02;
public class Libro {
	private double precio;
	private String isbn;
	private String autor;
	private String edicion;
	private String genero;
	private String editorial;
	private String tapa;
	private String titulo;
	private int stock;
	
	public Libro() {
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
	}

	public Libro(double precio, String isbn, String autor, String edicion, String genero, String editorial, String tapa,
			String titulo, int stock) {
		this.precio = precio;
		this.isbn = isbn;
		this.autor = autor;
		this.edicion = edicion;
		this.genero = genero;
		this.editorial = editorial;
		this.tapa = tapa;
		this.titulo = titulo;
		this.stock = stock;
	}
	
}