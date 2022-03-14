package vista;

import java.util.*;

import modelo.Estudiante;


public class Menu {
	
	Scanner entrada = new Scanner (System.in);
	
	
	public String recibeCorreoInstitucional(){
		
		
		System.out.println("\n" + "Ingresa el correo institucional del estudiante a buscar: ");
		
		
		String correoInstitucionalIngresado = entrada.nextLine();
		
		
		return correoInstitucionalIngresado;
	}
	
	
	public Estudiante recibeDatosEstudiante() {
		
		
		Estudiante nuevoEstudiante = new Estudiante();
		
		
		System.out.println("Ingresa nombres del estudiante: ");

		nuevoEstudiante.setNombres(entrada.nextLine());

		System.out.println("Ingresa apellido del estudiante: ");

		nuevoEstudiante.setApellidos(entrada.nextLine());

		System.out.println("Ingresa fecha de nacimiento del estudiante (AAA/MM/DD): ");

		nuevoEstudiante.setFecha_de_nacimiento(entrada.nextLine());

		System.out.println("Ingresa el correo institucional del estudiante: ");

		nuevoEstudiante.setCorreo_institucional(entrada.nextLine());

		System.out.println("Ingresa el correo personal del estudiante: ");

		nuevoEstudiante.setCorreo_personal(entrada.nextLine());

		System.out.println("Ingresa el teléfono celular del estudiante: ");

		nuevoEstudiante.setNumero_celular(Long.parseLong(entrada.nextLine()));

		System.out.println("Ingresa el teléfono fijo del estudiante: ");

		nuevoEstudiante.setNumero_fijo(Integer.parseInt(entrada.nextLine()));

		System.out.println("Ingresa el prográma acádemico que cursa el estudiante en este momento: ");

		nuevoEstudiante.setPrograma_academico(entrada.nextLine());
		
		
		return nuevoEstudiante;
		
	}
	
	public static void imprimirEstudiante(Estudiante estudianteIngresado) {
		
		Estudiante estudianteAImprimir = estudianteIngresado;
		
		System.out.println(estudianteAImprimir);
	}
	
	
	public void recibeDatosActualizar(Estudiante estudianteaActualizar) {
		
		
		System.out.println("\n" + "Ingresa el nuevo correo personal: " + "\n");
		

		estudianteaActualizar.setCorreo_personal(entrada.nextLine());

		
		System.out.println("\n" + "Ingresa el nuevo teléfono celular: " + "\n");
		

		estudianteaActualizar.setNumero_celular(Long.parseLong(entrada.nextLine()));

		
		System.out.println("\n" + "Ingresa el nuevo teléfono fijo: " + "\n");
		

		estudianteaActualizar.setNumero_fijo(Integer.parseInt(entrada.nextLine()));

		
		System.out.println("\n" + "Ingresa el nuevo prográma acádemico: " + "\n");
		

		estudianteaActualizar.setPrograma_academico(entrada.nextLine());

		
		System.out.println("\n" + "El estudiante actualizado." + "\n");
		
	}
	
	
	public int leeEntero(String mensaje) {
		
		int dato = 0;
	
		boolean entero = false;
		
		do {
			
			System.out.println(mensaje);
			
			try {
				dato = entrada.nextInt();
				
				entero = true;
				
			}catch(InputMismatchException ex) {
				
				System.out.println("Dato Invalido. Ingresa el dato nuevamente." + "\n");
				dato = 0;
				
			}catch (Exception ex) {
				
				System.out.println("Dato Invalido. Ingresa el dato nuevamente." + "\n");
				dato = 0;
				
			} finally {
				
				entrada.nextLine();
				
				System.out.println(".");
		
			}
			
			
		}while (entero = false);
		
	
		
		return dato;
	}
	
	public void imprimeMensajesComplementarios(int codigo) {
		
		if (codigo==1) {
			
			System.out.println("\n" + "El estudiante fue ingresado" + "\n");
			
		}
			
		if (codigo==2) {
			
			System.out.println("\n" + "El estudiante ingresado fue actualizado" + "\n");
			
		}
			
		if(codigo==3) {
			
			System.out.println("\n" + "El estudiante ingresado fue eliminado" +  "\n");
			
		}
		
		if(codigo==4) {
			
			System.out.println("\n"+"ESTUDIANTES REGISTRADOS"+"\n");
			
		}
		
		else {
			
			System.out.println("Codigo Invalido");
		}
			
		
		
	}
	
	
	public int imprimeMenu() {
		
		
		System.out.println(
				
				"***DIRECTORIO DE ESTUDIANTES***" + "\n"+
				"Seleccione una opción: " + "\n"+
				"1. Ingresar estudiante" +	"\n"+
				"2. Buscar estudiante" + "\n" + 
				"3. Modificar estudiante" + "\n" +
				"4. Eliminar estudiante" + "\n" +
				"5. Ver directorio de estudiantes" + "\n" +
				"6. Salir" + "\n"+
				"\n");
		
		
		
		int opcion = leeEntero("Ingresa tu opción: ");
		
		return
				opcion;
		
	}

	

}
