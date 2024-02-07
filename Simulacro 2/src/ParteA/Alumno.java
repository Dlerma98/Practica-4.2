package ParteA;

public class Alumno {
	String id;
	String nombre;
	String apellidos;
	String dni;
	String email;
	String dirreccion;
	String telefono;
	
	

	
	public Alumno(String id, String nombre, String apellidos, String dni, String email, String dirreccion,
			String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.dirreccion = dirreccion;
		this.telefono = telefono;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirreccion() {
		return dirreccion;
	}
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}