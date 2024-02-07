package Ejercicio12;

public class Principal {
	public static void main(String[] args) {
	Coche[] car = Archivo.lista();
	
	for(int i = 0; i < car.length; i++) {
		System.out.println(i+1 + "º Linea: " + car[i].getMarca() + " " + car[i].getModelo() + " " + car[i].getColor()+ " " + car[i].getCombustible() + " " + car[i].getKilometraje());
	}
	
	Coche car2 = new Coche("Ferrari", "F40", "Rojo", "Gasolina", "0");
	boolean continuar = Archivo.escribirLinea(car2);
	if(continuar == true) {
		System.out.println("La linea indicada se ha introducido correctamente");
	}else {
		System.out.println("Ha ocurrido un error al intentar introducir la linea");
	}
	}
}