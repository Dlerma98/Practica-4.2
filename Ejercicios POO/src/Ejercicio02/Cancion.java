package Ejercicio02;
public class Cancion {
	private String genero;
	private double duracion;
	private String nombre_artista;
	private String nombre_cancion;
	private int reproducciones;
	
	public Cancion() {
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
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

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	public Cancion(String genero, double duracion, String nombre_artista, String nombre_cancion, int reproducciones) {
		this.genero = genero;
		this.duracion = duracion;
		this.nombre_artista = nombre_artista;
		this.nombre_cancion = nombre_cancion;
		this.reproducciones = reproducciones;
	}
	
	
}