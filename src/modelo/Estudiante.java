package modelo;



public class Estudiante {
	
	
	private String nombres;
	
	private String apellidos;
	
	private String fecha_de_nacimiento;
	
	private String correo_institucional;
	
	private String correo_personal;
	
	private Long numero_celular;
	
	private int numero_fijo;
	
	private String programa_academico;
	
	
	
	
	public Estudiante () {}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombre) {
		this.nombres = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}


	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getCorreo_institucional() {
		return correo_institucional;
	}


	public void setCorreo_institucional(String correo_institucional) {
		this.correo_institucional = correo_institucional;
	}


	public String getCorreo_personal() {
		return correo_personal;
	}


	public void setCorreo_personal(String correo_personal) {
		this.correo_personal = correo_personal;
	}


	public Long getNumero_celular() {
		return numero_celular;
	}


	public void setNumero_celular(Long numero_celular) {
		this.numero_celular = numero_celular;
	}


	public int getNumero_fijo() {
		return numero_fijo;
	}


	public void setNumero_fijo(int numero_fijo) {
		this.numero_fijo = numero_fijo;
	}


	public String getPrograma_academico() {
		return programa_academico;
	}


	public void setPrograma_academico(String programa_academico) {
		this.programa_academico = programa_academico;
	}

	@Override
	public String toString() {
		
		return  "Nombres: " + nombres + "\n" +
				"Apellidos: " + apellidos + "\n" +
				"Fecha de Nacimiento:" + fecha_de_nacimiento + "\n" +
				"Correo institucional: " + correo_institucional + "\n" +
				"Correo personal: " + correo_personal + "\n" +
				"Teléfono celular: " + numero_celular + "\n" +
				"Teléfono fijo: " + numero_fijo + "\n" + 
				"Prográma acádemico: " + programa_academico+ "\n";
	}




	


	
	
	
	
	
	/*public Estudiante (String nom, String ap, int agno, int mes, int dia, String correoi, String correop, int numcel, int numf, String programa ) {
		
		nombre = nom;
		
		apellidos = ap;
		
		GregorianCalendar calendario = new GregorianCalendar (agno,mes-1,dia);
		
		correo_institucional = correoi;
		
		correo_personal = correop;
		
		numero_celular = numcel;
		
		numero_fijo = numf;
		
		programa_academico = programa;
		
	}*/
	
	
	
	
}
