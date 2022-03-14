package modelo;

import java.util.ArrayList;

import java.util.Scanner;

import vista.Menu;



public class EstudianteDAO {

	public EstudianteDAO() {

	}

	

	Menu conexionMenu = new Menu();

	Scanner entrada = new Scanner(System.in);

	
	
	
	
	
	//CRUD
	

	public void crearEstudiante(Estudiante nuevoestudiante, ArrayList<Estudiante> directorioEstudiantes) {


		directorioEstudiantes.add(nuevoestudiante);

		
		conexionMenu.imprimeMensajesComplementarios(1);
	


	}

	public void leerEstudiante(ArrayList<Estudiante> directorioEstudiantes) {
		

		Menu.imprimirEstudiante(buscarEstudiante(directorioEstudiantes));

	}
	
	

	public void actualizarEstudiante(ArrayList<Estudiante> directorioEstudiantes) {

		
		conexionMenu.recibeDatosActualizar(buscarEstudiante(directorioEstudiantes));
		
		conexionMenu.imprimeMensajesComplementarios(2);

	}
	
	

	public void eliminarEstudiante(ArrayList<Estudiante> directorioEstudiantes) {

		
		
		directorioEstudiantes.remove(buscarEstudiante(directorioEstudiantes));
		
		
		conexionMenu.imprimeMensajesComplementarios(3);


	}

	
	
	
	// METODOS COMPLEMENTARIOS
	

	public Estudiante buscarEstudiante(ArrayList<Estudiante> directorioEstudiantes) {

		String correoIngresado = conexionMenu.recibeCorreoInstitucional();
		
		Estudiante estudianteEncontrado;

		for (int i = 0; i < directorioEstudiantes.size(); i++) {

			if (directorioEstudiantes.get(i).getCorreo_institucional().equalsIgnoreCase(correoIngresado)) {

				estudianteEncontrado = directorioEstudiantes.get(i);

				return estudianteEncontrado;

			}

		}

		return null;

	}
	

	public void mostrarTodo(ArrayList<Estudiante> directorioEstudiantes) {

		
		conexionMenu.imprimeMensajesComplementarios(4);
		

		for (int i = 0; i < directorioEstudiantes.size(); i++) {

			Menu.imprimirEstudiante(directorioEstudiantes.get(i));

		}

	}

}
