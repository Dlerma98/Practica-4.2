package ParteA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Inicio del programa");

		obtenerModulos();

		System.out.println("Fin del programa");
	}

	public static void obtenerModulos() {

		try {
			File myObj = new File("./Files/modulos.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {

				String data = myReader.nextLine();
				String[] dividir = data.split("&");
				String id = dividir[0];
				String nombre = dividir[1];
				String curso = dividir[2];
				String horas = dividir[3];
				String profesor = dividir[4];
				Modulo modulos = new Modulo(id, nombre, curso, horas, profesor);

				Alumno[] ejemplo = parteA(dividir[0]);
				System.out.println("Asignatura: " + modulos.getNombre());
				System.out.println("Curso: " + modulos.getCurso());
				System.out.println("Horas: " + modulos.getHoras());
				System.out.println("Profesor/a: " + modulos.getProfesor());

				System.out.println("Alumnos: ");
				for (int i = 0; i < ejemplo.length; i++) {
					System.out.println(ejemplo[i].nombre + " " + ejemplo[i].apellidos);
				}

				System.out.println("\n--------------------------------\n");

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static Alumno[] parteA(String num) {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		try {
			File myObj = new File("./Files/modulo_alumno.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] dividir = data.split(",");
				String idProfesor = dividir[0];
				String idAlumno = dividir[1];
				if (num.equals(idProfesor)) {
					try {
						File myObj1 = new File("./Files/alumnos.txt");
						Scanner myReader1 = new Scanner(myObj1);
						while (myReader1.hasNextLine()) {

							String data1 = myReader1.nextLine();
							String[] dividir1 = data1.split("&");
							String id = dividir1[0];

							if (id.equals(idAlumno)) {
								String nombre = dividir1[1];
								String apellidos = dividir1[2];
								String dni = dividir1[3];
								String email = dividir1[4];
								String direccion = dividir1[5];
								String telefono = dividir1[6];
								Alumno alumnos = new Alumno(id, nombre, apellidos, dni, email, direccion, telefono);

								lista.add(alumnos);
							}
						}
						myReader1.close();
					} catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}

				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		Alumno[] mod = new Alumno[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			mod[i] = lista.get(i);
		}
		return mod;
	}

}