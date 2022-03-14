package modelo;

import java.util.ArrayList;

public class EstudianteDTO {
	
	
	private ArrayList<Estudiante>directorioEstudiantes;
	
	private EstudianteDAO estudianteDAO;
	
	
	public EstudianteDTO (){
		
		directorioEstudiantes = new ArrayList<Estudiante>();
		
		estudianteDAO = new EstudianteDAO();
		
	}

	public ArrayList<Estudiante> getDirectorioEstudiantes() {
		return directorioEstudiantes;
	}

	public void setDirectorioEstudiantes(ArrayList<Estudiante> directorioEstudiantes) {
		this.directorioEstudiantes = directorioEstudiantes;
	}

	public EstudianteDAO getEstudianteDAO() {
		return estudianteDAO;
	}

	public void setEstudianteDAO(EstudianteDAO estudianteDAO) {
		this.estudianteDAO = estudianteDAO;
	}
	
	

}
