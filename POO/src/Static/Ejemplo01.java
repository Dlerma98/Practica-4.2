package Static;

public class Ejemplo01 {
	public static void main(String[] args) {
		
	System.out.println(Matematicas.pi);
	
	System.out.println(Matematicas.potencia(2, 8));
	

	//Cuando crear atributos estaticos de una clase

	/* Cuando sean valores fijos que no van a cambiar y sirvan
	para acceder en cualquier parte del programa. Ej (El numero PI)
	Ademas el atributo estatico no representara el estado de ningun objeto */
	
	
	
	//Cuando crear metodos estaticos de una clase
	
	/*Cuando sean metodos que reciben (o no) parametros los cuales procesara
	 * para devolver un resultado y nunca cambiara el numero de un atributo de 
	 * esa clase */
	/*Tambien puede ser que accedan a atributos de la clase SOLAMENTE para leer
	 * su valor ya que deberia ser un VALOR CONSTANTE */
	}
}
