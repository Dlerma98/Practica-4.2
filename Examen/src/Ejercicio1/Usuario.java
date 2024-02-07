package Ejercicio1;

public class Usuario {
	private String nombre = "";
	private String apellidos = "";
	private String email = "";

	public Usuario(String nombre, String apellidos, String email) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEmail(email);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		if (nombre.length() >= 4) {
			this.nombre = nombre;
		}
	}

	public void setApellidos(String apellidos) {
		if (apellidos.length() >= 4) {
			this.apellidos = apellidos;
		}
	}

	public void setEmail(String email) {
		if (email.length() >= 6) {
			this.email = email;
		}
	}

}
