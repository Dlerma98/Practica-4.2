package Ejercicio04;
public class Punto {
	 Double x;
	 Double y;
	
	public Punto() {
		
	}
	
	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public String cuadrante(double x, double y) {
		
		String posicion = "";
		
		if(x > 0 && y > 0) {
			posicion = "El punto se encuentra  en el 1º Cuadrante";
		}else if (x < 0 && y > 0) {
			posicion = "El punto se encuentra  en el 2º Cuadrante";
		}else if (x < 0 && y < 0) {
			posicion = "El punto se encuentra  en el 3º Cuadrante";
		}else if (x > 0 && y < 0) {
			posicion = "El punto se encuentra  en el 4º Cuadrante";
		}else if (x == 0 && y == 0) {
			posicion = "El punto se encuentra  en el centro del eje";
		}else if (x > 0 && y == 0) {
			posicion = "El punto se encuentra entre el 1º y el 4º cuadrante";
		}else if (x == 0 && y > 0) {
			posicion = "El punto se encuentra entre el 1º y el 2º cuadrante";
		}else if (x < 0 && y == 0) {
			posicion = "El punto se encuentra entre el 2º y el 3º cuadrante";
		}else if (x == 0 && y < 0) {
			posicion = "El punto se encuentra entre el 3º y el 4º cuadrante";
		}
		return posicion;
	}
}