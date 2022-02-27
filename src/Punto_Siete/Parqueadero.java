package Punto_Siete;


public class Parqueadero {
	
	private Auto [] autos;
	
	public Parqueadero() {
		this.autos = new Auto[5];
	}
		
	public Parqueadero(int tamaño) {
		this.autos = new Auto[tamaño];
	}
	
	public boolean parqueaderolleno() {
		for (int i=0 ; i<autos.length ; i++) {
			if(autos[i] == null ) {
				return false;
			}
		}
		return true;
	}
	
	public void sacarvehiculo(String sacar) {
		boolean encontrado=false;
		for (int i=0 ; i<autos.length && !encontrado ; i++) {
			if(autos[i] != null && autos[i].getPlaca().equalsIgnoreCase(sacar) ) {
				autos[i]=null;
				encontrado=true;
				System.out.println("Vehiculo eliminado");
				
			}
		}
		if (!encontrado) {
			System.out.println("No se encontro vehiculo en el parqueadero");
		}
		
	}

	public void consultar(String p) {
		boolean encontrado = false;
		for (int i=0 ; i<autos.length && !encontrado; i++) {
			if(autos[i] != null && autos[i].getPlaca().equalsIgnoreCase(p)) {
				System.out.println("===== Vehiculo encontrado =====");
				System.out.println("Nombre Propietario : "+autos[i].getNombre());
				System.out.println("Telefono Propietario : "+autos[i].getTelefono());
				System.out.println("Placa del vehiculo : "+autos[i].getPlaca());
				System.out.println("Marca del vehiculo : "+autos[i].getMarca());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado vehiculo");
		}
	}

	public void ingresarauto(Auto a) {
		if (parqueaderolleno()) {
			System.out.println("El parqueadero no tiene cupo");
		}else {
			boolean encontrado = false;
			for (int i=0 ; i<autos.length && !encontrado ; i++) {
				if(autos[i]==null) {
					autos[i]=a;
					encontrado=true;
				}	
			}
			if (encontrado) {
				System.out.println("Se ha ingresado el vehiculo");
			} else {
				System.out.println("No se ha podido ingresar");
			}
			
			} 
		
	}
	
	
	
	
		
	}


	


