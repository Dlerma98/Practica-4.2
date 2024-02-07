package Classes;

public class Session {
	private User currentUser;
	private boolean logged; 
	private final String FILE_PATH = "./assets/files/"; // En Windows ponemos \\
	private final String USERS_FILE = "users.txt";
	
	
	public Session() {
		this.logged = false;
		this.currentUser = new User();
	}
	
	public void login() {
		
		
	}
	
	public void signup() {
		
	}
	
	public boolean isLogged() {
		
		return this.logged;
	}
	
	public void showUser() {
		System.out.println("Mostrando datos de usuario actual");
		System.out.println("Nombre de usuario " + currentUser.username);
		System.out.println("Nombre " + currentUser.name);
		System.out.println("NIF " + currentUser.nif);
		System.out.println("Email " + currentUser.mail);
		System.out.println("Direccion " + currentUser.address);
		System.out.println("Cumpleaños " + currentUser.birthdate);
		
		
	}
	public void logout() {
		System.out.println("\nSESION CERRADA");
		logged = false;
		this.currentUser = null;
	}
 }