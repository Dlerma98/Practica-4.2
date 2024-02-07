package Ejercicio11;
public class Principal {
	public static void main(String[] args) {
	Coche[] car = Archivo.lista();
	
	for(int i = 0; i < car.length; i++) {
		System.out.println(i+1 + "º Linea: " + car[i].getMarca() + " " + car[i].getModelo() + " " + car[i].getColor()+ " " + car[i].getCombustible() + " " + car[i].getKilometraje());
	}
	}
}