package controlador;



import java.util.Scanner;


import modelo.EstudianteDAO;
import modelo.EstudianteDTO;
import vista.Menu;

public class Controlador {
	
	
	public Controlador() {
		
		
	}
	
	EstudianteDAO controlaDAO = new EstudianteDAO();
	
	EstudianteDTO DTO = new EstudianteDTO();
	
	Menu controlaMenu = new Menu();
	
	

	Scanner entrada = new Scanner(System.in);

	

	

	public void controlaOpcion() {

		int op = 0;

		while (op != 6) {

			op = controlaMenu.imprimeMenu();

			switch (op) {

			case 1:

				controlaDAO.crearEstudiante(controlaMenu.recibeDatosEstudiante(),DTO.getDirectorioEstudiantes());
				
				break;

			case 2:

				controlaDAO.leerEstudiante(DTO.getDirectorioEstudiantes());
				
				break;

			case 3:

				controlaDAO.actualizarEstudiante(DTO.getDirectorioEstudiantes());

				break;

			case 4:

				controlaDAO.eliminarEstudiante(DTO.getDirectorioEstudiantes());

				break;

			case 5:

				controlaDAO.mostrarTodo(DTO.getDirectorioEstudiantes());

				break;

			case 6:

				
				System.out.println("\n" + "Hasta la próxima." + "\n");
				

				break;

			/*default:

				
				System.out.println("\n" + "Opción incorrecta." + "\n");
				
				
				controlaMenu.imprimeMenu();*/

			}

		}

	}
	
	
}
