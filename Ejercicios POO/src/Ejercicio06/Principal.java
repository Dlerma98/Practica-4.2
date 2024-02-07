package Ejercicio06;
public class Principal {
	public static void main(String[] args) {
		
	String encriptado = Utilidades.encripta("Hola mundo");
		System.out.println(encriptado);
		
	String desencriptado = Utilidades.desencripta("Krod#pxqgr");
		System.out.println(desencriptado);
	}
}