package Ejercicio10;
public class Principal {
	public static void main(String[] args) {
		
	
		String[] resultado = Fichero.mostrarLineas();
	
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(i+1 + "º Linea: " + resultado[i]);
		}
		
		boolean texto = Fichero.escribirLinea("Me encanta el ambiente del Invierno");
		if(texto == true) {
			System.out.println("La linea indicada se ha introducido correctamente");
		}else {
			System.out.println("Ha ocurrido un error al intentar introducir la linea");
		}
		
	}
}