package Punto_Seis;

public class Contacto {
	private String nombre;
	private int telefono;
	private String organizacion;
	
	
	public Contacto(String nombre, int telefono, String organizacion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.organizacion = organizacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}
	
	

}
