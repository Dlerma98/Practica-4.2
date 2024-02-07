package Ejercicio09;
public class Principal {
	public static void main(String[] args) {
		
	
		String[] resultado = Fichero.mostrarLineas();
	
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(i+1 + "º Linea: " + resultado[i]);
		}
	}
}