package Punto_Seis;




public class Aplicacion {
		
	private Contacto[] contactos;
	
	public Aplicacion() {
		this.contactos = new Contacto[3];
	}
	
	public Aplicacion(int tamaño) {
		this.contactos = new Contacto[tamaño];
	}
	
	public void aniadircontacto(Contacto c) {
		if (ValidacionContacto(c)) {
			System.out.println("El contacto con ese telefono ya existe");
		}else if (agendallena()) {
			System.out.println("la agenda ya esta llena");
		}else {
			boolean encontrado = false;
			for (int i=0 ; i<contactos.length && !encontrado ; i++) {
				if(contactos[i]==null) {
					contactos[i]=c;
					encontrado=true;
				}	
			}
			if (encontrado) {
				System.out.println("Se ha añadido");
			} else {
				System.out.println("No se ha podido añadir");
			}
			
			} 
		}
		
	
	
	public void mostrar() {
		for (int i=0 ; i<contactos.length ; i++) {
			if(contactos[i] != null) {
				System.out.println(contactos[i].getNombre()+" "+contactos[i].getTelefono()+" "+contactos[i].getOrganizacion());
			}	
		}
	}
	
	public boolean ValidacionContacto (Contacto c) {
		for (int i=0 ; i<contactos.length ; i++) {
			if(contactos[i] != null && c.equals(contactos[i])) {
				return true;
			}	
		}
		return false;
	}
	
		
	public boolean agendallena() {
		for (int i=0 ; i<contactos.length ; i++) {
			if(contactos[i] == null ) {
				return false;
			}
		}
		return true;
	}
	
	public void buscarcontacto(String nombre) {
		boolean encontrado = false;
		for (int i=0 ; i<contactos.length && !encontrado; i++) {
			if(contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Contacto encontrado");
				System.out.println("Su nombre es : "+contactos[i].getNombre());
				System.out.println("Su telefono es : "+contactos[i].getTelefono());
				System.out.println("la organizacion es : "+contactos[i].getOrganizacion());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado contacto");
		}
	}
	
	public void eliminarcontacto(String c) {
		boolean encontrado=false;
		for (int i=0 ; i<contactos.length && !encontrado ; i++) {
			if(contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(c) ) {
				contactos[i]=null;
				System.out.println("Contacto eliminado exitosamente");
				encontrado=true;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha eliminado contacto");
		}
		
	}
	
	
}

