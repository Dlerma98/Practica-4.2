
//David Garcia Lerma
//Practica 1.3

import java.util.Scanner;
public class Practica {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inicio de programa");
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine();
		
		System.out.print("Introduce el primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = teclado.nextInt();

		System.out.print("Introduce el tercer numero: ");
		int num3 = teclado.nextInt();
		
		System.out.print("Introduce un numero con decimales: ");
		double num4 = teclado.nextDouble();
		
		if (num1 < 0) {
			num1 = Math.abs(num1);
		}
		
		if (num2 < 0) {
			num2 = Math.abs(num2);
		}
		
		if (num3 < 0) {
			num3 = Math.abs(num3);
		}
	
		int resultado = num2 * num3 + num1;
		
		int techo = (int)Math.ceil(num4);
		int suelo = (int)Math.floor(num4);
		
		System.out.println("El texto introducido es " + texto);
		System.out.println("El resultado es " + resultado);
		System.out.println("Techo del numero real es " + techo);
		System.out.println("El suelo del numero real es " + suelo);
				
	}

}
