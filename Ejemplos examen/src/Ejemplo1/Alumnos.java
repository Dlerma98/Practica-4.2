package Ejemplo1;

public class Alumnos {

	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;
	
	public Alumnos() {
		
	}
	
	public Alumnos(String nombre, String apellidos, String nre, String email, String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setNre(nre);
		this.setEmail(email);
		this.setDireccion(direccion);
	}
	
	public String info() {
		return "Nombre completo de Alumno: " + this.nombre + " " + this.apellidos + "\nNRE: " + this.nre + "\nEmail: " + this.email + "\nDireccion: " + this.direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getNre() {
		return nre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setNre(String nre) {
		this.nre = nre;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
