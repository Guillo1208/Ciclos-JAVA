package Punto_Ocho;


public class Escuela {
	
	Alumno [] alumnos;
	
	public Escuela() {
		this.alumnos=new Alumno[9];
	}
	
	public Escuela(int tamaño) {
		this.alumnos=new Alumno[tamaño];
	}
	
	public boolean Cuposllenos() {
		for (int i=0 ; i<alumnos.length ; i++) {
			if(alumnos[i] == null ) {
				return false;
			}
		}
		return true;
	}
	
	public void AgregarAlumno(Alumno a) {
		if (Cuposllenos()) {
			System.out.println("No hay cupos disponibles en el curso");
		}else {
			boolean encontrado = false;
			for (int i=0 ; i<alumnos.length && !encontrado ; i++) {
				if(alumnos[i]==null) {
					alumnos[i]=a;
					encontrado=true;
				}	
			}
			if (encontrado) {
				System.out.println("Se ha matriculado exitosamente");
			} else {
				System.out.println("No se ha podido matricular");
			}
			
			} 
		
	}
	
	
	public void mostrar() {
		System.out.println("NOMBRE    |   ID           |    NOTA");
		for (int i=0 ; i<alumnos.length ; i++) {
			if(alumnos[i] != null) {
				
				System.out.println(alumnos[i].getNombre()+"   |   "+alumnos[i].getId()+"   |   "+alumnos[i].getResultado());
			}	
		}
	}
	
	public void buscaralumno(int cedula) {
		boolean encontrado = false;
		for (int i=0 ; i<alumnos.length && !encontrado; i++) {
			if(alumnos[i] != null && alumnos[i].getId()==cedula) {
				System.out.println("================================");
				System.out.println("ALUMNO MATRICULADO EN LA ESCUELA");
				System.out.println("SU NOMBRE ES : "+ alumnos[i].getNombre() );
				System.out.println("SU CEDULA ES : "+alumnos[i].getId());
				System.out.println("SU NOTA ES   : "+alumnos[i].getResultado());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("NO SE HA ENCONTRADO EN LA ESCUELA EL ALUMNO CONSULTADO");
		}
	}
	
	public void mostraraprobados() {
		boolean encontrado = false;
		System.out.println("lOS ALUMNOS APROBADOS SON : ");
		for (int i=0 ; i<alumnos.length ; i++) {
			if(alumnos[i] != null && alumnos[i].getResultado().equalsIgnoreCase("SI")) {
				System.out.println(alumnos[i].getNombre());
				encontrado=true;
			}
		}
	}
	
	
	
	
	
	
	
	

}
